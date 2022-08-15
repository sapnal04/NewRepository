package casting;

public class ImplicitExplicit {

	public static void main(String[] args) {
		//Implicit-widening casting
		
		byte fish=123;   //1 byte
		System.out.println(fish);
		double frog=fish;        //8 byte
		System.out.println(frog);
		int g=fish;     //4 byte
		System.out.println(g);
		
		
System.out.println("***************");


		//Explicit- narrowing casting
		
		double f=134.67893377748;
		float t=(float) f;
		int i= (int) f;
		byte b=(byte) f;
		System.out.println(f);
		System.out.println(t);
		System.out.println(i);
		System.out.println(b);
	}

}

