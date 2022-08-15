package accessSpecifier;

public class MainClass {

	public static void main(String[] args) {
		MainClass m=new MainClass();
		m.his();
		m.her();
		m.their();
		m.them();
		

	}

	public void his()
	{System.out.println("His");}
	
	private void her()
	{System.out.println("Her");}
	
	void them()
	{System.out.println("Them");}
	
	protected void their()
	{System.out.println("Their");}
}

