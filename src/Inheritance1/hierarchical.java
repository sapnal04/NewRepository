package Inheritance1;

public class hierarchical {

	public static void main(String[] args) {
		Grandparent g=new Grandparent();
		g.achar();
		
		System.out.println("^^^^^^^^^^");
		
		Child1 c=new Child1();
		c.achar();
		c.paint();
		
		System.out.println("^^^^^^^^^^");
		
		Child2 c2=new Child2();
		c2.achar();
		c2.dance();

	}

}

