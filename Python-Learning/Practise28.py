# GCD
# IMPORTING MATH CLASS SO THAT IT BECOME EASY TO FIND GCD
import math as m

# TAKING INPUT FROM USER

a = int(input("Enter first number to find GCD"))
b= int(input("Enter Second number to Find GCD"))
c = 42

# USING MATH CLASS GCD METHOD

c = m.gcd(a,b,c)

# PRINTING THE RESULT 

print(f'The GCD of numbers {a} and {b} is :' , c)