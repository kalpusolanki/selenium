package mock1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class example2 
{
public static void main(String[] args) 
{
TreeSet ts = new TreeSet() ;
	
	ts.add("kalpesh");
	ts.add(" rahul");
	ts.add("bajrang");
	ts.add("rupesh");
//	ts.add(101);
////	ts.add(null);
//	ts.add('A');
	
	System.out.println(ts.isEmpty());
	System.out.println(ts);
	System.out.println(ts.size());
	
	Iterator it =ts.iterator()  ;
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	System.out.println("===========for each loop==========");
	
	ts.remove("kalpesh");   // remove kalpesh
for(Object k:ts)
{
	System.out.println(k);
	}

}
}
