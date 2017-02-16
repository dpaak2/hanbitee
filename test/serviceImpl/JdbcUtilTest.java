package serviceImpl;

import static org.junit.Assert.*;

import org.junit.Test;

import util.JdbcTest;

public class JdbcUtilTest {

	@Test
	public void testGetName() {
		JdbcTest instance =new JdbcTest();
		assertTrue(instance.getName().equals("홍길동"));
	}

}
