package Polymorphism;

public class CompileTimeSuper {

	public static void main(String[] args) {
		CompileTimeSuper d=new CompileTimeSuper();
		d.hair();
		d.money();

	}
	public void money()
	{System.out.println("loan");}
	
	public void hair()
	{System.out.println("grey hair");}

}