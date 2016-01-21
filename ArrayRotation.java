package test.algorithms;

/**
 * Array Rotation
 * 
 * Given 2 integer arrays, determine if the 2nd array is a rotated version of 
 * the 1st array. Ex. A={1,2,3,5,6,7,8} B={5,6,7,8,1,2,3}
 * 
 * @author Richard Cerone
 */
public class ArrayRotation
{
    public static void main(String[] args)
    {
        int[] a = {1,2,3,5,6,7,8};
        int[] b = {5,6,7,8,1,2,3};
        
        int[] sub = new int[((a.length-1)/2) + 1];
        
        boolean rotation = true;
        
        int count = 0;
        for(int i = (a.length-1)/2; i < a.length; i++)
        {
            sub[count] = a[i];
            count++;
        }
        
        for(int i = 0; i < sub.length; i++)
        {
            if(sub[i] != b[i])
            {
                System.out.println("This is not a rotated array."); 
                rotation = false;
                break;
            }
        }
        
        if(rotation == true)
        {
            if(a.length%2 == 0)
            {
                sub = new int[(a.length-1)/2];
            }
            else
            {
                sub = new int[(a.length-2)/2];
            }

            for(int i = 0; i < sub.length; i++)
            {
                sub[i] = a[i];
            }

           int start;
           if(b.length%2 == 0)
           {
               start = (b.length-1)/2;
           }
           else
           {
               start = (b.length-2)/2;
           }

           count = 0;
           for(int i = start; i < sub.length; i++)
           {
               if(sub[count] != b[i])
               {
                  System.out.println("This is not a rotated array.");
                  rotation = false;
                  break;
               }
               else
               {
                   count++;
               }
           }
           
           if(rotation == true)
           {
               System.out.println("This is a rotated array.");
           }
        }
    }
}
