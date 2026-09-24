# CHANGING NAME VOWELS WITH " * "

user_name = str(input("Enter your name "))


vowels = "aeiouAEIOU"

for i in vowels:
    user_name = user_name.replace(i , "*")

print(user_name)    
