import java.util.*;
public class Program11Assign {
    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
/*Perimeter Of Circle
Perimeter Of Equilateral Triangle
Perimeter Of Parallelogram
Perimeter Of Rectangle
Perimeter Of Square
Perimeter Of Rhombus */ 
int choice=0; 
System.out.println("Menu: 1. Perimeter of Circle \n 2. Perimeter of Equilateral Triangle \n 3. Perimeter of Parallelogram \n 4. Perimeter of Rectangle \n 5. Perimeter of Square \n 6. Perimeter of Rhombus.");
System.out.println("Enter your Choice :");
if(sc.hasNextInt()){
     choice= sc.nextInt();
}
else{
    sc.next();
    System.out.println("Error: You are pressing out of digits. Please Choose between 1 to 6");
    sc.close();
    return;

}
switch (choice) {
    case 1:
        {
            // Perimeter of Circle
            double radius= 0;
           System.out.println("Enter the radius of Circle");
           if(sc.hasNextDouble()){
              radius= sc.nextDouble();
           } 
           else{
            sc.next();
            System.out.println("Inputed radius not belong to a Valid numeric digit.");
            sc.close();
            return;
           }
           double perimeter= 2 * 3.14 * radius;
           System.out.println("Your desired Perimeter of Circle is : "+perimeter);
           break;
        }
        case 2:{
               // Perimeter of Equilateral 
               double side =0;
               System.out.println("Enter side of Equilateral Triangle.");
               if(sc.hasNextDouble()){
                side = sc.nextDouble();
               }
               else{
                    sc.next();
                    System.out.println("Enter side not a Valid Numeric Digit.");
                    sc.close();
                    return;
               }
               double perimeter= 3 * side;
               System.out.println("Your desired perimeter for Equilateral Triangle is : "+perimeter);
               break;
        }
        case 3:
        {
            // Perimeter of Parallelogram 
            double side1=0;
            double side2= 0;
            System.out.println("Enter the side of Parallelogram.");
            if(sc.hasNextDouble()){
                side1= sc.nextDouble();
            }
            else{
                sc.next();
                System.out.println("Error: Entered side is not a Valid Numeric Digit.");
                sc.close();
                return;
            }
            System.out.println("Enter the second side of Parallelogram");
            if(sc.hasNextDouble()){
                side2= sc.nextDouble();
            }
            else{
                sc.next();
                System.out.println("Error: Entered side is not a Valid Numeric Digit.");
                sc.close();
                return;
            }
            double perimeter= 2 * (side1 + side2);
            System.out.println("Your Desired Perimeter of Parallelogram is :"+perimeter);
            break;
        }
        case 4:{
             // Perimeter of Rectangle
             double length= 0;
             double breadth =0;
             System.out.println("Enter the length of Rectangle");
             if(sc.hasNextDouble()){
                length= sc.nextDouble();
             }
             else{
                sc.next();
                System.out.println("Entered length is not a Valid numeric digit");
                sc.close();
                return;
             }
             System.out.println("Enter the breadth of Rectangle");
             if(sc.hasNextDouble()){
                breadth= sc.nextDouble();
             }
             else{
                sc.next();
                System.out.println("Entered breadth is not a Valid numeric digit");
                sc.close();
                return;
             }
             double perimeter= 2 * (length + breadth);
             System.out.println("Your desired Perimeter of Rectangle is : "+perimeter);
             break;
        }
        case 5:
            {
                // Perimeter of square
                double side=0;
                System.out.println("Entered the side of Square");
                if(sc.hasNextDouble()){
                    side= sc.nextDouble();
                }
                else{
                    sc.next();
                    System.out.println("Entered side is not a Valid numeric digit");
                    sc.close();
                    return;
                }
                double perimeter= 4 * side;
                System.out.println("Your Desired Perimeter for Square is :"+perimeter);
                break;
            }
            case 6:{
                // Perimeter of Rhombus
                 double side=0;
                System.out.println("Entered the side of Rhombus");
                if(sc.hasNextDouble()){
                    side= sc.nextDouble();
                }
                else{
                    sc.next();
                    System.out.println("Entered side is not a Valid numeric digit");
                    sc.close();
                    return;
                }
                double perimeter= 4 * side;
                System.out.println("Your Desired Perimeter for Rhombus is :"+perimeter);
                break;
            }
            

    default:
        {
        System.out.println("Entered input is inValid please enter between 1 to 6");
        break;
        }
}
sc.close();
    }
}
