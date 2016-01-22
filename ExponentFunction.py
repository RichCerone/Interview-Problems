"""
Implement an exponent function.

@author Richard Cerone
"""

def exponent(base, power):
    result = 1
    for i in range(0,power):
        result *= base
    return result

print(exponent(2,2))
