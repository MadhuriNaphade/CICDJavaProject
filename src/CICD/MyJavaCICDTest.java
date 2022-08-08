package CICD;
import static org.junit.Assert.*;
import org.junit.Test;

class MyJavaCICDTest {

	@Test
	void testadd1() {
		var a = new MyJavaCICD();
		assertEquals(10,a.add(5, 5));
	}

	void testadd2() {
		var a = new MyJavaCICD();
		assertEquals(20,a.add(10, 10));
	}
		
}
