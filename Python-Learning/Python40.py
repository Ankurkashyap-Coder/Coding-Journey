# ALL ARRAY OPERATIONS IN PYTHON 


# CREATING ARRAY

user_array = [10 , 20 , 30 , 40]


# PRINTING OF PARTICULAR INDEX NUMBER

print(user_array[0])
print(user_array[-1])


# USE OF APPEND METHOD IN ARRAY

user_array.append(50)
print(user_array)


# USE OF EXTEND METHOD

user_array.extend([60, 70])
print(user_array)


# DELETING OF PARTICULAR VALUE

del user_array[2]
print(user_array)


# USE OF MAX METHOD IN PYTHON

print(max(user_array))


# USE OF MIN METHOD IN PYTHON

print(min(user_array))


# USE OF LEN METHOD IN ARRAY

print(len(user_array))


# USE OF REVERSE IN ARRAY

user_array.reverse()
print(user_array)


# SORTING IN ARRAY

user_array.sort()
print(user_array)


# SLICING IN ARRAY (Extracting parts of an array)

print(user_array[0:3])
print(user_array[:2])
print(user_array[2:])


# DUPLICATE IN ARRAY

user_array.append(10)
print(user_array)
print(user_array.count(10))
