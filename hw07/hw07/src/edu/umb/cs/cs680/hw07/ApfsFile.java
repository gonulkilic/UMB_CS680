package edu.umb.cs.cs680.hw07;

import java.util.Date;

public class ApfsFile extends ApfsElement {
	private String name;
	private Date created;
	private ApfsDirectory parent;
	private int size;
	public ApfsFile(ApfsDirectory parent, String name, int size, Date created) {
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
	public boolean isLeaf(){
		return true;
	}
	
	public ApfsDirectory getParent(){
		return this.parent;
	}
}
