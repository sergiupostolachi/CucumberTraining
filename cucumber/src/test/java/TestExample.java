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
	public void testSomeFail(){
		System.out.println("Test");
		assertEquals("This test fails", 1, 2);
	}

	@Test
	public void testSomeFail2(){
		System.out.println("Test");
		assertEquals("This test fails", 1, 4);
	}

}
