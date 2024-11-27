package PolymorphismLoadride;

public class overload {
	
	
	public void karate() {
		
		
		System.out.println("Karate tournment");
	}
	
	
	

	public long karate(long a) {
		
		
		System.out.println("Karate Belt");
		return a;
	}
          
	
	public float karate(Float a) {
		
		
		System.out.println("Karate yellow");
		return a;
		
	}
          
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
	
        	   overload load=new overload();
        	   load.karate();
               load.karate(3);
               load.karate(null);

	}

}
