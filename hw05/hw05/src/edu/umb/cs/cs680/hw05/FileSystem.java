package edu.umb.cs.cs680.hw05;


import java.util.Date;

public class FileSystem {
	static Date d1 = new Date();
	static Date m1 = new Date();
	static FileSystem instance = null;
	static Directory rootDir = new Directory(null, "RootDir" , 0, d1);

	private  FileSystem(){
		
	}
	public static FileSystem getInstance() {
		if (instance == null) {
			instance = new FileSystem();
		}
		return instance;
	}
	
	public void setRoot(Directory root) {
		root = rootDir;
	}
	public void addChild(Directory parent, FSElement child){
		parent.appendChild(child);
	}
	public Directory getRootDir() {
		return rootDir;
	}
	
	public Directory makeDir(Directory parent, String name, int size, Date d){
		Directory dir = new Directory (parent, name, size, d);
		return dir;
	}
	
	public File makeFile(Directory parent, String name, int size, Date d){
		File file = new File (parent, name, size, d);
	return file;
	}
	
	public int getTotalSizeOfDir(FSElement element){
		return element.getSize();
	}
	
}
