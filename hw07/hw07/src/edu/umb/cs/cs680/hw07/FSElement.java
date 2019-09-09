package edu.umb.cs.cs680.hw07;

import java.util.Date;


public class FSElement {
	private ApfsDirectory parent;
	private String name;
	private Date created;
	private int size;

	public FSElement(){
		
	}
	
	public FSElement(ApfsDirectory parent, String name, int size, Date created) {
		this.name = name;
		this.size = size;
		this.created = created;
		this.parent = parent;
	}
	
	public ApfsDirectory getParent(){
		return this.parent;
	}
	
	public boolean isLeaf(){
		return false;
	}
	
	public boolean isLink(){
		return false;
	}
		
	public int getSize(){
		return this.size;
	}
	
	public String getName(){
		return this.name;
	}
	
	public Date getCreationTime(){
		return this.created;
	}

}
