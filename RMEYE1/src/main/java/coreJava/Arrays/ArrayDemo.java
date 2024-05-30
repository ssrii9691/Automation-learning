package coreJava.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=4;
		
//		int b[]=new int[4]; // declares an array and allocating memory and assigning the values
//		b[0]=1;
//		b[1]=3;
//		b[2]=5;
//		b[3]=7;
		
		int b[]= {1,3,5,7}; //here the memory is dynamically allocated and assigning the values
		for(int j=0;j<b.length;j++) {
			System.out.println(b[j]);
		}
	}

}
