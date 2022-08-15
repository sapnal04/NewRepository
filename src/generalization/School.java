
package generalization;

public class School {

	public static void main(String[] args) {
		Beersheba b=new Beersheba();
		Nirmala n=new Nirmala();
		SacredHeart s=new SacredHeart();
		
		b.exam();
		b.result();
		b.syllabus();
		b.sports();
		
		System.out.println("===========");
		
		n.exam();
		n.result();
		n.syllabus();
		n.painting();
		
		System.out.println("============");
		
		s.exam();
		s.result();
		s.syllabus();
		
		 System.out.println("==============");

	}

}
