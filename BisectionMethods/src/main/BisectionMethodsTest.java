package main;
import java.util.Random;
public class BisectionMethodsTest {

	public static final double tolarence=0.0001;
	
	public static double function(double value )
	{
		double result;
		result=((value*value*value)-value-1);
		return result;
	}
	
	
	public  static void bisection(double a, double b) 
	{ 
	    if (function(a) * function(b) >= 0) 
	    { 
	        System.out.println("You have not assumed right a and b\n");
	   
	    } 

	    else 
	    {
	  	  
		    double c = a; 
		    while ((b-a) >= tolarence)
		    {  
		        c = (a+b)/2; 
		        if (function(c) == 0.0) 
		            break;  
		        else if (function(c)*function(a) < 0) 
		            b = c; 
		        else
		            a = c; 
		    } 
		    System.out.println("The value of root is : ");
		    System.out.println(c);
	    }
	} 
	public static void main(String arg[])
	{
		int num1,num2;
		Random rand=new Random();
		num1=rand.nextInt(50)-250;
		num2=rand.nextInt(50)+250;
		System.out.println(num1);
		System.out.println(num2);
		bisection(num1,num2);
	}

}
