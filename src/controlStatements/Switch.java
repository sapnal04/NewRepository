package controlStatements;

public class Switch {

	public static void main(String[] args) {
		String season="Summer";
		switch(season)
		{
		
		case"Summer":System.out.println("hot");
		break;
		
		case "Winter": System.out.println("cold");
		break;
		
		case"Monsoon": System.out.println("Water");
		break;
		
		default:System.out.println("valid season");
		break;}

	}

}

