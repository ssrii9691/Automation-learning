package coreJava.Loops;

public class Pyramidtriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//p-triangle in reverse use below code
		int k=1;
		for(int i=0;i<4;i++) {
			for(int j=1;j<=4-i;j++) {
				System.out.print(k);
				System.out.print("\t");
				k++;
			}
			System.out.println("");
		}
		//p-triangle  use below code
		int k1=1;
		for(int i=0;i<5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(k1);
				System.out.print("\t");
				k1++;
			}
			System.out.println("");
		}

		//this code for 
//		1 2 3 4
//		1 2 3 
//		1 2 
//		1
		for(int i=0;i<4;i++) {
			for(int j=1;j<=4-i;j++) {
				System.out.print(j);
				System.out.print("\t");
			
			}
			System.out.println("");
		}
	}

}
