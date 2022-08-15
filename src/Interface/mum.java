package Interface;

public interface mum {
	void hear();
	
	default void gussa()
	{
		System.out.println("mum gussa");
	}
	
	static void health()
	{
		System.out.println("mum health");
	}
	

	

}
