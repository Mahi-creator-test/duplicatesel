package JavaPrograms;

public class Reversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="Goat";
		
		String newname="";
		
		System.out.println(name.length());
		
		for(int i=name.length()-1; i>=0; i--) {
			
			
			newname += name.charAt(i);
		}
		System.out.println(newname);

	}

}
