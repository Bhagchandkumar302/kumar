package pkciit.MavenTest2;

public class Calculator {

	
	public int add(int num1,int num2){
		
		return num1+num2;
	}
	
	public int sub(int num1,int num2){
		
		return num1-num2;
	}
	
	public int devide(int num1,int num2) throws ArithmeticException{
		
		if(num2==0)
			throw new ArithmeticException("division by zero");
		
		return num1/num2;
	}
}
