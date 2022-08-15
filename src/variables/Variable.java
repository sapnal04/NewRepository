package variables;

public class Variable {
	
	int a=10;
	int b=20;
	static int c=30;

	public static void main(String[] args) {
		/*if variable declared outside method, block and constructor called as global variable
        if variable is declared inside method, block and constructor called as local variable*/
		//static method--->only static variable
		//non-static method--->static variable and non-static variable
		
		//to call static method--->method name()--->()method
		//to call static method--->variable name
		
		//to call non static method--->object name.method name()
		//to call static method---> objectname.variable
		
		Variable v=new Variable();
		v.sum(); //to call non static method
		
		System.out.println(v.a);//to call non static variable
		System.out.println(v.b);
		
		int add3=v.a+v.b;
		System.out.println(add3);
		
		sum1(); //to call static method
		System.out.println(c); //to call static variable
		
		
	}
	public void sum()
	{
		int add=a+b+c; //a and b is not static global variable
		System.out.println(add); //usage
	}
	public static void sum1()
	{
		int add1=100+c; //c is static global variable
		System.out.println(add1);}
}
