package coreJava;

public class OverloadingDemo {

	public void getdata(int a) {
		System.out.println(a);
	}
	public void getdata(int a,int b) {
		int c=a+b;
		System.out.println(c);
	}
	public void getdata(String a) {
		System.out.println(a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OverloadingDemo d=new OverloadingDemo();
		d.getdata(4);
		d.getdata("saikumar");
		d.getdata(2, 4);
	}

}
