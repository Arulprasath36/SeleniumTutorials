package importantJavaPrograms;

public class ReverseANumber {

	
	int number=12345;
	int reverseNumber=0;
	
	public void reverseNumber(){
		System.out.println(" Given Number : "+ number);
		
		while(number!=0){
			reverseNumber=reverseNumber*10+number%10;
			number=number/10;
		}
		
		System.out.println(" Reversed Number : "+ reverseNumber);
	}
	public static void main(String[] args) {

		ReverseANumber aNumber= new ReverseANumber();
		aNumber.reverseNumber();

	}

}
