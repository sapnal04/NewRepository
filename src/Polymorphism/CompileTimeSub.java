package Polymorphism;

public class CompileTimeSub extends CompileTimeSuper{

	public static void main(String[] args) {
		CompileTimeSub r=new CompileTimeSub();
		r.money();
		r.hair();

}
	public void money()
	{System.out.println("holllaaaa");}
	
	public void hair()
	{System.out.println("grey dyed hair");}
	
}