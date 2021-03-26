package test.algorithms;

/**
 * Fibonacci problem:
 * 
 * Calculate the Fibonacci value for a number X
 * 
 * @author Richard Cerone
 */
public class Fibonacci
{
    private static int fibonacci(int num)
    {
        if (num == 0)
        {
            return 0;   
        }
        
        if (num == 1)
        {
            return 1;   
        }
        
       int a = 0; //Step 1 (n = 0)
       int b = 1; //Step 2 (n = 1)
       int p; //holds our previous value (x_n-1)
       
       //Since we performed 2 steps already we are really on n = 2.
       for(int i = 0; i < num-1; i++)
       {
           p = a; //Get previous value.
           a = a+b; //Perform n operation.
           b = p; //next is the sum of n.
       }
       
       return b + a; //Return fibonacci value of x.
    }
    
    public static void main(String[] args)
    {
        int num = fibonacci(5);
        
        System.out.println(num);
    }
}
