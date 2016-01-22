"""
Find the first non-repeated character in a String

@author Richard Cerone
"""

word = "aaaa baaa" #Example word.
#Every string is an array of characters if you think about it. 
array = list(word)
count = 0

for letter in word:
    if array[count+1] != letter:
        #We'll check for spaces for better clarification.
        if(array[count+1] == " "):
            array[count+1] = "'space'"
        print("Character " + array[count+1] + " does not repeat")
        break
    count += 1

    
