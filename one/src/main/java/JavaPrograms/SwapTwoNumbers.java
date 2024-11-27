package JavaPrograms;

public class SwapTwoNumbers {
	
	
	
	
	public void usinthirdVariable() {
		
		
		

		int fresher=10;
		int exp=20;
		
		int temp=0;
		
		System.out.println("Before Swap fresher " + fresher + " Before Swap exp " +exp );
		
		temp=fresher;
		fresher=exp;
		exp=temp;
		
		System.out.println("After Swap fresher " + fresher + " After Swap exp " +exp );
		

	}
	
	public void withoutusinthirdVariable() {
		
		
		int First=10;
		int second=20;
		
		First=First-second;  //10=10-20=             -10
		second=First+second; 
		First=second-First;
		
		System.out.println("After Swap fresher " + First + " After Swap exp " +second );
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SwapTwoNumbers demo=new SwapTwoNumbers();
		demo.withoutusinthirdVariable();
		
	}

}
