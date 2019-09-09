package edu.umb.cs.cs680.hw07;

import java.util.LinkedList;
import java.util.Date;
import java.util.Iterator;

public class ApfsDirectory extends ApfsElement{
	private String name;
	private Date created;
	private ApfsDirectory parent;
	int Size=0;
	private LinkedList<FSElement> children = new LinkedList<FSElement>();
	
	public ApfsDirectory(ApfsDirectory parent, String name, int Size, Date created) {
			this.name = name;
			this.Size = Size;
			this.created = created;
			this.parent = parent;
		
	}
	 
	@Override
	public boolean isLeaf(){
		return false;
	}
	public String getName(){
		return this.name;
	}
	
	public ApfsDirectory getParent(){
		return this.parent;
	}
	
	@Override
	public int getSize(){
		return this.Size;
	}
	
	@Override
	public Date getCreationTime(){
		return this.created;
	}

	public LinkedList<FSElement> getChildren() {
		return children;	
	}
	public void appendChild(FSElement child){
		children.add(child);
	}
	
	public void AddChild(ApfsDirectory parent, FSElement child){
		parent.appendChild(child);
	}
	
	public int getTotalSize(){
		Iterator<FSElement> childIterator = getChildren().iterator();
		int count = 0;
		
		while(childIterator.hasNext()) {
			FSElement e = childIterator.next();
			 if(e.isLeaf()){
			    count += e.getSize();
			 }
			 else {
				 count +=0;
				 ((ApfsDirectory) e).getSubDirectories();
			 }
		}
		return count;
	}
	
	public void getSubDirectories() {
	
		Iterator<FSElement> childIterator = getChildren().iterator();
		while(childIterator.hasNext()) {
			FSElement e = childIterator.next();
			 if(e.isLeaf()){
			    System.out.println(" -> "+ e.getName());
			 }
			 else {
				 System.out.println(" -----");
				 System.out.println("|"+e.getName() +"|");
				 System.out.println(" -----");
				 ((ApfsDirectory) e).getSubDirectories();
			 }
		}
		
	}

}
