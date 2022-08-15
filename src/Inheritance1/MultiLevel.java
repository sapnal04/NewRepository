package Inheritance1;

public class MultiLevel extends MultiParent {

	public static void main(String[] args) {
		Grandparent g=new Grandparent();
		g.achar();
		
		System.out.println(":::::::::::;;");
		
		MultiParent m=new MultiParent();
		m.achar();
		m.hat();
		
		System.out.println(":::::::::::;;");
		
		MultiLevel l=new MultiLevel();
		l.achar();
		l.baccha();
		l.hat();

	}
	
	public void baccha()
	{System.out.println("I am chota baccha");}
}

