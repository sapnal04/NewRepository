package array;

public class SplitMethodString {

	public static void main(String[] args) {
		
		
		String name="SapnaLohani";
		String n[]=name.split("");
		int a=name.length();
		for(int i=0;i<=a-1;i++)
		{System.out.print(n[i]+" ");}
		
		System.out.println();
		
		for(int j=a-1;j>=0;j--)
		{System.out.println(n[j]);}
		
		
		
		

	}

}
