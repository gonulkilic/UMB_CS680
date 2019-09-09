package edu.umb.cs.cs680.hw05;


import java.util.LinkedList;
import java.util.Date;
import java.util.Iterator;

public class Directory extends FSElement{
	private String name;
	private Date created;
	private Directory parent;
	int size=0;
	private LinkedList<FSElement> children = new LinkedList<FSElement>();
	
	public Directory(Directory parent, String name, int size, Date created) {
			this.name = name;
			this.size = size;
			this.created = created;
			this.parent = parent;
		
	}
	 
	@Override
	public boolean isFile(){
		return false;
	}
	@Override
	public int getSize(){
		return this.size;
	}
	@Override
	public Date getCreationTime(){
		return this.created;
	}
	public String getName(){
		return this.name;
	}
	
	public Directory getParent(){
		return this.parent;
	}
    public LinkedList<FSElement> getChildren() {
		return children;	
	}
	
	public void appendChild(FSElement child){
		children.add(child);
	}
	
	public void addChild(Directory parent, FSElement child){
		parent.appendChild(child);
	}
	
	
	public void getSubDirectories() {
	
		Iterator<FSElement> childIterator = getChildren().iterator();
		while(childIterator.hasNext()) {
			FSElement e = childIterator.next();
			 if(e.isFile()){
			    System.out.println(" -> "+ e.getName());
			 }
			 else {
				 System.out.println(" -----");
				 System.out.println("|"+e.getName() +"|");
				 System.out.println(" -----");
				 ((Directory) e).getSubDirectories();
			 }
		}
		
	}
	 

	public int getTotalSize(){
		Iterator<FSElement> childIterator = getChildren().iterator();
		int count = 0;
		
		while(childIterator.hasNext()) {
			FSElement e = childIterator.next();
			 if(e.isFile()){
			    count += e.getSize();
			 }
			 else {
				 count +=0;
				 ((Directory) e).getSubDirectories();
			 }
		}
		return count;
	}
}
