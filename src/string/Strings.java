package string;

public class Strings {

	public static void main(String[] args) {
		
		
		String a="SapnaLohani"; //object created without new keyword
		String b=new String("KshitizTEWARI");//object created with new
		                                     //keyword
		
		System.out.println(a);//direct printing statement
		System.out.println(b);//direct printing statement
		System.out.println("************");
		//using length method
		
		System.out.println(a.length());////print length of the object a
		System.out.println(b.length());//print length of the object b
		
		//Now this can be used only once for direct printing,so to save it
		//for future use we need to store this somewhere
		
		int apple=a.length();
		int ball=b.length();
		
		System.out.println(ball);
		System.out.println("*************");
		
		String c="  ";
		System.out.println(c.length());
		
		//null means there is nothing, so it gives error
		//Exception-nullPointerException and we cannot get result after this exception
		//String d=null;
		//System.out.println(d.length());
		
		//using touppercase() method
		System.out.println("************");
		System.out.println(a.toUpperCase());
		System.out.println(b.toUpperCase());
		String term=b.toUpperCase();
		System.out.println(term);
		
		//using tolowercase ()method
		
		System.out.println("*********");
		System.out.println(a.toLowerCase());
		System.out.println(b.toLowerCase());
		
		//use of equals method
		System.out.println("*************");
		String e="Hello";
		String f="Hello";
		String g= new String("Helloji");
		String h=new String("Class");
		String i=new String("Hello");
		
		System.out.println(e==f);//this compares the memory location
		System.out.println(e==i);
		System.out.println(g==h);
		System.out.println(e.equals(f));//compares contents
		System.out.println(e.equals(i));
		System.out.println(f.equals(g));
		boolean x=(e==f);
		System.out.println(x);
		System.out.println("***********");
		
		//equalsIgnore () method---ignores the case and only compares
		//content
		System.out.println(e.equalsIgnoreCase(i));
		boolean zz=e.equalsIgnoreCase(i);
		
		//contains() method
		
		//isEmpty() method- result true if length is zero
		System.out.println("###############");
		String j="Harsh";
		String k=new String("Bharti");
		String l="    ";
		//String m=null;
		String n="";
		System.out.println(j.isEmpty());
		System.out.println(k.isEmpty());
		System.out.println(l.isEmpty());
		System.out.println(n.isEmpty());
		//System.out.println(m.isEmpty());NullPointerException.java
		System.out.println("***********");
		
		//isBlank() method-Returns true if the string 
		//is empty or contains only white space code points, otherwise false.
		System.out.println(j.isBlank());
		System.out.println(l.isBlank());
		System.out.println(n.isBlank());
		System.out.println("+++++++++++++");
		
		//charAt-tell the charater present at a mentioned max index
		System.out.println(j.charAt(2));
		System.out.println(k.charAt(3));
		
		
		//endsWith() method
		System.out.println("*************");
		System.out.println(e.endsWith("o"));
		System.out.println(g.endsWith("i"));
		System.out.println(g.endsWith("ji"));
		System.out.println(g.endsWith("Hello"));
		
		//startsWith() method
		System.out.println("*************");
		System.out.println(g.startsWith("i"));
		System.out.println(g.startsWith("H"));
		System.out.println(g.startsWith("Hel"));
		System.out.println(g.startsWith("llo",2));
		
		

	}

}
