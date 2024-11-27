package Map;

public class HashMap {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	    java.util.HashMap<Integer, String> employeemap=new java.util.HashMap<Integer, String>();{
	    	
	    	
	    	employeemap.put(1, "dev");
	    	employeemap.put(2, "test");
	    	employeemap.put(3, "design");
	    	employeemap.put(4, "HR");
	    	employeemap.put(5, "BA");
	    	
	    	System.out.println(employeemap);
	    	
	    	java.util.HashMap<Integer, String> customermap=new java.util.HashMap<Integer, String>();{
	    		
	    		customermap.putAll(employeemap);
	    		System.out.println(customermap);
	    		
	    		customermap.clear();
	    		
	    	
	    		System.out.println(employeemap.containsKey(4));
	    		
	    		System.out.println(employeemap.containsValue("BA"));
	    		
	    		System.out.println(employeemap.clone());
	    		
	    		System.out.println(employeemap.isEmpty());
	    		
	    		System.out.println(employeemap.keySet());
	    		
	    		System.out.println(employeemap.values());
	    		
	    		System.out.println(employeemap.entrySet());
	    		
	    		System.out.println(employeemap.get(3));
	    		

	    	}
	    	
	    	
	    	
	    	
	    	
	    }

	}

}
