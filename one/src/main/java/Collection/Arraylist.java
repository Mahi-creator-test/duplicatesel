package Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import org.apache.commons.math3.util.MultidimensionalCounter.Iterator;

import com.google.common.collect.Iterators;

public class Arraylist {
	
	public void arraylist() {
	
	List<String> arraylist=new ArrayList<String>();{
		
		arraylist.add("FOUR");
		arraylist.add("BMW");
		arraylist.add("BENZ");
		arraylist.add("THREE");
		arraylist.add("BENZ");
		
		System.out.println(arraylist);
		/*
		 * System.out.println(arraylist.get(3));
		 * System.out.println(arraylist.indexOf("BENZ"));
		 * System.out.println(arraylist.lastIndexOf("mahi"));
		 * 
		 * List<String> anotherlist=new ArrayList<String>();
		 * anotherlist.addAll(arraylist); System.out.println(anotherlist);
		 * 
		 * anotherlist.clear();
		 * 
		 * System.out.println(anotherlist);
		 * 
		 * arraylist.remove(0); System.out.println(arraylist);
		 * 
		 * arraylist.remove("THREE"); System.out.println(arraylist);
		 * 
		 * arraylist.add("null"); System.out.println(arraylist);
		 * 
		 * 
		 * arraylist.set(3, "kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk");
		 * System.out.println(arraylist);
		 * 
		 * 
		 * System.out.println(arraylist.isEmpty());
		 */
       //iterator
       
       for (String order : arraylist) {
		
    	   
    	   System.out.println(order);
    	  
	}
       System.out.println("                                                  ");
       for(int i=0;i<=arraylist.size()-1;i++) {
    	   
    	   System.out.println(arraylist.get(i));
    	   
    	 
    	   
       }
       System.out.println("                                                  ");
       ListIterator<String> iterator=arraylist.listIterator();
       
       while (iterator.hasNext()) {
		System.out.println(iterator.next());
		
	}
       System.out.println("-------------------------------------------------------------");
       
       while(iterator.hasPrevious()) {
    	   
    	   System.out.println(iterator.previous());
    	   
       }
       System.out.println("-------------------------------------------------------------");
       
      java.util.Iterator<String> ite=arraylist.iterator();{
    	  
    	  while(ite.hasNext()) {
    		  
    		  System.out.println(ite.next());
    		  
    	  }
    	  
    	  
    	  
    	  
    	  
      }
       
       
       
        
	}
	
	
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Arraylist newlist=new Arraylist();
		newlist.arraylist();
		
		

	}

}
