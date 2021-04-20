using System;

/** 
 * Given an integer, for each digit that makes up the integer determine whether 
 * it is a divisor. Count the number of divisors occurring within the integer. 
 */
public class Program
{
  public static int FindDigits(int n) 
  {
    var stringRep = n.ToString();
    var count = 0;
    foreach (var digit in stringRep)
    {
      try
      {
        if (n % int.Parse(digit.ToString()) == 0)
        {
          count++;
        }
      }
      catch (DivideByZeroException) // Need to consider dividing by zero. Don't count if dividing by zero.
      {

      }
    }

    return count;
  }
  
  public static void Main()
  {
    Console.WriteLine(FindDigits(1012));
  }
}
