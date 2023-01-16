package calc1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestCalculator {
	
	Calculator c= new Calculator();
	
	@Before
	public void show() {
		System.out.println("Hi");
	}
	
	@Test
	public void testAdd() {
		c.add(323,5748);
	}
	
	
	@After
	public void display() {
		System.out.println("Thanks");
	}

}
