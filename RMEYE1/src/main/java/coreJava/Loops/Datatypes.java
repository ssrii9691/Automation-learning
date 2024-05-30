package coreJava.Loops;

public class Datatypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=5;
		String name="M Saikumar";
		char r='r';
		double num=5.66;
		Boolean mycard=true;
		
		System.out.println(a+" is the number");
		System.out.println(name);
		System.out.println(r);
		System.out.println(mycard);
		
		String Names []= {"Sai","sri","shashi"};
		
		int[] ab= {1,2,3,4,5,6,2,5,4};

		
		for(int i=0;i<ab.length;i++) {
			int c = ab[i]*2;
			System.out.println(c);

		}
		//Enhanced for loop 
		for(String s:Names) {
			System.out.println(s);
		}
		for(int ba:ab) {
			System.out.println(ba);
		}
	}

}
