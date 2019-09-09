package edu.umb.cs.cs680.hw07;

import java.util.Date;

public class ApfsLink extends ApfsElement {
	static Date d1 = new Date();
	private String name;

	ApfsElement target;
	public ApfsElement getTarget() {
		return target;
	}


	public ApfsLink(ApfsDirectory parent, String name, int size, Date created, ApfsElement target) 
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
