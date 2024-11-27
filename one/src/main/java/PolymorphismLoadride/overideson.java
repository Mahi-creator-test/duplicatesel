package PolymorphismLoadride;

public class overideson extends overrideparent {
	
	
	
    @Override
	public void future() {
		
		
		
		System.out.println("changed new plans");
	} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		overrideparent parent=new overideson();
		parent.future();
		
		

	}

}
