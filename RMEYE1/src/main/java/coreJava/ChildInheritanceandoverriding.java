package coreJava;

public class ChildInheritanceandoverriding extends ParentInheritance {

//	public void Gear() {
//		System.out.println("gear child implementation");
//	}
	
	public void color() {
		System.out.println(color);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildInheritanceandoverriding a=new  ChildInheritanceandoverriding();
		a.color();
		a.Gear();
	}

}
