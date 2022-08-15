package callingAccessSpe;

import StaticNonStaticMethodCalling.Static;
import accessSpecifier.MainClass;

public class DiffPackage extends MainClass {

	public static void main(String[] args) {

		MainClass m=new MainClass();
		m.his();
		
		DiffPackage d=new DiffPackage();
		d.his();
		d.their();
		
		Static s=new Static();
		s.metro();
	

	}


}
