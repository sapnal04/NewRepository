package Polymorphism;

public class OverloadingCompile {

	public static void main(String[] args) {
		OverloadingCompile o=new OverloadingCompile();
		o.add();
		o.add(30);
		o.add(20,40);

	}

	public void add()
	{
	int a=10;
	int b=20;
	int sum=a+b;
	System.out.println("sum is "+sum);
	}
	
	public void add(int a)
	{
	a=30;
	int sum=a+10;
	System.out.println("sum is "+sum);
	}
	
	public void add(int a, int b)
	{
	int sum=a+b;
	System.out.println("sum is "+sum);
	}
}
