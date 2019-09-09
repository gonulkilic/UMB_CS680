package edu.umb.cs.cs680.hw06;

import java.util.Date;


public class FSElement {
	private Directory parent;
	private String name;
	private Date created;
	private int size;

	public FSElement(){
		
	}
	
	public FSElement(Directory parent, String name, int size, Date created) {
		this.name = name;
		this.size = size;
		this.created = created;
		this.parent = parent;
	}
	
	public Directory getParent(){
		return this.parent;
	}
	
	public boolean isFile(){
		return true;
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
