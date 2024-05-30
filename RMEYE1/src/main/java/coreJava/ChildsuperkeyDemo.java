package coreJava;

public class ChildsuperkeyDemo extends ParentSuperkeyDemo{

	String name="Sai";
	public ChildsuperkeyDemo(int a , int b ){
		super(5,3);
		int c =a+b;
		System.out.println(c+ " child class component");
	}
	public void getstring() {
		System.out.println(name);
		System.out.println(super.name);
	}
	public  void getdata() {
		super.getdata();
		System.out.println("i am from child");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildsuperkeyDemo cd = new ChildsuperkeyDemo(5,5);
		cd.getstring();
		cd.getdata();
		
//		ParentSuperkeyDemo c=new ChildsuperkeyDemo();
		
	}

}

