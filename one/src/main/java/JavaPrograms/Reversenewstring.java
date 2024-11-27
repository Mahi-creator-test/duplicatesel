package JavaPrograms;

public class Reversenewstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="agni";
		
	   char[] array=name.toCharArray();
	   
	   String reversestring="";
	   
	   for(int i=array.length-1;i>=0;i--) {
		   
		   reversestring=reversestring+array[i];
		   
		   
	   }
	   
	   System.out.println(reversestring);
		
	}

}
