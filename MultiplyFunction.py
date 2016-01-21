"""
Multiply Function Without *
Write a multiply function that multiples 2 integers
without using *.

@author Richard Cerone
"""

"""
Multiplication is just addition repeated.
Therefore 2*3 is equivalent to 2+2+2.
"""
def multiply(num1, num2):
    for i in range(0,num2-1):
        num1 += num1
    return num1

#Main:
print(multiply(3,2))
