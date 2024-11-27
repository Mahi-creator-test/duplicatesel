package Conditional_statements;

public class LetsHaveaCofee {
	
	
	   Boolean iscupempty=false;
	   
	   
	   public void display() {
		   
		   
		   if(iscupempty) {
				
				
				System.out.println("Fill the cup");
			}
			
			else {
				
				
				System.out.println("Drink the coffee");
			}
			
			}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		LetsHaveaCofee coffee=new LetsHaveaCofee();
		coffee.display();
		
		

	}

}
