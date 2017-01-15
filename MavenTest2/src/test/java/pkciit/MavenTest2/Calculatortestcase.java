package pkciit.MavenTest2;

import static org.junit.Assert.*;

import org.junit.Test;

public class Calculatortestcase {

	Calculator calobj=new Calculator();
	
	
	@Test
	public void test() {
		
		int result =calobj.add(23, 3);
		
		assertEquals(26,result);
	}
	
	@Test
	public void testsub(){
		
		int result =calobj.sub(15, 4);
		assertEquals(11,result);
	}
	
	@Test
	(expected = ArithmeticException.class)
	
	public void testDevideException() throws ArithmeticException{
		calobj.devide(5,0);
	}
	
	@Test 
	public void testDevide(){
		
		int result =calobj.devide(12,2);
		
		assertEquals(6,result);
	}

}
