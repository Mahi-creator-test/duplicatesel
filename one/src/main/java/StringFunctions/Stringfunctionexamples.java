package StringFunctions;

public class Stringfunctionexamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		        //012345678910
		String s="Agniprasath"; //string literal
		String m="  duallallallla  ";
		
		int number=1000;
		
	
		
		System.out.println(s.charAt(2));
		
		System.out.println(s.length());

		System.out.println(s.equals("Agni"));
		
		System.out.println(s.equalsIgnoreCase("AGNI"));
		
		System.out.println(s.isEmpty());
		
		System.out.println(s.contains("gni"));
		
		System.out.println(s.substring(8));
		
		System.out.println(s.substring(0, 3));
		
		System.out.println(s.concat(" Learn Automation"));
		
		System.out.println(s.replaceAll("sath", "Mahi"));
		
		System.out.println(s.indexOf("p"));
		
		System.out.println(m.indexOf("a", 3));
		
		System.out.println(m.trim());
		
		System.out.println(String.valueOf(number));
		
		String na="GUNA";
		System.out.println(na.toLowerCase());
		
		String ua="mahi";
		System.out.println(ua.toUpperCase());
		
		
		System.out.println(String.join("-", "Learn","Automation","online"));
		System.out.println(String.join("/", "30","60","90"));
		
		//split
		
		String splitthis="Am i speaking clear";
		String[] x=splitthis.split(" ");
		for (String string : x) {
			
			System.out.println(string);
			
		}
		
		
		
	}

}
