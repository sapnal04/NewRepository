package Inheritance1;

public class SingleLevel extends Parent {

	public static void main(String[] args) {
		ice();
		SingleLevel s=new SingleLevel();
		s.hat();
		s.snow();
		System.out.println("========");
		Parent.gun();
		Parent p=new Parent();
		p.hat();
		
		

	}
	
	public static void ice()
	{System.out.println("Igloo");}
	
	public void snow()
	{System.out.println("snowman:)");}

}

