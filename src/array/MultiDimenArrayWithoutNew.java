package array;

public class MultiDimenArrayWithoutNew {

	public static void main(String[] args) {
		
		int a[][]= {{1,2,3,4,5},{3,4,5,6,7},{7,8,9,0,4}};
		
		for (int i=0;i<=2;i++)
		{for (int j=0;j<=4;j++)
			{System.out.print(a[i][j]+" ");}
		System.out.println();
		}
		System.out.println("===========");
		String b[][]= {{"sa","re","ga","ma"},{"he","me","to","it"}};
		
		for (int i=0;i<=1;i++)
		{for (int j=0;j<=3;j++)
			{System.out.print(b[i][j]+" ");}
		System.out.println();}

	}

}
