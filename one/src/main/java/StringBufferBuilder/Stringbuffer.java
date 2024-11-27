package StringBufferBuilder;

public class Stringbuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("string buffer is mutable");
		StringBuffer buffer=new StringBuffer("testing");
		System.out.println(buffer);
		System.out.println(buffer.append("test"));
		System.out.println(buffer.reverse());
		System.out.println(buffer.replace(0, 5, "simple"));

		
		StringBuffer buffer1=new StringBuffer("Development");
		System.out.println(buffer1.replace(0, 10, "neet"));
		
		
		StringBuffer buffer2=new StringBuffer("Development");
		System.out.println(buffer2.capacity());
		
		
		System.out.println(buffer2.insert(1, "testing"));
	}

}
