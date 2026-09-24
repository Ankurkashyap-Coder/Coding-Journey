import java.util.*;
public class Program12Assign {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
     /* Volume Of Cone Java Program
Volume Of Prism
Volume Of Cylinder
Volume Of Sphere
Volume Of Pyramid
Curved Surface Area Of Cylinder
Total Surface Area Of Cube */
int choice=0;
System.out.println(" ================================================");
System.out.println("Menu: 1: Volume of Cone Java Program \n 2. Volume of Prism \n 3. Volume of Cylinder \n 4. Volume of Sphere \n 5. Volume of Pyramid \n 6. Curved Surface Area of Cylinder \n 7. Total surface Area of Cube");
System.out.println(" =================================================");
System.out.println("Enter your choice");
    if(sc.hasNext()){
    choice =sc.nextInt();
    }
    else{
        sc.next();
        System.out.println("Error: Entered choice is out of Range you have to choose between 1 to 6");
        sc.close();;
        return;
    }
    // Cases begins 

    switch (choice) {
        case 1:{
            // Volume of Cone
            double radius= 0;
            double height=0;
            System.out.println("Enter the radius of cone.");
            if(sc.hasNextDouble()){
              radius = sc.nextDouble();
            }
            else{
                sc.next();
                System.out.println("Error: Entered radius of Cone is not a Valid Numeric Digit.");
                sc.close();
                return;
            }
            System.out.println("Enter the height of cone.");
            if(sc.hasNextDouble()){
              height = sc.nextDouble();
            }
            else{
                sc.next();
                System.out.println("Error: Entered height of Cone is not a Valid Numeric Digit.");
                sc.close();
                return;
            }
            double volume= (1.0 / 3.0) * 3.14159 * radius * radius * height;
            System.out.println("Your desired Volume of the cone is :"+volume);
            break;
        }
        case 2:
            {
                //Volume of Prism
                double base=0;
                double perpLength= 0;
                System.out.println("Enter the base length of Prism.");
                if(sc.hasNextDouble()){
                  base= sc.nextDouble();
                }
                else{
                    sc.next();
                    System.out.println("Error: Entered base of Prism is not a Valid Numeric digit.");
                    sc.close();
                    return;
                }
                System.out.println("Enter the perp. Length of the Prism.");
                if(sc.hasNextDouble()){
                    perpLength= sc.nextDouble();
                }
                else{
                    sc.next();
                    System.out.println("Error: Entered perp. Length is not a Valid Numeric Digit.");
                    sc.close();
                    return;
                }
                double volume= base* perpLength;
                System.out.println("Your desired Volume for Prism is :"+volume);
                break;
            }
            case 3:
                {
                    // Volume of Cylinder
                    double radius=0;
                    double height = 0; 
                    System.out.println("Enter the radius of cylinder");
                    if(sc.hasNextDouble()){
              radius = sc.nextDouble();
            }
            else{
                sc.next();
                System.out.println("Error: Entered radius of Cylinder is not a Valid Numeric Digit.");
                sc.close();
                return;
            }
            System.out.println("Enter the height of cylinder.");
            if(sc.hasNextDouble()){
              height = sc.nextDouble();
            }
            else{
                sc.next();
                System.out.println("Error: Entered height of cylinder is not a Valid Numeric Digit.");
                sc.close();
                return;
            }
            double volume = 3.14159 * radius * radius * height;
            System.out.println("Your Desired Volume for the Cylinder is :"+volume);
            break;
                }
                case 4:{
                    // Volume of Sphere
                    double radius = 0; 
                    System.out.println("Enter the radius of sphere");
                    if(sc.hasNextDouble()){
                    radius = sc.nextDouble();
                }
                else{
                    sc.next();
                    System.out.println("Error: Entered radius of Sphere is not a Valid numeric Input.");
                    sc.close();
                    return;
                }
                double volume = (4.0 / 3.0) * 3.14159 * radius * radius * radius;
                System.out.println("Your desired Volume of Sphere is:"+volume);
                break;
            }
            case 5:
                {
                    // Volume of Pyramid
                    double base = 0;
                    double height = 0;
                    System.out.println("Enter the base of Pyramid.");
                    if(sc.hasNextDouble()){
                        base = sc.nextDouble();
                    }
                    else{
                        sc.next();
                        System.out.println("Error: Entered base of Pyramid is not a Valid Numeric Digit.");
                        sc.close();
                        return;
                    }
                    System.out.println("Enter the height of the Pyramid");
                    if(sc.hasNextDouble()){
                        height = sc.nextDouble();
                    }
                    else{
                        sc.next();
                        System.out.println("Error: Entered Height of Pyramid is not a Valid Numeric Digit.");
                        sc.close();
                        return;
                    }
                    double volume = (1.0 / 3.0) * base * height;
                    System.out.println("Your Desired volume of Pyramid is : "+volume);
                    break;
                }
                case 6 :
                    {
                        // Curved Surface Area of Cylinder
                        double radius = 0;
                        double height = 0;
                        System.out.println("Enter the radius of cylinder.");
                        if(sc.hasNextDouble()){
                            radius = sc.nextDouble();
                        }
                        else{
                            sc.next();
                            System.out.println("Error: Entered radius of Cylinder is not a Valid Digit.");
                            sc.close();
                            return;   
                        }
                        System.out.println("Enter the height of the cylinder.");
                        if(sc.hasNextDouble()){
                            height = sc.nextDouble();
                        }
                        else{
                            sc.next();
                            System.out.println("Error : Entered height of Cylinder is not a Valid numeric Digit.");
                            sc.close();
                            return;
                        }
                        double CurvedArea = 2 * 3.14159 * radius * height;
                        System.out.println("Your desired Curved surface area of Cylinder is : "+CurvedArea);
                        break;
                    }
                    case 7:
                        {
                            // Total Surface Area of Cube
                            double side= 0;
                            System.out.println("Enter the side of cube.");
                            if(sc.hasNextDouble()){
                                side = sc.nextDouble();
                            }
                            else{
                                sc.next();
                                System.out.println("Error: Entered side of cube is not a Valid Numeric Digit.");
                                sc.close();
                                return;
                            }
                            double TotalSurface = 6 * side * side;
                            System.out.println("Your desired Total surface Area of Cube is : "+TotalSurface);
                            break;
                        }
            
           
    
        default:
            {
                System.out.println("Invalid : Please choose a number between 1 to 7.");
            break;
            }
    }
    sc.close();
}
    }

