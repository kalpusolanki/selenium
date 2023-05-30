package timepass;

import java.util.Iterator;
import java.util.TreeSet;

public class removeduplicate_variables 
{
public static void main(String[] args) 
{
	String s1 ="abcdefabcdef";
	
	// in the form of string
//	String[] a=s1.split("");
//	
//	TreeSet<String> ts = new TreeSet<String>();
//	
//	for(int i=0;i<=a.length-1;i++)
//	{
//		ts.add(a[i]);
//	}
//	Iterator it = ts.iterator() ;
//	while(it.hasNext())
//	{
//		System.out.println(it.next());
//	}
	System.out.println("========================================");
	// in the form of string
	char a[]=s1.toCharArray();
	
	TreeSet<Character> ts = new TreeSet<Character>();
	
	for(int i=0;i<=a.length-1;i++)
	{
		ts.add(a[i]);
	}
	Iterator it = ts.iterator() ;
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	
	
	
	
}
}
