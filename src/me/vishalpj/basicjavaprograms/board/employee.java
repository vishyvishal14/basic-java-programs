package me.vishalpj.basicjavaprograms.board;

import java.util.Scanner;

public class employee {
    String eno,ename;
    double net,da,hra,pf;
    int age;
    int basic;
    void accept(){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the employee name, employee number,age and basic salary.");
        ename=in.nextLine();
        eno=in.next();
        age=in.nextInt();
        basic=in.nextInt();

    }
    void calculate(){
        hra=(basic*(18.5/100));
        da=(basic*(17.45/100));
        pf=(basic*(8.10/100));
        net=basic+hra+da-pf;
        if(age>50){
            net=net+5000;
        }


    }
    void print(){
        System.out.println("Employee number:"+eno);
        System.out.println("Employee name:"+ename);
        System.out.println("Employee age:"+age);
        if(age>50){
            System.out.println("As your age is above 50 years, you will get additional 5000/-");
        }
        System.out.println("Employee's basic salary:"+basic);
        System.out.println("Employee's net pay:"+net);

    }
    public static void main(String args[]){
        employee ob=new employee();
        ob.accept();
        ob.calculate();
        ob.print();
    }
}
