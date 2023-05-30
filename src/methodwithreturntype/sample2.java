package methodwithreturntype;

public class sample2 
{
public static void main(String[] args) 
{
	int c= M1();
	System.out.println(c);
	
	System.out.println("-----------------");
	M1();
}
public static int M1() 
{   System.out.println(M2());
	//M2();
	return 10;
}


public static double M2()
{
	return 20.20;
}
}
//     flow
//firstly in line 7 we declare the variable it contain 1) exection and return type
//		and in 11 we not declare it thats why its only execute the method not getted return type