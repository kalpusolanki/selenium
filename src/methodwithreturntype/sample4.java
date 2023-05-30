package methodwithreturntype;

public class sample4 
{
public static String convertnametouppercase() 
{
	String name = "kalpesh";
	return name.toUpperCase();
}

public static void main(String[] args)
{
	System.out.println(convertnametouppercase());
	
	String s1=convertnametouppercase();
	System.out.println(s1);
	
	
	convertnametouppercase(); // we cant get return value directly call the method we need to store fist
}



}
