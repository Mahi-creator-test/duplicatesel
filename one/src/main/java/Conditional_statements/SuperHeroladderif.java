package Conditional_statements;

public class SuperHeroladderif {
	
	
	String mysuperher="BaTMAN";
	
	
	
	public void heroguesser() {
		
		
		if(mysuperher.equals("superman")) {
			
			System.out.println("you thought is superman");
			}
		else if (mysuperher.equalsIgnoreCase("BATMAN")) {
			
			
			System.out.println("you thought is Batman");
		}
		
        else if (mysuperher.equals("Captan America")) {
			
			
			System.out.println("you thought is Captan America");
		}
		
        else {
        	
        	
        	System.out.println("I cant guess sorry!");
        }
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SuperHeroladderif hero=new SuperHeroladderif();
		hero.heroguesser();

	}

}
