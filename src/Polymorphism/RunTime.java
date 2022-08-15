package Polymorphism;

public class RunTime {

	// method overloading- compile time
	public static void main(String[] args) {
     RunTime r=new RunTime();
      r.test(34);
      r.test(203,30);
      r.test("Independence Day", 15);

	}
	public void test(int a)
	{System.out.println("without parameter : "+a);}
	
	public void test(int a,int b)
	{System.out.println("same method with second parameter");
	System.out.println(a+b);}
	
	public void test(String na,int a)
	{System.out.println(na+":"+a);}

}
