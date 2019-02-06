package importantJavaPrograms;

import java.util.HashSet;
import java.util.Set;

public class RepeatedElements {

	String[] elements={"s","a","s","a"};

	int length= elements.length;
	int duplicateCount=0;
	
	public void findRepeatdElements(){
		System.out.println("Duplicate Elements are :");
		for(int i=0;i<length;i++){
			for(int j=i+1;j<length;j++){
				if(elements[i]==elements[j]){
					System.out.println(elements[j]);
					duplicateCount++;
				}
			}

		}
		System.out.println("Duplicate count : " + duplicateCount);
	}

	
	public void usingCollection(){
		String[] elements={"s","a","s","a"};
		Set<String> set= new HashSet<>();
		for(int i=0;i<elements.length;i++){
			if(set.add(elements[i])){
				
			}else{
				System.out.println(elements[i]+"  is duplicate");
			}
		}
		
	}
	
	public static void main(String[] args) {


		RepeatedElements elements= new RepeatedElements();
		//elements.findRepeatdElements();
		elements.usingCollection();

	}

}
