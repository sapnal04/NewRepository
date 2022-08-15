package Interface;

public interface fatherr {
	void free();
	void bank();
	
	static void health()
	{System.out.println("Father's health");}
	
	default void help()
	{System.out.println("Father's help");}

}
