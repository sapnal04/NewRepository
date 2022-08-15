package string;

public class startsWith {

	public static void main(String[] args) {
		String a="Teejushree";
		String d=new String("Teejahersef");
		
		System.out.println(a.startsWith("t"));//case sensitive
		System.out.println(a.startsWith("T"));
		System.out.println(a.startsWith("Tee"));
		System.out.println(a.startsWith("shree"));
		System.out.println(d.startsWith("Te"));
	}

}
