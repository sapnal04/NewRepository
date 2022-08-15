package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListC {

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		al.add("Sapna");
		al.add("Tanvi");
		al.add('A');
		al.add(234);
		al.add(33.78);
		al.add(null);
		al.add(true);
		al.add("Sapna");
		
		System.out.println(al);
		System.out.println(al.size());
        System.out.println(al.get(5));
        System.out.println(al.indexOf(234));
        System.out.println(al.indexOf(true));
        System.out.println(al.indexOf("Sapna"));
        System.out.println(al.lastIndexOf("Sapna"));
        System.out.println(al.contains("Tanvi"));
        System.out.println(al.contains(67));
        System.out.println(al.remove(3));
        System.out.println(al);
        al.add(567);
        System.out.println(al);
        al.add(3, "Kshittu");
        System.out.println(al);
        System.out.println(al.remove(true));
        System.out.println(al);
        
        //loop(static or hard coding)--put index manually
        
        //loop dynamic coding
        for(int i=0;i<=al.size()-1;i++)
        {System.out.println(al.get(i));}
        
        System.out.println("=======");
        
        for(int i=al.size()-1;i>=0;i--)
        {System.out.println(al.get(i));}
	
        System.out.println("------------");
	//for each loop
        System.out.println("=(for each loop)=");
        for(Object e:al) 
        {System.out.print((e)+" ");}
        System.out.println();
        System.out.println();
        //iterator
        System.out.println("=(Iterator)=");
        Iterator it=(al).iterator();
        while(it.hasNext())
        {System.out.println(it.next());}
        System.out.println();
        //list Iterator
        System.out.println("=(List iterator)=");
        ListIterator li = (al).listIterator();
        Object l;
		while(li.hasNext())
        {
			System.out.println(li.next());
        }
	}

}
