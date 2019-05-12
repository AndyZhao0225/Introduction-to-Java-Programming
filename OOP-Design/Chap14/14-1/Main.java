import java.util.Scanner;

   public class Main 
 {
     public static void main(String[] args) 
   { 
       Scanner input = new Scanner(System.in);
       System.out.print("Enter a radius for circle1: ");
       GeometricObject geoObject1 = new Circle(input.nextDouble());
       System.out.print("Enter a radius for circle2: ");
       GeometricObject geoObject2 = new Circle(input.nextDouble());
       
       System.out.println("Circle1's area: " + geoObject1.getArea());
       System.out.println("Circle2's area: " + geoObject2.getArea());
       if(GeometricObject.max(geoObject1,geoObject2)==geoObject1) System.out.println("Circle1 is larger");
       else if(GeometricObject.max(geoObject1,geoObject2)==geoObject2) System.out.println("Circle2 is larger");
       else System.out.println("Circle1 and circle2 have equal area.");
       
       System.out.print("\nEnter a width and a height for rectangle1: ");
       GeometricObject geoObject3 = new Rectangle(input.nextDouble(),input.nextDouble());
       System.out.print("Enter a width and a height for rectangle2: ");
       GeometricObject geoObject4 = new Rectangle(input.nextDouble(),input.nextDouble());
       System.out.println("Rectangle1's area: " + geoObject3.getArea());
       System.out.println("Rectangle2's area: " + geoObject4.getArea());
       if(GeometricObject.max(geoObject3,geoObject4)==geoObject3) System.out.println("Rectangle1 is larger");
       else if(GeometricObject.max(geoObject3,geoObject4)==geoObject4) System.out.println("Rectangle2 is larger");
       else System.out.println("Rectangle1 and rectangle2 have equal area.");
   }
}

