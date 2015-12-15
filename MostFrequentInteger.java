package test.algorithms;

import java.util.*;

/**
 * Most Frequent Integer In An Array problem:
 * 
 * Find the most frequent integer in an array.
 * 
 * @author Richard Cerone
 */
public class MostFrequentInteger 
{
    /* This is probably not the best way to solve this problem, but it is one 
     * way. Runtime wise this is O(n^3) which leaves a lot to be desired :(.  
     */
    public static void main(String[] args)
    {
        int[] array = {1,2,4,4,6,7,4,5,5,2,1,3}; //Our example array.
        
        //The array list is containing numbers we are looking for.
        ArrayList<Integer> nums = new ArrayList<Integer>();
        
        //The map will hold how many times that number repeated for the given 
        //key.
        Map<Integer, Integer> results = new HashMap<Integer, Integer>();
        
        //Use double for loop for search (O(n^2)).
        for(int i = 0; i < array.length; i++)
        {
            for(int j = 0; j < array.length; j++)
            {
                //If we find a repeat...
                if(array[j] == array[i])
                {
                    //Add it to the array of current number we are counting
                    nums.add(array[i]);
                }
                if(j == array.length-1) //Once we reach the end...
                {
                    //Get the amount of times the number repeated.
                    results.put(array[i], nums.size());
                    nums.clear(); //Clear the array for the next round.
                }
            }
        }
        
        int larger = 0; //This will hold the current largest repeat.
        int current = 0; //This will hold the current value being compared.
        int key = 0; //This will hold the actual number
        
        for(int i = 0; i <= results.size(); i++)
        {
            if(results.containsKey(i)) //Check if key exists.
            {
                current = results.get(i); //Get value to be compared.

                //If the value obtained is greater than current largest...
                if(current > larger)
                {
                    larger = current; //replace largest with new largest.
                    key = i; //The key will be the value of i.
                }
            }
        }
        
        System.out.println("The most frequent integer is: " + key);
    }
}
