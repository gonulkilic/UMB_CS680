package edu.umb.cs.cs680.hw07;

import java.util.Date;

public class FileSystem {
	protected String name;
	protected int capacity;
	protected int id;
	static Date d1 = new Date();
	static FileSystem instance = null;
	FSElement root = createDefaultRoot();
	ApfsDirectory rootDir = new ApfsDirectory(null, "RootDir" , 0, d1);

	public static FileSystem getInstance() {
		if (instance == null) {
			instance = new FileSystem();
		}
		return instance;
	}
	
	public FSElement initFileSystem(String name, int capacity) {
		this.name = name;
		this.capacity = capacity;
		
		if(!root.isLeaf() && capacity >= root.getSize()) {
			setRoot(root);
			this.id = root.hashCode();
			return root;
		}
		else {
			return null;
		}
	}
	
	protected FSElement createDefaultRoot() {
		FSElement rootDirs = new FSElement(null, "root" , 0, d1);
		return rootDirs;
	}
	
	
	public void setRoot(FSElement root) {
		this.root = root;
	}
	
	public int getCapacity() {
		return capacity;
	}
	
	public int getUsed() {
		return root.getSize();
	}
	
	public void AddChild(ApfsDirectory parent, FSElement child){
		parent.appendChild(child);
	}
	
	public ApfsDirectory getRootDir() {
		return rootDir;
	}
	
}
