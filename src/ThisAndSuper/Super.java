package ThisAndSuper;

public class Super extends This {

	int a=50;
	String car="Toyota";
	boolean result=false;
	
	public static void main(String[] args) {
		This t=new This();
		Super s=new Super();
		t.jug();
		System.out.println("==============");
		s.jug();
		System.out.println("==============");
		s.jug1();
		
	}
	public void jug1() 
	{
		int a=40;
		boolean result=false;
		String car="dragon";
		System.out.println("Speed is "+a+". Name: "+car+". It is good car: "+result);
		System.out.println("Speed is "+super.a+". Name: "+super.car+". It is good car: "+super.result);
		System.out.println("Speed is "+this.a+". Name: "+this.car+". It is good car: "+this.result);}


}
