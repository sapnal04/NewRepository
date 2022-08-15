package abstractConcrete;

public class Concrete11 extends Abstract11{

	public static void main(String[] args) {
		
		Concrete11 c=new Concrete11();
		c.fifth();
		c.first();
		c.fourth();
		c.second();
		c.third();
		

	}

	@Override
	public void first() {
		System.out.println("first");
		
	}

	@Override
	public void second() {
		System.out.println("second");
		
	}
	
	public void fifth()
	{System.out.println("Concrete");}

}
