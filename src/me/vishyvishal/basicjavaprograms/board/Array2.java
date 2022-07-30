package me.vishyvishal.basicjavaprograms.board;

import java.util.Scanner;

public class Array2 {
    public static void main(String[] args){
        int[] x=new int[20];
        int i,c1=0,c2=0;
        for(i=0;i<20;i++) {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter the numbers. Current number inputting in array: " + i);
            x[i] = in.nextInt();
            if(x[i-1]<x[i]){
                if(i == 0){
                    c1=x[0];
                }else{
                    c1=x[i-1];
                }
                c1=x[i-1];
            }else{
                c2=x[i];
            }
        }
        System.out.println(c1 + " " + c2);

    }

}
