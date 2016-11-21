import org.apache.commons.io.IOUtils;
import org.junit.Test;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;

/**
 * @author sergiupostolachi
 */
public class TestExample {
	public static final String configFileDir = System.getProperty("configDir");
	@Test
	public void testSome() throws IOException {
		System.out.println(configFileDir);
		String read = readContent();
		assertEquals(read,"user.name=qatestuser");
	}


	private String readContent() throws IOException {

		InputStream input = new URL(configFileDir).openStream();
		try {
			return IOUtils.toString( input );
		} finally {
			IOUtils.closeQuietly(input);
		}

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
