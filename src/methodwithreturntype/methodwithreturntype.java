package methodwithreturntype;

public class methodwithreturntype 
{
public static void main(String[] args) 
{
	add(10,20);
	System.out.println(add(10,20)); // we can print dirct value of variable and also method in printing statement

 int num1 = add(10,20);      // value assign to num1
 System.out.println(num1);
 
 System.out.println("------------------");
 System.out.println(add(5,20)); //we can print dirct value of variable and also method in printing statement

// System.out.println(c); we cant print direct return variable we only use information contain in it
}


public static int add(int a, int b) 
{
	int c = a+b;
	
	return c;  // we have to must retun it
}
}
