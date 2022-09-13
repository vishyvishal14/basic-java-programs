package me.vishalpj.basicjavaprograms.board;

import me.vishalpj.basicjavaprograms.dependencies.Colour;

import java.util.Scanner;

public class employee {
    String eno,employeename;
    double net,da,hra,pf;
    int age;
    int basic;
    void accept(){
        Scanner in=new Scanner(System.in);
        System.out.println(Colour.BLACK+"_____________________________________________________________________________________________________________"+Colour.RESET);
        System.out.println(Colour.BLUE+"Enter the employee name.");
        employeename=in.nextLine();
        System.out.println(Colour.BLUE+"Enter employee number.");
        eno=in.next();
        System.out.println(Colour.BLUE+"Enter age.");
        age=in.nextInt();
        System.out.println(Colour.BLUE+"Enter salary.");
        basic=in.nextInt();
        System.out.println(Colour.BLACK+"_____________________________________________________________________________________________________________"+Colour.RESET);

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
        System.out.println(Colour.BLUE+"Employee number: "+Colour.GREEN+eno);
        System.out.println(Colour.BLUE+"Employee name: "+Colour.GREEN+employeename);
        System.out.println(Colour.BLUE+"Employee age: "+Colour.GREEN+age);
        if(age>50){
            System.out.println(Colour.GREEN+"As your age is above 50 years, you will get additional 5000/-");
        }
        System.out.println(Colour.BLUE+"Employee's basic salary: "+Colour.GREEN+basic);
        System.out.println(Colour.BLUE+"Employee's net pay: "+Colour.GREEN+net);

    }
    public static void main(String[] args){
        employee ob=new employee();
        ob.accept();
        ob.calculate();
        ob.print();
    }
}
