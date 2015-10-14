package junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test2 {

	MessageUtil m = new MessageUtil();

	@Test
	public void testHello() {
		System.out.println("checking hello");
		assertEquals(m.helloMessahe(), "Hell");
	}

}
