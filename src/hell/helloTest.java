package hell;

import static org.junit.Assert.*;

import org.junit.Test;

public class helloTest {

	@Test
	public void test() {
		hello w=new hello();
		int y=w.add(1,5);
		assertEquals(6,y);
	}

}
