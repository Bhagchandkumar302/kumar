package pack2;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTestcase {

	Calculator obj=new Calculator();
	
	@Test
	public void testadd() {
		
		int result =obj.add(7, 3);
		
		assertEquals(10,result);
	}
	
	@Test
	
	public void testsub(){
		
		int result =obj.sub(34, 4);
		assertEquals(30,result);
	}
	

}
