package Constructor;

public class Construc {
	int a; int b;
	public Construc()
	{
		a=20; b=40;
	}

	public static void main(String[] args) {
		Construc c=new Construc();
		c.sum();
		

	}
	
	public void sum()
	{
		int a=10; b=20;
		System.out.println(a-b);
	}

}

