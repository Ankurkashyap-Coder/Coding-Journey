import java.util.*;
class Program10Assign{
    public static void main(String[] args) {
        /*Area Of Circle Java Program
Area Of Triangle
Area Of Rectangle Program
Area Of Isosceles Triangle
Area Of Parallelogram
Area Of Rhombus
Area Of Equilateral Triangle */
Scanner sc=new Scanner(System.in);
System.out.println("Menu:  1.Area of Circle \n 2. Area of Triangle \n 3. Area of Rectangle \n 4. Area of Isosceles Triangle \n 5. Area of Parallelogram \n 6.Area of Rhombus \n 7.Area of Equilateral Triangle");
System.out.println("Enter your Choice:");
int choice = 0;
if (sc.hasNextInt()) {
    choice = sc.nextInt();
} else {
    System.out.println("Error: Choice must be an integer digit between 1 and 7.");
    sc.close();
    return;
}

switch(choice){
    case 1:{
        //Finding Circle Area
        System.out.println("Enter the radius of Circle :");
        if(sc.hasNextDouble()){
        double radius= sc.nextDouble();
        double area= 3.14 * radius* radius;
        System.out.println("Desired result for area of Circle for which you inputed radius is: "+area);
        }
        else{
            sc.next();
            System.out.println("Error: Entered radius is not an Numeric digit.");
            sc.close();
            return;
        }
        break;
    }
        
        case 2:
            {
                //Finding Rectangle Area
            double base=0;
            double height=0;
         System.out.println("Enter the base of Triangle"); 
         if(sc.hasNextDouble()){
             base= sc.nextDouble();
         }  
         else{
            sc.next();
         System.out.println("Error: Entered base is not an Numeric digit.");
            sc.close();
            return;
        }
        System.out.println("Enter the height of Triangle");
        if(sc.hasNextDouble()){
            height= sc.nextDouble();
        } else {
            sc.next();
         System.out.println("Error: Entered height is not an Numeric digit.");
            sc.close();
            return;
        }
        double area= 0.5*base*height;
        System.out.println("Your Desired area for Tiangle is: "+area);
        break;
    }
        
        case 3:{
            // Finding Rectangle Area 
            double length=0;
            double breadth=0;
       System.out.println("Enter the Length of Rectangle:");
       if(sc.hasNextDouble()){
         length= sc.nextDouble();
       }
       else{
        sc.next();
         System.out.println("Error: Entered lenght is not an Numeric digit.");
            sc.close();
            return;
       }
       System.out.println("Enter the breadth of Rectangle:");
       if(sc.hasNextDouble()){
        breadth=sc.nextDouble();
       }
       else{
        sc.next();
         System.out.println("Error: Entered breadth is not an Numeric digit.");
            sc.close();
            return;
       }
       double area= length * breadth;
       System.out.println("Your Desired Area for Rectangle is : "+area);
       break;
    }
    case 4:{
        // Area of Isoceleous Triangle
        double equalSide=0;
        double base=0;
        System.out.println("Enter the equal side");
        if(sc.hasNextDouble()){
            equalSide=sc.nextDouble();
        }
        else{
            sc.next();
            System.out.println("Error: Entered equal side is not an Valid Numeric digit.");
            sc.close();
            return;
        }
        System.out.println("Enter Base of the Triangle");
        if(sc.hasNextDouble()){
            base=sc.nextDouble();
        }
        else{
            sc.next();
            System.out.println("Error: Entered base is not an Numeric digit");
            sc.close();
            return;
        }
        double area=(base / 4.0) * Math.sqrt((4 * equalSide * equalSide) - (base * base));
        System.out.println("Your desired area for Isoceleus Triangle is :"+area);
        break;
    }
    case 5:{
        // Area of Parallelogram
        double base=0;
        double height=0;
        System.out.println("Enter the base of Parallelogram");
        if(sc.hasNextDouble()){
           base=sc.nextDouble();
        }
        else{
            sc.next();
            System.out.println("Error: Entered base is not an Valid Numeric Digit");
            sc.close();
            return;
        }
        System.out.println("Enter the height : ");
        if(sc.hasNextDouble()){
           height=sc.nextDouble();
        }
        else{
            sc.next();
            System.out.println("Error: Entered height is not an Valid Numeric Digit");
            sc.close();
            return;
        }
        
        double area= base * height;
        System.out.println("Your desired area of Parallelogram is : "+area);
        break;
    }
    
    case 6:
        {
            // Area of Rhombus
            double diagonal1= 0;
            double diagonal2 =0;
System.out.println("Enter the first diagonal :");
if(sc.hasNextDouble()){
      diagonal1=sc.nextDouble();
}
else{
    sc.next();
    System.out.println("Error: Entered diagonal is not an numerical digit.");
    sc.close();
    return;
} 
System.out.println("Enter the Second Diagonal : ");    
  if(sc.hasNextDouble()){
      diagonal2=sc.nextDouble();
}
else{
    sc.next();
    System.out.println("Error: Entered diagonal is not an numerical digit.");
    sc.close();
    return;
}
double area = 0.5 * diagonal1 * diagonal2;
System.out.println("Your Desired area of Rhombus is :"+area);
break;
        }
        case 7:{
            // Area of Equilateral Triangle
            double side= 0;
            System.out.println("Enter the side of equilateral triangle.");
            if(sc.hasNextDouble()){
                 side=sc.nextDouble();
            }
            else{
                sc.next();
                System.out.println("Error: Entered side is not an Valid numeric digit.");
                sc.close();
                return;
            }
            double area= (1.732 / 4) * side * side;
            System.out.println("Your desired output for the equilateral triangle is: "+area);
            break;
        }
        default: {
            System.out.println("Error: Choice must be an integer between 1 and 7.");
            break;
        }
}
sc.close();
    }
}