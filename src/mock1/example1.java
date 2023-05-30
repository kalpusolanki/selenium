package mock1;

import java.util.HashSet;
import java.util.Iterator;

public class example1 
{
public static void main(String[] args) 
{
	HashSet hs = new HashSet();
	
	hs.add("kalpesh");
	hs.add(" rahul");
	hs.add(101);
	hs.add(null);
	hs.add('A');
	
	System.out.println(hs.isEmpty());
	System.out.println(hs);
	System.out.println(hs.size());
	
	System.out.println("============================");
	Iterator it = hs.iterator();
	
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	System.out.println("======= for each loop=====================");
	
	for( Object k:hs)
	{
		System.out.println(k);
	}
	
	
}
}
