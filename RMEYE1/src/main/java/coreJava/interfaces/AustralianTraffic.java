package coreJava.interfaces;

public class AustralianTraffic implements centralTraffic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		centralTraffic a= new AustralianTraffic();
		a.greenGo();
		a.redStop();
		a.yellow();
		
		AustralianTraffic at= new AustralianTraffic();
		at.moonstar();
	}

	public void moonstar() {
		System.out.println(" GO");

	}
	@Override
	public void greenGo() {
		// TODO Auto-generated method stub
		System.out.println("Green GO");
	}

	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println("Red Stop");

	}

	@Override
	public void yellow() {
		// TODO Auto-generated method stub
		System.out.println("Yellow Ready to GO");

	}

}
