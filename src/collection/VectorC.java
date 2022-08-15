package collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorC {

	public static void main(String[] args) {
		Vector v=new Vector(); //create object of vector class
		
		v.add("Sapna");
		v.add(125);
		v.add('B');
		v.add(true);
		v.add('B');
		v.add(35.78);
		v.add(null);
		v.add(null);
		v.add("Sapna");
		v.add("Tannu");
	
		
		System.out.println(v);
		System.out.println(v.get(5));
		System.out.println(v.size());
		System.out.println(v.isEmpty());
		System.out.println(v.lastElement());
		System.out.println(v.lastIndexOf(null));
		System.out.println(v.capacity());
		v.add(null);
		System.out.println(v.capacity());
		System.out.println(v);
		v.add(3,'V');
		System.out.println(v);
//		v.clear();
//		System.out.println(v.isEmpty());
//		System.out.println(v.);
//		
		System.out.println("---------");
		//dynamic loop
		for(int i=0;i<=v.size()-1;i++)
		{System.out.print(v.get(i)+" ");}
		System.out.println();
		System.out.println("--------");
		//reverse
		for(int j=v.size()-1;j>=0;j--)
		{System.out.print(v.get(j)+" ");}
		System.out.println();
		System.out.println("--------");
		//for each loop
		System.out.println("for each");
		for(Object ea:v)
		{
			System.out.print((ea)+" ");
		}
		System.out.println();
		System.out.println("---------");
		//iterator
		System.out.println("iterator");
		Iterator it = (v).iterator();
		while(it.hasNext())
		{System.out.print(it.next()+" ");}
		System.out.println();
		System.out.println("---------");
		System.out.println("list iterator");
		//ListIterator
		
		ListIterator li = (v).listIterator();
		while(li.hasNext())
		{System.out.print(li.next()+" ");}
		System.out.println();
		System.out.println("---------");
		
		//enumerator
		System.out.println("Enumrator");
		Enumeration en = v.elements();
		while(en.hasMoreElements())
		{System.out.print(en.nextElement()+" ");}
		

	}

}
