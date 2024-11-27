package Set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Treeset {

	public void treeset() {
		
		
		      TreeSet<Integer> treedata=new TreeSet<Integer>();{
		    	  
		    	 treedata.add(10);
		    	 treedata.add(20);
		    	 treedata.add(30);
		    	 treedata.add(40);
		    	 treedata.add(200);
		    	 
		    	 
		    	 System.out.println(treedata);
		    	  
		    	  
		      }
		      
				
				  System.out.println(treedata.first());
				  
				  System.out.println(treedata.last());
				 
					
			      System.out.println(treedata.pollFirst());
					  
				  System.out.println(treedata.pollLast());
					 		      
		      System.out.println(treedata.headSet(200));
		      
		      System.out.println(treedata.tailSet(30));
		      
				 System.out.println(treedata.subSet(40, 200)); 
				
				  
				  
				  System.out.println(treedata.higher(20));
				  
				  System.out.println(treedata.lower(20));
				  
				  System.out.println(treedata.descendingSet());
				  
				  System.out.println(treedata.comparator());
				  
				  
				  TreeSet<StringBuffer> buff=new TreeSet<StringBuffer>();{
				  
				  buff.add(new StringBuffer("B")); buff.add(new StringBuffer("A"));
				  
				  System.out.println(buff);
				  
				  Iterator<Integer> ite=treedata.descendingIterator();{
				  
				  while(ite.hasNext()) {
				  
				  
				  System.out.println(ite.next()); }
				  
				  }
				  
				  
				  }  
				  
				  
				 
		      }
		      
		      

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Treeset demodata = new Treeset();
		demodata.treeset();

	}

}
