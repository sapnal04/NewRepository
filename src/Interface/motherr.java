package Interface;

public interface motherr {
	void love();
	void care();
	
	static void health()
	{System.out.println("Mother's health");}
	
	default void help()
	{System.out.println("Mother's help");}


}
