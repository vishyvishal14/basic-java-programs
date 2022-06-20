//DO NOT COPY PACKAGE SENTENCE IF YOU WANT TO TRY THIS ON BLUEJ COPY FROM PUBLIC CLASS

package me.vishyvishal.basicjavaprograms.basic;

import java.util.Scanner;

public class TwoNumberCalculation {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int select_operation,integer_check;
        int number1,number2,sum_of_non_decimal_numbers;
        double double_number1,double_number2,sum_of_decimal_numbers;
        System.out.println("Enter the operation you want to perform!");
        System.out.println("Enter 1 to add two numbers");
        System.out.println("Enter 2 to add two numbers");
        System.out.println("Enter 3 to add two numbers");
        System.out.println("Enter 4 to add two numbers");
        select_operation = in.nextInt();
        if(select_operation == 1){
            System.out.println("Enter 1 if your math problem involves decimals.");
            System.out.println("Else enter 2.");
            integer_check = in.nextInt();
            if(integer_check == 1){
                System.out.println("Enter two numbers to add");
                number1=in.nextInt();
                number2=in.nextInt();
                sum_of_non_decimal_numbers=number1+number2;
                System.out.println("The sum of numbers are ="+sum_of_non_decimal_numbers);
            }
            else if(integer_check == 2){
                System.out.println("Enter two double numbers to add.");
                double_number1=in.nextDouble();
                double_number2=in.nextDouble();
                sum_of_decimal_numbers=double_number1+double_number2;
                System.out.println("The sum of double numbers is ="+sum_of_decimal_numbers);

            }
        }



    }
}
