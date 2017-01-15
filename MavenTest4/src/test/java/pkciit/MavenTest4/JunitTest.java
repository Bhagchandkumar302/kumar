package pkciit.MavenTest4;

import static org.junit.Assert.*;

import org.junit.Test;


   

public class JunitTest {
	
	MainClassMeavan obj=new MainClassMeavan();
	
	
	
@Test 
public void testadd(){
	
	int result=obj.add(6, 13);
	assertEquals(19,result);
}
	
	
	
}
