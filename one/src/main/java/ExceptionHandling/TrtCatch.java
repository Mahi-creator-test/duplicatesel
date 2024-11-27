package ExceptionHandling;

import java.io.IOException;

public class TrtCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
		int number1=1;
			int number2=1;
		
			
			int number3=number2/number1;
			System.out.println(number3);
			throw new Exception();
		}
		catch (ArithmeticException e) {
			// TODO: handle exception
		System.out.println("executed even there is issue");
			
		}
		
		catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("it is null pointer");
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("final catch");
		}
		finally {
			System.out.println("task over");
		}
		
		
		
		
		
	}}


