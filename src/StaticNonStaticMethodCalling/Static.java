package StaticNonStaticMethodCalling;

public class Static {

	public static void main(String[] args) {
		trim(); //calling from same class
		ForCallingNSWithPara.tree(22, "Sapna", 'A');//calling from different class
		ForCallingNSWithPara.tree(56, "Tannu", 'A');
		ForCallingNSWithPara f=new ForCallingNSWithPara();
		f.trans();
		Static s=new Static();
		s.metro();
	}

	
	public static void trim()
	{System.out.println("Tiger Zinda hai");}
	
	public void metro()
	{System.out.println("Metro shoes have good quality.");}
	
}
