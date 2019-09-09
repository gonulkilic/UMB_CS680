package edu.umb.cs.cs680.hw05;


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
		
		String[] expected = {"true", "notes", "files", "3000"};
		Directory root = new Directory(null, "RootDir", 0, d1);
		Directory system = new Directory(root, "system", 0, d1);
		Directory home = new Directory(root, "home", 0, d1);
		Directory files = new Directory(home, "files", 0, d1);	
		File actual = new File(files, "notes", 3000, d1);
		fs.setRoot(root);
		fs.addChild(root, home);
		fs.addChild(root, system);
		fs.addChild(home, files);
		fs.addChild(files, actual);
		assertArrayEquals(expected, dirToStringArray(actual) ); 
		
	}
	
	
}