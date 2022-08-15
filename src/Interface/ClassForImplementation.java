package Interface;

public class ClassForImplementation implements Interface1{

	public static void main(String[] args) {
		
		ClassForImplementation cf=new ClassForImplementation();
		cf.attire();
		cf.tire();
		cf.sattire();
		System.out.println(Interface1.a);
	}

	@Override
	public void tire() {
		System.out.println("Tire");
		
	}

	@Override
	public void attire() {
		System.out.println("Attire");
		
	}
	
	public void sattire()

	{System.out.println("Tibbet");}
	
	}

