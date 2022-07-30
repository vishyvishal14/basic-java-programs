package me.vishalpj.basicjavaprograms.board;

import java.util.Arrays;
import java.util.Scanner;

public class Array2 {
    public static void main(String[] args){
        double[] x=new double[20];
        int i;
        for(i=0;i<20;i++) {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter the numbers. Current number inputting in array: " + i);
            x[i] = in.nextDouble();
        }
        System.out.println("before : "+Arrays.toString(x));
        Arrays.sort(x);
        System.out.println("after : "+Arrays.toString(x));
        System.out.println("the smallest number is :"+x[0]);
        System.out.println("the largest number is : "+x[19]);
        System.out.println("difference or range:"+(x[19]-x[0]));

    }

}
