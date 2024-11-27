package Conditional_statements;

public class SuperheroSwitch {
	
	
	
	String MYHERO="superman";
	
	
	
	
	public void superherotrack() {
		
		
		 switch (MYHERO) {
		case "marvel":
			System.out.println("marvel is superhero");
			break;
		case "superman":	
			System.out.println("superman is superhero");
			break;
		case "ironman":
			System.out.println("ironman is superhero");
			break;

		default:
			System.out.println("It is not superhero");
		}
		
		
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SuperheroSwitch hro=new SuperheroSwitch();
		hro.superherotrack();
		
		
		
		
		
		
		

	}

}
