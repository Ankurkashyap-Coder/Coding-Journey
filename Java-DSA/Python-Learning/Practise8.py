# -------------------------------------------------------------
# Assignment Question 2: Quadratic Equation Root Finder
# Submitted by: [Your Name]
# -------------------------------------------------------------

# Step 1: Accept the three coefficients from the user
a = float(input("Enter coefficient a: "))
b = float(input("Enter coefficient b: "))
c = float(input("Enter coefficient c: "))

# Ensure 'a' is not zero, as a zero coefficient makes it a linear equation
if a == 0:
    print("Value of 'a' cannot be zero for a quadratic equation.")
else:
    # Step 2: Compute the Discriminant
    d = (b ** 2) - (4 * a * c)

    # Step 3: Condition for Real and Distinct Roots
    if d > 0:
        root1 = (-b + (d ** 0.5)) / (2 * a)
        root2 = (-b - (d ** 0.5)) / (2 * a)
        print("The roots are Real and Distinct.")
        print(f"Root 1 = {root1:.2f}")
        print(f"Root 2 = {root2:.2f}")

    # Step 4: Condition for Real and Equal Roots
    elif d == 0:
        root = -b / (2 * a)
        print("The roots are Real and Equal.")
        print(f"Root 1 = Root 2 = {root:.2f}")

    # Step 5: Condition for Complex/Imaginary Roots
    else:
        real_part = -b / (2 * a)
        # Using -d ensures we pass a positive value to calculate the imaginary part
        imag_part = ((-d) ** 0.5) / (2 * a)
        print("The roots are Complex and Imaginary.")
        print(f"Root 1 = {real_part:.2f} + {imag_part:.2f}i")
        print(f"Root 2 = {real_part:.2f} - {imag_part:.2f}i")
