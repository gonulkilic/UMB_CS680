package edu.umb.cs.cs680.hw05;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Date;

public class DirectoryTest{
	FileSystem fs = FileSystem.getInstance();
	static Date d1 = new Date();
	static Date m1 = new Date();

	private String[] dirToStringArray(Directory d){
		String[] dirInfo = {
			String.valueOf(d.isFile()), d.getName(),  
			d.getParent().getName(),
			String.valueOf(d.getSize()),
			String.valueOf(d.getTotalSize())
		};
		return dirInfo; 
	}
	private String[] rootToStringArray(Directory d){
		String[] dirInfo = {
			String.valueOf(d.isFile()), d.getName(),  
			String.valueOf(d.getParent()),
			String.valueOf(d.getSize()),
			String.valueOf(d.getTotalSize())
		};
		return dirInfo; 
	}
	@Test
	public void tDirectoryRoot (){
		String[] expected = {"false", "RootDir", "null", "0", "0"};
		Directory actual = new Directory(null, "RootDir", 0, d1);
		assertArrayEquals(expected, rootToStringArray(actual) ); 
		}
		
	@Test
	public void tDirectoryHome ()
	{
		String[] expected = {"false", "Home", "RootDir", "0", "0"};
		Directory root = new Directory(null, "RootDir", 0, d1);
		Directory system = new Directory(root, "system", 0, d1);
		Directory home = new Directory(root, "home", 0, d1);
		Directory files = new Directory(home, "files", 0, d1);
		Directory actual = new Directory(root, "Home", 0, d1);	
		fs.setRoot(root);
		fs.addChild(root, home);
		fs.addChild(root, system);
		fs.addChild(home, files);
		fs.addChild(root, actual);
		assertArrayEquals(expected, dirToStringArray(actual) ); 
		}
	@Test
	public void tDirectoryTotalSize ()
	{
		String[] expected = {"false", "files", "home", "0", "16000"};
		Directory root = new Directory(null, "RootDir", 0, d1);
		Directory system = new Directory(root, "system", 0, d1);
		Directory home = new Directory(root, "home", 0, d1);
		Directory files = new Directory(home, "files", 0, d1);
		Directory actual = new Directory(root, "Home", 0, d1);
		File f1 = new File(files, "n", 3000, d1);
		File f2 = new File(files, "notes1", 5000, d1);
		File f3 = new File(files, "notesf2", 8000, d1);
		fs.setRoot(root);
		fs.addChild(root, home);
		fs.addChild(root, system);
		fs.addChild(home, files);
		fs.addChild(root, actual);
		fs.addChild(files, f1);
		fs.addChild(files, f2);
		fs.addChild(files, f3);
		assertArrayEquals(expected, dirToStringArray(files) ); 
		}
}