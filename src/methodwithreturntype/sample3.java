package methodwithreturntype;

public class sample3 
{
public static void main(String[] args) 
{
	
	sample3 o =new sample3();
	int c = o.M1(20, 25);
	System.out.println(c);
	System.out.println(o.M1(12, 25));
	
}




public int M1(int a,int b) 
{
	int c=a*b;
	return c;
}

}
