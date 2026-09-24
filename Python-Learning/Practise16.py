# A BILL SPLITTER PROGRAM

running_total = 0

num_of_friends = 4

appetizers = 37.89
main_courses = 57.34
desserts = 39.39
drinks = 64.21

# Learning augumentaed opeartion 

running_total += appetizers + main_courses + desserts + drinks
print('Total bill so far:', running_total)

# Using multiplication operation

tip = running_total * 0.25
print('Tip amount:', tip)

running_total += tip
print('Total with tip:', running_total)

# Using division operator

final_bill = running_total / num_of_friends
print('Bill per person:', final_bill)

# Collest Part taking round from how many digits you want after decimal

each_pays = round(final_bill , 2)
print('Each person pays:', each_pays)