package casting;

public class UpcastingSon extends Maaa {

	//process where parent class acquires property of child class
	//object of subclass is created and reference is of parent class
	//while calling only common properties will display
	//any extra property/method of subclass will not display
	//output me subclass k method ki definition ayegi coz upcasting means
	//super, sub ki property lega...opposite of inheritance
	public static void main(String[] args) {
		Maaa m=new UpcastingSon();
		m.eyes();
		m.nature();
				
		}
	   
	public void nature()
	{System.out.println("loving");}
	
	public void eyes()
	{System.out.println("broad");}

	public void smile()
	{System.out.println("weird");}
}

