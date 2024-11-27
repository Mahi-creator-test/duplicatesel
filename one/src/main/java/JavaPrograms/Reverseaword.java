package JavaPrograms;import org.apache.commons.compress.harmony.pack200.NewAttribute;

public class Reverseaword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String name="The Goat";
		
		String newname="";
		
		int length=name.length();
		System.out.println(length);
		
		String[] splitname=name.split(" ");
		
		
		for(int i=splitname.length-1;i>=0;i--) {
			
			String a=splitname[i];
			
			for(int j=a.length()-1;j>=0;j--) {
				
				newname +=a.charAt(j);
				
			}
			newname+=" ";
			}
		System.out.println(newname);
		
		
		
		
		
		
		
		
		
		
		
		
	}}