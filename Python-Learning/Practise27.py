#TAKING INPUT FROM USER TO FIND FACTORIAL
fact = int(input("Enter the number whom you want the factorial : "))
result = 1

# Main Logic

for i in range(1, fact + 1):
    result *= i

print(f'Factorial of the number {fact} is :' , result)