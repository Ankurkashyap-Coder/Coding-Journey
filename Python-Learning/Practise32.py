# SUM FOR N NUMBERS 

user_input = int(input("Enter how many numbers sum you want "))
result = 0

#LOOP TO TAKE INPUT NUMBERS FROM THE USER

for i in range(1, user_input + 1):
    taking_input = int(input(f'Enter the {i}  number '))
    result += taking_input


print(f'Sum of numbers given by you is : ',result)    
