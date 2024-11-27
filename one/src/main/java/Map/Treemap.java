package Map;

import java.util.TreeMap;

public class Treemap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		TreeMap<String, String> place=new TreeMap<String, String>();{
			
			
			place.put("sungam", "Coimbatore");              
			place.put("rampuram", "Coimbatore");
			place.put("ukkadam", "Coimbatore");
			place.put("colony", "Coimbatore");
			place.put("racecourse", "Coimbatore");
			
			
			place.put("Chennai", "koyambedu");
			place.put("Chennai", "Anna nagar");
			//place.put(null, "Beach Road");
			
			
			System.out.println(place);
		}
		
	}

}
