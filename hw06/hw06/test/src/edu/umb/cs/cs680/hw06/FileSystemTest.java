package edu.umb.cs.cs680.hw06;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class FileSystemTest {

	@Test
	public void MakingSingleFileSystemTest() {
		FileSystem fileSystem1 = FileSystem.getInstance();
		FileSystem fileSystem2 = FileSystem.getInstance();
		
		assertEquals(fileSystem1.hashCode(), (fileSystem2.hashCode()));
	}
	
	@Test
	public void GetSingleRootTest() {
		 FileSystem fileSystem = FileSystem.getInstance();
		 Directory root = fileSystem.getRootDir();
		 Directory expected = root.getParent();
		 Directory actual = null;
		 assertEquals(actual, (expected));
	}


}
