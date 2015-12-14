package test.algorithms;
/**
 * FizzBuzz problem:
 * 
 * "Write a program that prints the numbers from 1 to 100. But for multiples of 
 * three print “Fizz” instead of the number and for the multiples of five print 
 * “Buzz”. For numbers which are multiples of both three and five print 
 * “FizzBuzz”."
 * 
 * @author Richard Cerone
 */
public class FizzBuzz
{
    
    /**
     * Using modulo is the easiest way to do this because it requires no other
     * methods.
     */
    public static void main(String[] args)
    {
        for(int i = 0; i <= 100; i++)
        {
            if(i%3 == 0 && i%5 == 0) //Multiples by both 3 & 5. 
            {
                System.out.print("FizzBuzz ");
            }
            else if(i%3 == 0) //Only 3.
            {
                System.out.print("Fizz ");
            }
            else if(i%5 == 0) //Only 5.
            {
                System.out.print("Buzz ");
            }
            else //Not a multiple by either.
            {
                System.out.print(i + " ");
            }
        }
    }
}

