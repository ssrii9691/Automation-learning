package coreJava.Arrays;

public class MinvalueinMultiarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int abc[][]= {{10,2,3},{4,5,6},{7,8,9}};
		int min=abc[0][0];
		
		for(int j=0;j<3;j++) { //row
			for(int k=0;k<3;k++ ) { // column
				
				if(abc[j][k]>min) {
					min=abc[j][k];
				}
//				System.out.println(abc[j][k]);
			}
			
		}
		System.out.println(min);
	}

}
