package array;

public class Array1 {

	public static void main(String[] args) {
	//I want to store students name
		
		//array declaration
		String name[]=new String[7];//array of name-->name[];[7]->capacity
		
		//array initialization
		name[0]="Sapna";
		name[1]="Tanvi";
		name[2]="Kshitiz";
		name[3]="Akhil";
		name[4]="Kanu";
		name[5]=null;
		name[6]="Goshi";
	//	name[7]="mitthu";//ArrayIndexOutOfBoundsException: Index 7 out of bounds
		//program will not run if we add any extra content
		//usage
		System.out.println(name[1]);
		System.out.println(name[6]);
		//System.out.println(name[7]);//exception
		System.out.println(name[5]);
		System.out.println("=========");
		
		//I want roll numbers of above students
		int roll[]=new int[7];//declaration
		roll[0]=23; roll[1]=25; roll[2]=35;//initialization
		roll[3]=55; roll[4]=259; roll[5]=125; roll[6]=250;
		int a=roll[2];//for storage
		System.out.println(a);
		System.out.println(roll[6]);
		
		
	}

}
