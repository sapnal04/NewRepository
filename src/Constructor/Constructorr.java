package Constructor;

public class Constructorr {
	//1- declare
	int a; int b; int c;
	
	//2.constructor
	
 public Constructorr()
 {
	a=20; b=40; c=60; 
 }
 public Constructorr(int x)
 {
	 a=x;
 }
 
 public Constructorr(int x, int y)
 {
	 a=x; b=y;
 }
 
 public Constructorr(int x, int y, int z)
 {
	 a=x; b=y; c=z;
 }
	

 public static void main(String[] args) {
	 Constructorr o=new Constructorr();
	 o.sum();
	 Constructorr i=new Constructorr(20);
	 i.sum();
	 Constructorr h=new Constructorr(30, 40);
	 h.sum();
	 Constructorr f=new Constructorr(30, 0, 0);
	 f.sum();

}
 
 public void sum()
 {
	 System.out.println("sum = "+(a+b+c));
 }
}

