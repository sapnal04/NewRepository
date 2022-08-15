package string;

public class lastIndexOf {

	public static void main(String[] args) {
		String i="Welcome India to India.";
		
		System.out.println(i.lastIndexOf("i"));
		System.out.println(i.lastIndexOf("Ind"));
		System.out.println(i.lastIndexOf("I",12 ));
		/*jo index liya hai humne usse pehle us charater ka
		 *  jo bhi last index hoga means I is 2 times ,so
		 *  12 se pehle jo last I hoga(second wala) uska index ayega
		 */

	}

}
