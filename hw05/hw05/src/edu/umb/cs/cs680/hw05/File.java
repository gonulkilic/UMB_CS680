package edu.umb.cs.cs680.hw05;


import java.util.Date;

public class File extends FSElement{
	private String name;
	private Date created;
	private Directory parent;
	private int size;
	public File(Directory parent, String name, int size, Date created) {
		this.name = name;
		this.created = created;
		this.size = size;
		this.parent = parent;
	}

	public int getSize(){
		return this.size;
	}
	public String getName(){
		return this.name;
	}
	
	@Override
	public boolean isFile(){
		return true;
	}
	public Directory getParent(){
		return this.parent;
	}

}
