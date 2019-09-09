package edu.umb.cs.cs680.hw08;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Date;

public class ApfsDirectoryTest{
	FileSystem fs = FileSystem.getInstance();
	static Date d1 = new Date();
	static Date m1 = new Date();

	private String[] dirToStringArray(ApfsDirectory d){
		String[] dirInfo = {
			String.valueOf(d.isLeaf()), d.getName(),  
			d.getParent().getName(),
			String.valueOf(d.getSize()),
			String.valueOf(d.getTotalSize())
		};
		return dirInfo; 
	}
	private String[] rootToStringArray(ApfsDirectory d){
		String[] dirInfo = {
			String.valueOf(d.isLeaf()), d.getName(),  
			String.valueOf(d.getParent()),
			String.valueOf(d.getSize()),
			String.valueOf(d.getTotalSize())
		};
		return dirInfo; 
	}
	@Test
	public void verifyApfsDirectoryEqualityRoot (){
		String[] expected = {"false", "RootDir", "null", "0", "0"};
		ApfsDirectory actual = new ApfsDirectory(null, "RootDir", 0, d1, "Gonul", m1);
		assertArrayEquals(expected, rootToStringArray(actual) ); 
		}
		
	@Test
	public void verifyApfsDirectoryEqualityHome ()
	{
		String[] expected = {"false", "Home", "RootDir", "0", "0"};
		ApfsDirectory root = new ApfsDirectory(null, "RootDir", 0, d1, "Gonul", m1);
		ApfsDirectory system = new ApfsDirectory(root, "system", 0, d1, "Gonul", m1);
		ApfsDirectory home = new ApfsDirectory(root, "home", 0, d1, "Gonul", m1);
		ApfsDirectory files = new ApfsDirectory(home, "files", 0, d1, "Gonul", m1);
		ApfsDirectory actual = new ApfsDirectory(root, "Home", 0, d1, "Gonul", m1);	
		fs.setRoot(root);
		fs.AddChild(root, home);
		fs.AddChild(root, system);
		fs.AddChild(home, files);
		fs.AddChild(root, actual);
		assertArrayEquals(expected, dirToStringArray(actual) ); 
		}
	@Test
	public void verifyApfsDirectoryTotalSize ()
	{
		String[] expected = {"false", "files", "home", "0", "16000"};
		ApfsDirectory root = new ApfsDirectory(null, "RootDir", 0, d1, "Gonul", m1);
		ApfsDirectory system = new ApfsDirectory(root, "system", 0, d1, "Gonul", m1);
		ApfsDirectory home = new ApfsDirectory(root, "home", 0, d1, "Gonul", m1);
		ApfsDirectory files = new ApfsDirectory(home, "files", 0, d1, "Gonul", m1);
		ApfsDirectory actual = new ApfsDirectory(root, "Home", 0, d1, "Gonul", m1);
		ApfsFile f1 = new ApfsFile(files, "notes", 3000, d1, "Gonul", m1);
		ApfsFile f2 = new ApfsFile(files, "notes1", 5000, d1, "Gonul", m1);
		ApfsFile f3 = new ApfsFile(files, "notes2", 8000, d1, "Gonul", m1);
		fs.setRoot(root);
		fs.AddChild(root, home);
		fs.AddChild(root, system);
		fs.AddChild(home, files);
		fs.AddChild(root, actual);
		fs.AddChild(files, f1);
		fs.AddChild(files, f2);
		fs.AddChild(files, f3);
		assertArrayEquals(expected, dirToStringArray(files) ); 
		}
}