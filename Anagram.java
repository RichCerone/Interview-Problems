/**
 * Determine if 2 Strings are anagrams.
 * 
 * @author Richard
 * @date 3/25/2016
 */

import java.util.Hashtable;

public class Anagram
{
    /**
     * Checks if 2 words are anagrams. 
     * Using a hash table is faster than searching and
     * comparing both words. The idea is that if both words 
     * contain the same amount of letters then it will form 
     * an anagram. Assuming the words entered are actually
     * words and not random letters grouped together.
     * 
     * @param a is word1 
     * @param b is word2
     */
    private Boolean isAnagram(String a, String b)
    {
        //Word needs to be same length to be an anagram.
        if(a.length() == b.length())
        {
            Hashtable <Character, Character> table = new Hashtable<Character, Character>();
            for(int i = 0; i < a.length(); i++) //Put word a in a hash map.
            {
                table.put(a.charAt(i), a.charAt(i));
            }

            for(int i = 0; i < b.length(); i++) //Compare word b with hash map.
            {
                if(table.contains(b.charAt(i)))
                {
                    return true; //Is a anagram.
                }
                else
                {
                    return false; //Is not an anagram.
                }
            }
        }
    }
    
    public static void main(String[] args)
    {
        String word1 = "debit card";
        String word2 = "bad credit";
        
        Anagram a = new Anagram();
        System.out.println(a.isAnagram(word1, word2));
    }
}
