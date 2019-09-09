package edu.umb.cs.cs680.hw08;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Date;

public class APFSTest {
	APFS apfs = new APFS();
	private String name = "home";
	private int capacity = 60000;
	
	@Test
	public void MakingSingleapfsTest() {
		APFS apfs1 = APFS.getInstance();
		APFS apfs2 = APFS.getInstance();
		
		assertEquals(apfs1.hashCode(), apfs2.hashCode());
	}
	
	@Test
	public void GetSingleRootTest() {
		 apfs.initFileSystem(name, capacity);
		 APFS apfs = APFS.getInstance();
		 ApfsDirectory root = apfs.getRootDir();
		 ApfsDirectory expected = root.getParent();
		 ApfsDirectory actual = null;
		 assertEquals(actual, expected);
	}
	
	@Test
	public void apfsCapacityTest() {
		 apfs.initFileSystem(name, capacity);
		 int actual = apfs.getCapacity();
		 int expected = 60000;
		 assertEquals(actual, expected);
	}


}