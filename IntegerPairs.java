package test.algorithms;

/**
 * Integer Pairs In an array.
 * 
 * Find all pairs in an integer array whose sum is equal to 10.
 * 
 * @author Richard Cerone
 */
public class IntegerPairs 
{
    public static void main(String[] args)
    {
        /* The algorithm for solving this problem is easy, but requires some 
         * thinking. 10 - n; where n is the number in the list; will give you 
         * the second pair you need in order to get 10.
         */
        int[] array = {1,5,3,2,5,6,7,8}; //Our array for testing.
        int secondPair = 0; //The second pair we need.
        
        for(int i = 0; i < array.length; i++)
        {
           for(int j = 0; j < array.length; j++)
           {
               secondPair = 10 - array[i]; //Perform algo calculation.
               if(array[j] == secondPair && j != i) //Check if it's in the array and not the same position.
               {
                   //Print pairs.
                   System.out.println("Pairs " + secondPair + " and " + array[i] + " equal 10.");
                   break; //Break because we don't need to search anymore.
               }
           }
        }
    }
}
