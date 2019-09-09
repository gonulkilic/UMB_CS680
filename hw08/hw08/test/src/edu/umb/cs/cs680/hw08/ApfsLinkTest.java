package edu.umb.cs.cs680.hw08;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Date;

public class ApfsLinkTest {
	FileSystem fs = FileSystem.getInstance();
	static Date d1 = new Date();
	static Date m1 = new Date();
	ApfsDirectory root;
	ApfsLink a,b,c,d;
	
	private String[] dirToStringArray(ApfsLink l){
		String[] dirInfo = {
			String.valueOf(l.isLink()), l.getName(),  
			l.getParent().getName(),
			l.getTargetName(),
			String.valueOf(l.getTargetSize())
		};
		return dirInfo; 
	}
	@Test
	public void test1ApfsLinkTargetSizeName() {
		root = new ApfsDirectory(null, "RootDir", 0, d1, "Gonul", m1);
		ApfsDirectory system = new ApfsDirectory(root, "system", 0, d1, "Gonul", m1);
		ApfsDirectory home = new ApfsDirectory(root, "home", 0, d1, "Gonul", m1);
		ApfsDirectory files = new ApfsDirectory(home, "files", 0, d1, "Gonul", m1);
		ApfsFile f1 = new ApfsFile(files, "notes", 3000, d1, "Gonul", m1);
		ApfsFile f2 = new ApfsFile(files, "notes1", 5000, d1, "Gonul", m1);
		ApfsFile f3 = new ApfsFile(files, "notes2", 8000, d1, "Gonul", m1);
		fs.setRoot(root);
		fs.AddChild(root, home);
		fs.AddChild(root, system);
		fs.AddChild(home, files);
		fs.AddChild(files, f1);
		fs.AddChild(files, f2);
		fs.AddChild(files, f3);
	
		 a = new ApfsLink(home, "a", 0, d1, "Gonul", m1, f1);
		 
		String[] expected = {"true", "a (Link)", "home", "notes", "3000"}; 
		assertArrayEquals(expected, dirToStringArray(a) );
	}
	
	@Test
	public void test2ApfsLinkTargetSizeName() {
		root = new ApfsDirectory(null, "RootDir", 0, d1, "Gonul", m1);
		ApfsDirectory system = new ApfsDirectory(root, "system", 0, d1, "Gonul", m1);
		ApfsDirectory home = new ApfsDirectory(root, "home", 0, d1, "Gonul", m1);
		ApfsDirectory files = new ApfsDirectory(home, "files", 0, d1, "Gonul", m1);
		ApfsFile f1 = new ApfsFile(files, "notes", 3000, d1, "Gonul", m1);
		ApfsFile f2 = new ApfsFile(files, "notes1", 5000, d1, "Gonul", m1);
		ApfsFile f3 = new ApfsFile(files, "notes2", 8000, d1, "Gonul", m1);
		fs.setRoot(root);
		fs.AddChild(root, home);
		fs.AddChild(root, system);
		fs.AddChild(home, files);
		fs.AddChild(files, f1);
		fs.AddChild(files, f2);
		fs.AddChild(files, f3);
	
		 a = new ApfsLink(home, "a", 0, d1, "Gonul", m1, f1);
		
		 b = new ApfsLink(files, "b", 0, d1, "Gonul", m1, a);
	
		String[] expected = {"true", "b (Link)", "files", "a (Link)", "0"}; 
		assertArrayEquals(expected, dirToStringArray(b) );
	}
	
}
