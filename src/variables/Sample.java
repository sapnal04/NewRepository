package variables;

public class Sample {

	public static void main(String[] args) {
		Variable.sum1();//to call static method from another class
		
		Variable v=new Variable();
		v.sum(); //to call non static method from another class
		
		System.out.println(Variable.c);//to call static variable from another class
		
		System.out.println(v.a); //to call non static variable from another class

		System.out.println(v.b); //to call non static variable from another class	}

}}
