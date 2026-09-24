import math as m 

# NEED TO CHECK WHY user_input2.lower() in [answer2.lower(), "vaibhav sooryavanshi"]: IS USED

# Checking user Favorite Game
choice1 = '1. Cricket \n2. Football'
print(choice1)

# Taking user choice input
try:
    choice = int(input("Enter your choice (1 for Cricket, 2 for Football): "))
except ValueError:
    print("Invalid input! Please enter a number.")
    choice = 0

# Now Checking Whether your Knowledge is updated and you able to crack this.
if choice == 1:
    question1 = "Who is called the Cricket God in India?"
    print(question1)
    answer1 = "Sachin Tendulkar"
    user_input = input("Guess the answer: ").strip()
    
    if user_input.lower() == answer1.lower():
        print("You got it.")
        print("Hope you are enjoying. Moving to next Question\n")
        
        question2 = "Who scored the highest runs in the IPL and hit a 15-ball 50 in the year 2026?"
        print(question2)
        user_input2 = input("Guess the Cricketer's name: ").strip()
        answer2 = "Vaibhav Suryanshi" # Formatted as Vaibhav Sooryavanshi in official stats
        
        if user_input2.lower() in [answer2.lower(), "vaibhav sooryavanshi"]:
            print("You got it.")
            print("Thank You for Playing this game.")
            print("See You soon.")
        else:
            print("You failed. Game Over.")
            print("Hope you enjoyed. Take Care. See You soon.")
    else:
        print("You failed try again.")
        print("Hope you enjoyed. Take Care. See You soon.")

elif choice == 2:
    question1 = "Who won the FIFA World Cup 2026?"
    print(question1)
    answer1 = "Spain" # Corrected from Portugal; Spain won the 2026 Final
    user_input = input("Enter the Team name: ").strip()
    
    if user_input.lower() == answer1.lower():
        print("You got it.")
        print("Hope you are enjoying. Moving to next Question\n")
        
        question2 = "Who is the Colombian singer who sang 'Waka Waka'?"
        print(question2)
        user_input2 = input("Guess the Singer's name: ").strip()
        answer2 = "Shakira"
        
        if user_input2.lower() == answer2.lower():
            print("You got it.")
            print("Thank You for Playing this game.")
            print("See You soon.")
        else:
            print("You failed. Game Over.")
            print("Hope you enjoyed. Take Care. See You soon.")
    else:
        print("You failed. Game Over.")
        print("Hope you enjoyed. Take Care. See You soon.")
        
else:
    print("Goodbye!")
