# Practising adding items in List
Fruitlist = ["Apple" , "Orange" , "Mango"]
Fruitlist.append("Grapes")
print(Fruitlist)

# Practising Inserting items in specific position

Fruitlist.insert(2 , "Banana")
print("New List after insertion : ", Fruitlist)

# Printing specific RANGE of list

print(Fruitlist[1])
print(Fruitlist[1 : 3])

 # Chill Practising with Class Task

FamilyList = ["Father" , "Mother" , "Son" , "Daughter"]
print(FamilyList[-2:-1])

# Changing the list items
Fruitlist[0] = "BlackBerry"
print(Fruitlist)

#Changing items in Range

Fruitlist[1:3] = ["Mange" , "Cherry"]
print(Fruitlist)

# Extending one list by adding another List in first List

list1 = ["Tropical" , "Mangrove"]
list2 = ["Mangrove"]
list1.extend(list2)
print(list1)

# Extending List with Tuple(Tuple list unchangeable, ordered and allow duplicate elements)

list = ["Ganga" , "Yamuna"]
thistuple = ["Saraswati"]
list.extend(thistuple)
print(list)

# Removing items from list

Fruitlist.remove("Banana") 

 # Deleting a specific position without knowing what a list contains

del Fruitlist[1] 

# Deleting items in Range

del Fruitlist[1 : 3]

# Using of pop position to delete a last position from list

list.pop() 
print(list)

