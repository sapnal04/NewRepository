package ThisAndSuper;

public class This {
	int a=45;
	String car="Aspire";
	static boolean result=true;
			
	public static void main(String[] args) {
		This t=new This();
		t.jug();

	}
	public void jug()
	{
		int a=40;
		boolean result=false;
		String car="dragon";
		System.out.println("Speed is "+a+". Name: "+car+". It is good car: "+result);
		System.out.println("Speed is "+this.a+". Name: "+this.car+". It is good car: "+this.result);
	}
}


