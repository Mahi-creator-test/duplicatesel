package Set;

import java.util.HashSet;

public class Hashset {
	
	
	
	
	public void hashset() {
		
		
		HashSet<String> numberset=new HashSet<String>();{
			
		   numberset.add("null");
		   numberset.add("A");
		   numberset.add("B");
		   numberset.add("C");
		   numberset.add("D");
		   numberset.add("E");
		   numberset.add("null");
			
		   System.out.println(numberset);
		   
		  System.out.println( numberset.contains("E"));
		   
			
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Hashset demo=new Hashset();
		demo.hashset();
	}

}
