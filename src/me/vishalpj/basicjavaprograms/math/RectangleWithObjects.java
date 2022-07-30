package me.vishalpj.basicjavaprograms.math;

import java.util.Scanner;

public class RectangleWithObjects {
    int length,breadth,area,perimeter;
    double diagonal;
    public void inputData(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter length of rectangle");
        length=in.nextInt();
        System.out.println("Enter breadth of rectangle");
        breadth=in.nextInt();
    }
    public void calculation(){
        area=length*breadth;
        perimeter=2*(length+breadth);
        diagonal=Math.sqrt(length*length+breadth*breadth);
    }
    public void outputData(){
        System.out.println("The area of rectangle is: "+area );
        System.out.println("The perimeter of rectangle is: "+perimeter);
        System.out.println("The diagonal of rectangle is: "+diagonal);
    }
    public static void main(String[] args){
        RectangleWithObjects ob = new RectangleWithObjects();
        ob.inputData();
        ob.calculation();
        ob.outputData();
    }
}
