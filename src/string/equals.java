package string;

public class equals {

	public static void main(String[] args) {
		String a="Teeju";
		String b="Teeja";
		String c="teeju";
		String d=new String("Teeja");
		String e=new String("teeja");
		String f="Teeja";
		
		System.out.println(a==b);//compares memory location
		System.out.println(b==f);
		
		//now comparing after saving
		
	boolean m=(d==f);
	    System.out.println(m);
	    System.out.println("========");
	    System.out.println(d.equals(e));//compares content
	    System.out.println(c.equals(f));
	}

}

