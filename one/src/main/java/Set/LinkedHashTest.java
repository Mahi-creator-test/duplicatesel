package Set;

import java.util.LinkedHashSet;

public class LinkedHashTest {
	
	
	
	public void linkedhash() {
		
		
		LinkedHashSet<Integer> rollno=new LinkedHashSet<Integer>();{
			
			rollno.add(5);
			rollno.add(4);
			rollno.add(4);
			rollno.add(4);
			rollno.add(4);
			
			System.out.println(rollno);
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashTest demo1=new LinkedHashTest();
		demo1.linkedhash();

	}

}
