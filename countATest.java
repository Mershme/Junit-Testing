package testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class countATest {

	@Test
	public void test() {
		JUnitTesting test = new JUnitTesting();
		int output = test.countA("equals");
		assertEquals(1, output);
	}

}
