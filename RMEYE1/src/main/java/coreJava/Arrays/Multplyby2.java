package coreJava.Arrays;

public class Multplyby2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ab= {1,2,3,4,5,6,7,8,4,9};
		
		for(int i=0;i<ab.length;i++) {
			if(ab[i]%2==0) {
				System.out.println(ab[i]);				
			}
			else {
				System.out.println(ab[i]+" is not multiplied by 2");
			}
		}
		
		 
	}

}
