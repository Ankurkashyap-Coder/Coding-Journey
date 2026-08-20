a = int(input("Enter the Range of sum of n numbers."))
total_sum = 0

for i in range(a):
    num = float(input(f"Enter the number : {i + 1} of {a} :"))
    total_sum += num



print(f"The final sum of all numbers is: {total_sum}")