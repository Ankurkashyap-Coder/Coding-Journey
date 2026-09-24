# APPLY DISCOUNT FUNCTION

def apply_discount(price, discount):
    if not isinstance(price , (int , float)):
        return "The price should be a number"

    if not isinstance(discount , (int , float)):
        return "The discount should be a number"  
    if price <=0:
        return "The price should be greater than 0"

    if not (0 <= discount <= 100):
     return "The discount should be between 0 and 100"

    return price - ((price * discount) / 100)


# TAKING PRICE AND DISCOUNT INPUT FROM USER

price = float(input("Enter the Price : "))
discount = float(input("Enter the Discount : "))

result = apply_discount(price, discount)
print(result)           


