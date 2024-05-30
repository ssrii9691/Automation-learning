package coreJava;

public class Thiskeyword {

	int a=2;
	
	public void getdata() {
		int a=3;
		System.out.println(a);
		int c= a+this.a;
		System.out.println(c);
		System.out.println(this.a);

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thiskeyword td = new Thiskeyword();
		td.getdata();
	}

}
