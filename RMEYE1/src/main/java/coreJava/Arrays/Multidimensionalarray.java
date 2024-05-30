package coreJava.Arrays;

public class Multidimensionalarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a [][]=new int[2][3];
		a[0][0]=1;
		a[0][1]=2;
		a[0][2]=3;
		a[1][0]=4;
		a[1][1]=5;
		a[1][2]=6;
		
//		int b[][]= {{1,2,3},{4,5,6}};
//		System.out.println(b[1][0]);

		for(int j=0;j<2;j++) { //row
			for(int k=0;k<3;k++ ) { // column
				System.out.println(a[j][k]);
			}
		}
		//System.out.println(a[1][0]);
	}

}
