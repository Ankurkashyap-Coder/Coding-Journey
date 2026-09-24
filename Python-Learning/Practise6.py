year = int(input("Enter the year to check whetehr the year is leap year or not"))

if (year % 4 == 0 and year % 100 != 0) or (year % 400 == 0):
    print(f"{year} is a Leap year")
else:
    print(f"{year} is not a Leap year")
