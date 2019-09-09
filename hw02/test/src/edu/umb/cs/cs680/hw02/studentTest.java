package edu.umb.cs.cs680.hw02;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class studentTest {

	@Test
	public void setInState() {
		student InStudent=student.createinStateStudent("Gonul", "133 Commander Shea Blvd", 20);
		float expected=2000;
		float actual=InStudent.getTuition();
		assertEquals(actual, expected);
	}
	
	@Test
	public void setOutState() {
		student OutStudent=student.createOutStateStudent("Gamze", "16th Avenue Manhattan", 25);
		float expected=5000;
		float actual=OutStudent.getTuition();
		assertEquals(actual, expected);
	}
	
	@Test
	public void setIntlStudent() {
		student intlStudent=student.createIntlStudent("Cagla", 78396, "Summer Street LA", 9, "Istanbul, Turkey");
		float expected=90000;
		float actual=intlStudent.getTuition();
		assertEquals(actual, expected);
	}
	
}
