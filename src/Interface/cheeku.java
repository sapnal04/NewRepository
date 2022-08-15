package Interface;

public class cheeku implements mum,paa{

	public static void main(String[] args) {
		cheeku c=new cheeku();
		c.gussa();
		c.hear();
		mum.health();
		paa.health();
	}

	@Override
	public void gussa() {
		mum.super.gussa();
		paa.super.gussa();
	}

	@Override
	public void hear() {
		System.out.println("hear");
		
	}

}
