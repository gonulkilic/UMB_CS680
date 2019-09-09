package edu.umb.cs.cs680.hw03;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SingletonTest {

	@Test
	public void createInstance() {
		Singleton instance1 = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();
		assertSame(instance1, instance2);
		
		}
}
