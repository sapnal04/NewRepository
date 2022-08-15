package controlStatements;

public class Practice1 {

	public static void main(String[] args) {
		int a = 30;
		if(a>30)
		{System.out.println("valid");}
		else
		{System.out.println("invalid");}
		
		System.out.println("======");
		
		String season="winter";
		if(season=="winter")
		{System.out.println("cool");}
		else if(season=="monsson")
		{System.out.println("raining heavily");}
		else if(season=="autumn")
		{System.out.println("leaves falling");}
		else
		{System.out.println("invalid");}
		
		System.out.println("======");
		
		//nested if else
		String un="2222";String pass="hello";
		if(un=="222")
		{if(pass=="hello")
			{System.out.println("enter amount to be withdrawn");}
		else
			{System.out.println("invalid password");}}
		else
		{System.out.println("invalid userid");}
		
		//switch
		String day="Monday";
		
		switch(day)
		{
		case "Sunday": System.out.println("holiday");
		break;
		
		case "Monday" : System.out.println("first day of week");
		break;
		
		default:System.out.println("no day");
		break;
		}
		
		

	}

}
