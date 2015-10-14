package junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test1 {

	MessageUtil m = new MessageUtil();

	@Test
	public void testHi() {
		System.out.println("checking hi");
		assertEquals(m.hiMessage(), "Hi");
	}

}
