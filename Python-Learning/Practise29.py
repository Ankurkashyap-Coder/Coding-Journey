# PRIME

user_input = int(input("Enter the number to check Prime "))
count = 0
#CHECKING PRIME BY RUNNING LOOP FROM 1 TILL USER_INPUT

for i in range(1 , user_input + 1):
    if user_input % i == 0:
        count +=1
# CHECKING PRIME

if(count == 2):
    print("Prime Number")
else:
    print("Not a Prime Number")        

