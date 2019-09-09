package edu.umb.cs.cs680.hw06;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Date;


public class FileTest {
	
	FileSystem fs = FileSystem.getInstance();
	static Date d1 = new Date();
	static Date m1 = new Date();
	
	private String[] dirToStringArray(File f){
		String[] dirInfo = {
			String.valueOf(f.isFile()), 
			f.getName(),  
			f.getParent().getName(),
			String.valueOf(f.getSize())
		};
		return dirInfo; 
	}

	
	@Test
	public void testFile() {
		
		String[] expected = {"true", "notes1", "files", "5000"};
		Directory root = new Directory(null, "RootDir", 0, d1);
		Directory system = new Directory(root, "system", 0, d1);
		Directory home = new Directory(root, "home", 0, d1);
		Directory files = new Directory(home, "files", 0, d1);	
		File actual = new File(files, "notes1", 5000, d1);
		fs.setRoot(root);
		fs.AddChild(root, home);
		fs.AddChild(root, system);
		fs.AddChild(home, files);
		fs.AddChild(files, actual);
		assertArrayEquals(expected, dirToStringArray(actual) ); 
		
	}
	
	
}