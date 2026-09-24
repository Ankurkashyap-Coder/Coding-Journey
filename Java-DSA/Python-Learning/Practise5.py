a = int(input("Enter the first number"))
b = int((input("Enter the second number")))
c = int(input("Enter the third number"))


if (a >= b) and (a >= c):
 greatest = a

elif (b >= a) and (b >= c ):
 greatest = b
else:
 greatest = c

 print("The largest number is :" , greatest)
