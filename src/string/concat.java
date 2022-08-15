package string;

public class concat {

	public static void main(String[] args) {
		String g="Hello. ";
		String h=new String("Hi. Namaste. ");
		String i="Welcome to India.";
		
		//addition of strings(data)
		System.out.println(g.concat(i));
		System.out.println(h+"Maharashtra");
		System.out.println(g.concat(h).concat(i));
		
		String k=g.concat(h).concat(i);//memory allocation-saved data
		System.out.println(k);

	}

}
