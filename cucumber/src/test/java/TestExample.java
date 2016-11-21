import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author sergiupostolachi
 */
public class TestExample {
	@Test
	public void testSome(){
		System.out.println("Test");
		assertEquals(1,1);
	}

	@Test
	public void testSome1(){
		System.out.println("Test");
		assertEquals("This test fails", 1, 1);
	}

	@Test
	public void testSome3(){
		System.out.println("Test");
		assertEquals("This test fails", 4, 4);
	}

}
