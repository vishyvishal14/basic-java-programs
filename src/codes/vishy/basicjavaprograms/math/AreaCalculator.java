//This program is written using switch case. There will be quoted conversions to equivalent if-else-if case structures.

package codes.vishy.basicjavaprograms.math;


import java.util.Scanner;


public class AreaCalculator {
    public static void main(String []args) {

        Scanner in = new Scanner(System.in);
        double r,ra,ca,sa,side,l,b; //todo replace with better variables

        System.out.println("Enter 1 to calculate area of circle");
        System.out.println("Enter 2 to calculate area of square");
        System.out.println("Enter 3 to calculate area of rectangle");
        System.out.print("Enter your choice: ");
        int choice = in.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter radius of circle: ");
                r = in.nextDouble();
                ca = (22 / 7.0) * r * r;
                System.out.println("Area of circle = " + ca);
                break;

            case 2:
                System.out.print("Enter side of square: ");
                side = in.nextDouble();
                sa = side * side;
                System.out.println("Area of square = " + sa);
                break;

            case 3:
                System.out.print("Enter length of rectangle: ");
                l = in.nextDouble();
                System.out.print("Enter breadth of rectangle: ");
                b = in.nextDouble();
                ra = l * b;
                System.out.println("Area of rectangle = " + ra);
                break;

            default:
                System.out.println("Wrong choice!");
        }
        //Quoted If it was to be if-else-if case. Replace the quoted code with switch case code.

        /*if (choice == 1) {
            System.out.print("Enter radius of circle: ");
            r = in.nextDouble();
            ca = (22 / 7.0) * r * r;
            System.out.println("Area of circle = " + ca);

        } else if (choice == 2) {
            System.out.print("Enter side of square: ");
            side = in.nextDouble();
            sa = side * side;
            System.out.println("Area of square = " + sa);

        } else if (choice == 3){
            System.out.print("Enter length of rectangle: ");
            l = in.nextDouble();
            System.out.print("Enter breadth of rectangle: ");
            b = in.nextDouble();
            ra = l * b;
            System.out.println("Area of rectangle = " + ra);
        } else {
            System.out.println("Invalid Option");
        }*/

    }
}
