"""
Reverse a String iteratively and recursively.

@author Richard Cerone
"""

word = "Cat" #Example word.

#Iterative way:
def reverseIteratively():
    array = list(word)
    tempArray = [] #For temp storage.
    count = 0

    #From index total length to index 0:
    for i in range(len(array)-1, -1, -1):
        tempArray.append(array[i])
        print(tempArray[count])
        count+=1

reverseIteratively()

#Recursive way:
"""
Recursively reverses a string.

@param word is the word that is to be reversed.
@param length is the length of the word.
"""
def reverseRecursively(word, length):
    i = length
    if(i == 0):
        print(word[0])
    else:
        print(word[length])
        reverseRecursively(word, length-1)

reverseRecursively(word, len(word)-1)

