package string;

public class equalsIgnoreCase {

	public static void main(String[] args) {
		String a="Teeju";
		String c="teeju";
		String d=new String("Teeja");
		String e=new String("teeja");
		
		System.out.println(a.equalsIgnoreCase(e));
		System.out.println(a.equalsIgnoreCase(c));
		System.out.println(d.equalsIgnoreCase(e));

	}

}
