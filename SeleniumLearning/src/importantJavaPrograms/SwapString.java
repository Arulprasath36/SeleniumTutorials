package importantJavaPrograms;

public class SwapString {

	String string1="Arul";
	String string2="Aishu";
	
	public void swapWithTemp(){
		System.out.println(string1 +" "+ string2);
		String temp=null;
		temp=string1;
		string1=string2;
		string2=temp;
		System.out.println(string1 +" "+ string2);
	}
	
	
	public void withoutThirdVariable(){
		System.out.println(string1 +" "+ string2);
		string1=string1+string2;
		string2=string1.substring(0, string1.length()-string2.length());
		string1=string1.substring(string2.length());
		System.out.println(string1 +" "+ string2);
	}
	
	public static void main(String[] args) {
		SwapString string= new SwapString();
		string.swapWithTemp();
		string.withoutThirdVariable();

	}

}
