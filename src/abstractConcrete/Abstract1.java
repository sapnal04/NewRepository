package abstractConcrete;

public abstract class Abstract1 {

	public static void main(String[] args) {
		
        doll();
  
	}
	public abstract void apple();
	public abstract void ball();
	public static void doll()
	{System.out.println("Complete static method");}
	public void egg()
	{System.out.println("Complete non-static method");}

}

