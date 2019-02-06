package importantJavaPrograms;

public class TrianglePattern {

	public void printStarTriangle(){
		int rows= 5;
		for(int i=1;i<=rows;i++){
			for(int j=1; j<=i;j++){
				System.out.print("* ");
			}
			System.out.println();
		}		
	}
	
	public void printInvertedStar(){
		int rows=5;
		
		for(int i=rows;i>=1;i--){
			for(int j=0;j<=i;j++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public void printNumberTriangle(){
		
		int rows=5;
		
		for(int i=1;i<=rows;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
	}
	
	public void printInvertedNumber(){
		int rows=5;
		
		for(int i=rows;i>=1;i--){
			for(int j=1;j<=i;j++){
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TrianglePattern pattern= new TrianglePattern();
		pattern.printStarTriangle();
		pattern.printInvertedStar();
		pattern.printNumberTriangle();
		pattern.printInvertedNumber();
	}

}
