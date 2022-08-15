package abstractConcrete;

public class Concrete extends Abstract1 {

	public static void main(String[] args) {
		Concrete f=new Concrete();
		f.apple();
		f.ball();
		f.egg(); 
        f.cat();
        Abstract1.doll();
	}

	@Override
	public void apple() {
	System.out.println("Heloooooooooooo");
		
	}

	@Override
	public void ball() {
		System.out.println("Haloooooooooo");
		
	}
	
	
	public void cat()
	{System.out.println("doll");}

}
