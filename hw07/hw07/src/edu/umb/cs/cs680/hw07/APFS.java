package edu.umb.cs.cs680.hw07;

import java.util.LinkedList;
import java.util.Date;
import java.util.Iterator;

public class APFS extends FileSystem {
	private Date d1 = new Date();
	private static APFS instance = null;
	private ApfsDirectory root = new ApfsDirectory(null, "root" , 0, d1);
	
	public static APFS getInstance() {
		if (instance == null) {
			instance = new APFS();
		}
		return instance;
	}
	
	private LinkedList<ApfsDirectory> rootDir = new LinkedList<ApfsDirectory>();
	
	@Override
	protected FSElement createDefaultRoot() {
		FSElement rootDirs = new FSElement(null, "root" , 0, d1);
		return rootDirs;
	}
	
	public void setRootDir(ApfsDirectory root) {
		this.root = root;
	}
		
	public LinkedList<ApfsDirectory> getRootDirs() {
		return rootDir;
	}
}