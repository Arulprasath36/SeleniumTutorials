package importantJavaPrograms;

public class ReverseAString {


	public void reverseString(String givenString){

		int length=givenString.length();
		String reversed="";
		for(int i=length-1;i>=0;i--){
			reversed=reversed+givenString.charAt(i);	
		}
		System.out.println("Reversed String is : "+ reversed);

	}


	public void usingBuffer(String givenString){

		StringBuffer buffer= new StringBuffer();
		buffer.append(givenString);

		String reversed="";

		reversed=buffer.reverse().toString();
		System.out.println("Reversed String is : "+ reversed);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseAString aString= new ReverseAString();
		aString.reverseString("Arul");
		aString.usingBuffer("Arul");
	}

}