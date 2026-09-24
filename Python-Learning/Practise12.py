Range = int(input("Enter the number users you want to be sorted ")) # Aditi Anaya Shreya Shreya Shakti Tegal  Vantika Avini Jha

# Sorting the list items

listGirls = ["Aditi" , "Ananya" , "Shreya Shakti" , "Tajal" , "Vantika" ,"Avini Jha"]
listGirls.sort()
print(listGirls)

# Coping a list into another list

list = ["Goa" , "Hyderabad" , "Lucknow" , "Mumbai" , "Bangalore"]

copy_list = list.copy()
print(copy_list)

# Coping and appending two list

list2 = ["Arnav" , "Suman" , "Vabhav"]
copylist1 = list2.copy()
list2 = ["Sohan" , "Gignaswar"]
copylist1.append(list2)
print(copylist1)

# Joining two list

list2 = ["Arnav" , "Suman" , "Vabhav"]
copylist2 = list2.copy()
list3 = ["Sohan" , "Gignaswar"]

resultlist = list2 + list3

print(resultlist)

# Extending list 

list6 = ["Arnav" , "Suman" , "Vabhav"]

list7 = ["Sohan" , "Gignaswar"]
list6.extend(list7)

print(list6)

