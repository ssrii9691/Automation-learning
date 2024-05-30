package coreJava;

public class staticDemo {
	
	String name; //instance variable
	String address;
	static String city;
	static int i;
//	static String city="bengalor";//class variable
	
	static {
		city="Bengalore";
		i=5;
	}
	
	 staticDemo (String name , String address) {
		this.name=name;
		this.address=address;
		this.city=city;
		i++;
		System.out.println(i);
	}
	
	public void getaddress() {
		System.out.println(address+" "+city);
	}
	
	public static void getcity() {
		System.out.println(city);
	}
	public static void main(String[] args) {
		staticDemo st= new staticDemo("sai","hyd");
		staticDemo st1= new staticDemo("sai","Bengalur");
		staticDemo st2= new staticDemo("sai","Bengalur");

		st.getaddress();
		st1.getaddress();
//		st.getcity();
		staticDemo.getcity();
	}
}
