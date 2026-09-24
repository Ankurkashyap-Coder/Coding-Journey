name = "Ankur Kashyap"
age =20
print(name , type(name))
print(age , type(age))
x= b"Hello"
y = {"apple", "banana", "cherry"}
z = ({"Apple" , "Banana" , "Cherry"})
r = ["Phone" , "smartPhone" , "Laptop"]

marks1 = float(input("Enter first Marks "))
marks2 = float(input("Enter second Marks "))
marks3 = float(input("Enter third Marks "))

totalmarks = float(marks1 + marks2 + marks3)

average = totalmarks // 3
print("Total of three marks provided by you is : " , totalmarks)
print("Average of the three marks provided by you is : " , average)

print(type(totalmarks))
print(type(average))
print(marks1 , type(marks1))
print(marks2 , type(marks2))
print(marks3 , type(marks3))
print(x , type(x))
print(y, type(y))
print(z, type(z))
print(r, type(r))

# My desired list of dreams

desired_list = ["Bugati" , "Mac" , "iPhone"]
print(desired_list)
print(desired_list[1])
desired_list.remove("Mac")
print(desired_list)
