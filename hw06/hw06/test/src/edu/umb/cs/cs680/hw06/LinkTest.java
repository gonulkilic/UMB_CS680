package edu.umb.cs.cs680.hw06;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Date;

public class LinkTest {
	FileSystem fs = FileSystem.getInstance();
	static Date d1 = new Date();
	Directory root;
	Link a,b,c,d;
	
	private String[] dirToStringArray(Link l){
		String[] dirInfo = {
			String.valueOf(l.isLink()), l.getName(),  
			l.getParent().getName(),
			l.getTargetName(),
			String.valueOf(l.getTargetSize())
		};
		return dirInfo; 
	}
	@Test
	public void test1LinkTargetSizeName() {
		root = new Directory(null, "RootDir", 0, d1);
		Directory system = new Directory(root, "system", 0, d1);
		Directory home = new Directory(root, "home", 0, d1);
		Directory files = new Directory(home, "files", 0, d1);
		File f1 = new File(files, "notes", 3000, d1);
		File f2 = new File(files, "notes1", 5000, d1);
		File f3 = new File(files, "notes2", 8000, d1);
		fs.setRoot(root);
		fs.AddChild(root, home);
		fs.AddChild(root, system);
		fs.AddChild(home, files);
		fs.AddChild(files, f1);
		fs.AddChild(files, f2);
		fs.AddChild(files, f3);
	
		 a = new Link(home, "a", 0, d1, f1);
		 
		String[] expected = {"true", "a (Link)", "home", "notes", "3000"}; 
		assertArrayEquals(expected, dirToStringArray(a) );
	}
	
	@Test
	public void test2LinkTargetSizeName() {
		root = new Directory(null, "RootDir", 0, d1);
		Directory system = new Directory(root, "system", 0, d1);
		Directory home = new Directory(root, "home", 0, d1);
		Directory files = new Directory(home, "files", 0, d1);
		File f1 = new File(files, "notes", 3000, d1);
		File f2 = new File(files, "notes1", 5000, d1);
		File f3 = new File(files, "notes2", 8000, d1);
		fs.setRoot(root);
		fs.AddChild(root, home);
		fs.AddChild(root, system);
		fs.AddChild(home, files);
		fs.AddChild(files, f1);
		fs.AddChild(files, f2);
		fs.AddChild(files, f3);
	
		 a = new Link(home, "a", 0, d1, f1);
		
		 b = new Link(files, "b", 0, d1, a);
	
		String[] expected = {"true", "b (Link)", "files", "a (Link)", "0"}; 
		assertArrayEquals(expected, dirToStringArray(b) );
	}
}
