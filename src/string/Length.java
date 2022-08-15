package string;

public class Length {

	public static void main(String[] args) {
		String a="Tanishka";
		String b=new String("Tasha");
		String c="";
		String d=" ";//count white space in length
		//String e=null;//null means nothing,so it will show error
		//java.lang.nullPointerException
		//If this error occurs prgram will not rum after this step
		
		int f=a.length();//this is written to store value
		int g=b.length();//int g will store length of b
		//store krne k liye wo datatype use karenge jisme result milega
		System.out.println(f);//it gives printout
		System.out.println(g);
		System.out.println(c.length());
		System.out.println(d.length());
		//System.out.println(e.length());

	}

}
