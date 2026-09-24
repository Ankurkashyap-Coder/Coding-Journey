# USE OF FOR LOOP

"""user_input = str(input("Enter your name to be printed five Times : "))

for i in range(1 , 6):
    print(user_input)"""


"""# PRINTING TABLE ACCORDING TO USER CHOICE


user_input_table = int(input("Enter the number whom table you want : "))

for i in range(1, 11):
    print(user_input_table * i)"""


"""# WHILE LOOP SYTAX PRACTISE

result = 0
i = 1
while i <= 5:
    result +=i
    i +=1


print(result)"""

# FACTOR OF THE NUMBER

# USING OF BREAK STATEMENT 

"""for i in range(1,20):
    if i%11 == 0:
        break
    else:
        print(i)"""

# USE OF CONTINUE STATEMENT 


"""for i in range(1,20):
    if i%5==0:
        continue
    else:
        print(i)"""

# FACTORIAL PROGRAM USING RECURSION

#def Factorial(n):

# Defining BASE CASE

#    if n==0 or n==1:
#       return 1

# This is RECURSIVE CASE 

#   else:
#       return n*Factorial(n-1)


#result = Factorial(5)
#print("Factorial of inputed number 5 is :", result)    

# FIBONACCI NUMBER
# BUT BY USING THIS LOGIC OUTPUT LOOK LIKE A LITTLE BIT UNORGANIZED SO, THE SECOND ONE USING LIST IS MORE GOOD TO USE

"""user_input = int(input("Enter the range of how many numbers you want to print of Fibonacci and Range should be greater than 2. "))

a = 0
b = 1


print("Fibonacci numbers within your range are :")
print(a , " , " , b , end = " , ")
for i in range(1 , user_input - 1):
    c = a + b
    a = b
    b = c
    print(c , " , ")"""

user_input = int(input("Enter the range "))

a = 0
b = 1

result = [a , b]

for i in range(1 , user_input - 1):
    c = a + b
    a = b
    b = c
    result.append(c)

print(result)


# LETS CHECK THIS NUMBER TO LIST CHANGING PROGRAM 

# 1. Take input as a string so it can be split into individual characters
user_input = input("Enter a number: ")  # e.g., "521"

# 2. Put it into a list. This automatically splits it into ['5', '2', '1']
digits_list = list(user_input)

result = 0

# 3. Run a loop from the first index (0) up to the length of the list
for i in range(len(digits_list)):
    # 4. Convert each character back to an integer and add to the result
    result += int(digits_list[i])

print("Sum of digits is:", result)

