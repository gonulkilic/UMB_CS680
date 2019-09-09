package edu.umb.cs.cs680.hw08;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Date;


public class ApfsFileTest {
	
	FileSystem fs = FileSystem.getInstance();
	static Date d1 = new Date();
	static Date m1 = new Date();
	
	private String[] dirToStringArray(ApfsFile f){
		String[] dirInfo = {
			String.valueOf(f.isLeaf()), 
			f.getName(),  
			f.getParent().getName(),
			String.valueOf(f.getSize())
		};
		return dirInfo; 
	}

	
	@Test
	public void testFile() {
		
		String[] expected = {"true", "notes", "files", "3000"};
		ApfsDirectory root = new ApfsDirectory(null, "RootDir", 0, d1, "Gonul", m1);
		ApfsDirectory system = new ApfsDirectory(root, "system", 0, d1, "Gonul", m1);
		ApfsDirectory home = new ApfsDirectory(root, "home", 0, d1, "Gonul", m1);
		ApfsDirectory files = new ApfsDirectory(home, "files", 0, d1, "Gonul", m1);	
		ApfsFile actual = new ApfsFile(files, "notes", 3000, d1, "Gonul", m1);
		fs.setRoot(root);
		fs.AddChild(root, home);
		fs.AddChild(root, system);
		fs.AddChild(home, files);
		fs.AddChild(files, actual);
		assertArrayEquals(expected, dirToStringArray(actual) ); 
		
	}
	
	
}