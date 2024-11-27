package Collection;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class LinkedList {

	
public void newlinkedlist() {
	
	
	List<Integer> number=new java.util.LinkedList<Integer>();{
		
		
		number.add(5);
		number.add(4);
		number.add(3);
		number.add(2);
		number.add(1);
		
		System.out.println(number);
		
		number.remove(3);
		System.out.println(number);
	}
	
	  System.out.println(number.get(1));
	  
	  number.add(0, 200);
	  System.out.println(number);
	  
	  number.remove(0);
	  System.out.println(number);
	  
	 for (Integer integer : number) {
		
		 System.out.println(integer);
	}
	 
	ListIterator<Integer> num= number.listIterator();{
		
		
		while(num.hasNext()) {
			
			System.out.println(num.next());
		}
	} 
	
	
}

public static void main(String[] args) {
	
	LinkedList link=new LinkedList();
	link.newlinkedlist();

    
	
	
}
		}

	


