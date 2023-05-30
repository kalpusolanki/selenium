package methodwithreturntype;

public class sample1 
{
	public static void main(String[] args)
	{
		// we got value in main method for use to perform diff operation in main method
		System.out.println(add(25, 30)); // only gives return value of int type
		
System.out.println("-------------------------------");
		
		int c= add(20,10) ;
		System.out.println(c);
		
		System.out.println("--------------------------");
		
		add(25,60);   // we cant get return value while method call we need to store value first
	}
	
	
public static int add(int a,int b) 
{
	
	int c=a+b;
	return 10;
	

}
}
