package array;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		// using new keyword
		// array declaration
		String students[][] = new String[3][2];

		// array initialization
		students[0][0] = "Sapna";
		students[0][1] = "Tannu";
		students[1][0] = "Kshittu";
		students[1][1] = "Akhil";
		students[2][0] = "Totu";
		students[2][1] = "Kanu";

		// usage
		// to write names in matrix form we will remove ln from printing statement
		// so next o/p will be by side of one without ln,
		// then 2nd me ln hai to uske next wala line me ayega uske niche
		// white space is to give space
		System.out.print(students[0][0] + " ");
		System.out.println(students[0][1] + " ");
		System.out.print(students[1][0] + " ");
		System.out.println(students[1][1] + " ");
		System.out.print(students[2][0] + " ");
		System.out.println(students[2][1] + " ");
		System.out.println("======================");

		// now using the loop
		for(int i=0;i<=2;i++)//outer loop for row,i=0,1,2([3])
		{
			for(int j=0;j<=1;j++)//inner for loop for column,j=0,1([2])
			{System.out.print(students[i][j]+" ");}
			System.out.println();//This statement after one execution will 
		//will shift next execution cycle to second line
		}

	}

}
