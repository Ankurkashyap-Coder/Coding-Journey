user_input = input("Enter a number: ")
num = int(user_input)


n = len(user_input)
original = num
digit_sum = 0


while num > 0:
    digit = num % 10
    digit_sum += digit ** n
    num //= 10  


if digit_sum == original:
    print(f"{original} is an Armstrong number.")
else:
    print(f"{original} is NOT an Armstrong number.")


 