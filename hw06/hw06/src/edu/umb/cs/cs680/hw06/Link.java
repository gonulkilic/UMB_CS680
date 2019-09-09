package edu.umb.cs.cs680.hw06;

import java.util.Date;

public class Link extends FSElement {
	static Date d1 = new Date();
	private String name;

	FSElement target;
	public FSElement getTarget() {
		return target;
	}


	public Link(Directory parent, String name, int size, Date created, FSElement target) 
	{
		
		super(parent, name, size, d1);
		this.name = name;
		this.target = target;
	}
	public int getSize(){
		return 0;
	}
	
	public int getTargetSize(){
		return target.getSize();
	}
	
	@Override
	public boolean isLink(){
		return true;
	}
	
	public String getName(){
		return this.name + " (Link)";
	}
	
	public String getTargetName(){
		return target.getName();
	}


}
