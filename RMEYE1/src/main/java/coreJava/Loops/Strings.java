package coreJava.Loops;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String is an object and it represent that sequence of characters //string literal
		String s1="Welcome";
		String s2="Welcome";
		System.out.println(s1);
		System.out.println(s2);

		// new 
		String str=new String("Hello");
		String str1=new String("Hello");
		String s="Rahul shetty academy";
		String[] splittedstring= s.split("shetty");
		System.out.println(splittedstring[0]);
		System.out.println(splittedstring[1]);
		System.out.println(splittedstring[1].trim());
		
//		for(int i=0;i<s.length();i++) {
//			System.out.println(s.charAt(i));
//		}
		for(int i=s.length()-1;i>=0;i--) {
			System.out.println(s.charAt(i));
		}

	}

}
