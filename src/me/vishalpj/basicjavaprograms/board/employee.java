package me.vishalpj.basicjavaprograms.board;


import java.util.Scanner;

public class employee {
    String eno,employeename;
    double net,da,hra,pf;
    int age;
    int basic;
    void accept(){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the employee name.");
        employeename=in.nextLine();
        System.out.println("Enter employee number.");
        eno=in.next();
        System.out.println("Enter age.");
        age=in.nextInt();
        System.out.println("Enter salary.");
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
        System.out.println("Employee number: "+eno);
        System.out.println("Employee name: "+employeename);
        System.out.println("Employee age: "+age);
        if(age>50){
            System.out.println("As your age is above 50 years, you will get additional 5000/-");
        }
        System.out.println("Employee's basic salary: "+basic);
        System.out.println("Employee's net pay: "+net);

    }
    public static void main(){
        employee ob=new employee();
        ob.accept();
        ob.calculate();
        ob.print();
    }
}
