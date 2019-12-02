import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SimpleTest {
	
	@Test
	public void testPass() {
		int a = 5;
		int b = 6;
		assertTrue(a+b == 11);
				
	}
	
	@Test
	public void testFail() {
		int a = 2;
		int b = 1;
		assertTrue(a-b == 2);
				
	}

}
