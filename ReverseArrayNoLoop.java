package test.algorithms;

/**
 * Reverse Array problem:
 * 
 * Reverse an array without using a loop.
 * 
 * @author Richard Cerone
 */
public class ReverseArrayNoLoop
{
    /**
     * This problem is solved via recursion.
     * 
     * @param initial our initial array we want to reverse.
     * @param result the array that will be the result of the reversion.
     * @param countInitial the counter for the index of the initial array.
     * @param countResult the counter for the index of the reversed array.
     * @return a reversed array.
     */
    private static int[] reverse(int[] initial, int[] result, int countInitial, int countResult)
    {
        /* If the counter for the reversed array is equal to the size of the
         * initial array then we are at the end.
         */
        if(countResult == initial.length-1)
        {
            result[countResult] = initial[countInitial]; //Do last swap. 
            return result; //return reversed array.
        }
        else //Our index for our result array is != to initial.length - 1
        {
            result[countResult] = initial[countInitial]; //Do swap.
            //Continue to swap until we reach the index = initial.length - 1.
            return reverse(initial, result, countInitial-1, countResult+1);
        }
    }
    
    public static void main(String[] args)
    {
        int[] array = {1,2,3,4,5,6,7};
        int [] reversedArray = new int[array.length];
        
        reversedArray = reverse(array, reversedArray, array.length-1, 0);
        
        for(int i = 0; i < reversedArray.length; i++)
        {
            System.out.print(reversedArray[i] + " ");
        }
    }
}
