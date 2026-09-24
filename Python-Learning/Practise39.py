# PRIME FACTORS OF THE NUMBER


user_input = int(input("Enter the number "))

def Prime(n):
    count = 0
    for i in range(2 , n):
        if n%i == 0:
            count += 1

    if (count==0 and n>1) or n==1:
        return 1
    else:
        return 0        

def Primefactor(n):
    count = 0
    for i in range(1,n+1):
        if Prime(i) == 1 and n%i == 0:
            print(i , end = " ")
           

    

        

Primefactor(user_input)                        
    