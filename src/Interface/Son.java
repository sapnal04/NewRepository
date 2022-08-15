package Interface;

public class Son implements fatherr,motherr{

	public static void main(String[] args) {
		Son s=new Son();
		s.bank();
		s.care();
		s.free();
		fatherr.health();//calling father static method
		motherr.health();////calling mother static method
		s.help();//calling default from both interface
		s.love();
		

	}

	@Override
	public void love() {
		System.out.println("love");
		
	}

	@Override
	public void care() {
		System.out.println("care");
		
	}

	@Override
	public void free() {
		System.out.println("free");
		
	}

	@Override
	public void bank() {
		System.out.println("bank");
			
	}

	@Override
	public void help() {
		motherr.super.help();
		fatherr.super.help();
		
	}

}
