package Keyword;

public class Thiskeyword {
	
	
	int age;
	
	String name;
	
	
	

	public void display1(int age,String name) {
		
		this.age=age;
		this.name=name;
		
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thiskeyword word=new Thiskeyword();
		word.display1(56, "Bro");
		System.out.println(word.age);
		System.out.println(word.name);
		

	}

}
