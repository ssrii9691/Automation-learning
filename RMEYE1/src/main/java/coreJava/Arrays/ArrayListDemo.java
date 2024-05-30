package coreJava.Arrays;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String> a= new ArrayList <String>();
		a.add("Student");
		a.add("Rahul");
		a.add("Srikanth");
		
		for(int i=0;i<a.size();i++) {
			System.out.println(a.get(i));
		}
		//enhanced for loop
		for(String val:a) {
			System.out.println(val);
		}
		System.out.println(a);
		
//		a.add(1, "Saikumar");
//		System.out.println(a);
//		
//	
//		System.out.println(a.get(1));
//		System.out.println(a.contains("Saikumar"));
//
//		System.out.println(a.indexOf("Saikumar"));
//		System.out.println(a.isEmpty());
//		System.out.println(a.size());
//	
//
//
//
//		a.remove(2);
//		System.out.println(a);
//
//		a.remove("Student");
//		System.out.println(a);
//
//		
//		
//		a.clear();
//		System.out.println(a);

		

	}

}
