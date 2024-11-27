package xpath1;

public class xpathpart1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//1.//Locating Elements with know attributes
		
	//	//Element[@attribure='Value']   //*[@name='username']
		
		//2.// Locating Elements with know attributes and elements
		
		//input[@name='username']
		
		//3.// Locating Elements with know visible text(Exact match)
		
		//*[text()='OrangeHRM OS 5.7']
		
		//4.Locating Elements with know visible text(partial match)
		
	//	//*[contains(text(),'OrangeHRM')]
		
		//   5.Locating Elements with known all attributes
		
		//*[@type='submit'][@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']
		

		
		//*[starts-with(text(),'Orange')]
		
		
		
		//part 2
		
		//Locating a parent element
		
		
		//known attribute
		//*[@name='username']/parent::*
		
		
		//Locating a child element
		
		//*[@name='username']/child::input
		
		
		//Locating a anchestor element
		//*[@name='username']/ancestor::form
		
		//Locating a Following element
		//*[@name='username']/following::div[2]
		
		//Locating a Following element
		//*[@name='username']/preceding::div[2]
		
		
		//Locating a Following-siblings element
		//*[@name='username']/preceding-sibling::*
		
		
		//Locating a preceding-siblings element
		//*[@name='username']/preceding-sibling::*
	}

}
