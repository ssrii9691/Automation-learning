package coreJava;

public class ConstructorDemo {

	public ConstructorDemo() {
		System.out.println("i am default constructor");
	}
	public ConstructorDemo(int a , int b ) {
		int c = a+b;
		System.out.println(c);
	}
	public ConstructorDemo(String str) {
		System.out.println(str);
	}
	public void getdata() {
		System.out.println("I am the method ");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorDemo cd = new ConstructorDemo();
		ConstructorDemo d = new ConstructorDemo(4,5);
		ConstructorDemo c = new ConstructorDemo("hello i am saikumar");
		cd.getdata();
	}
	

}
