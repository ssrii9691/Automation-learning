package coreJava;

public  class ChildAbstract extends ParentAbstract{
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//User unable to use methods  declared as private
		ParentAbstract a=new ChildAbstract();
		a.Bodycolor();
		a.engine();
		a.Safetyguidlines();
		
	}

	@Override
	public void Bodycolor() {
		// TODO Auto-generated method stub
		System.out.println("Red color on the body");
	}
	

}
