// pg 447 qn 12

import java.util.*;

public class Employee{
    String pan;
    String name;
    double taxincome;
    double tax;
    void input(){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the PAN number, String name, tax income");
        pan=in.nextLine();
        name=in.nextLine();
        taxincome=in.nextDouble();
    }
    void cal(){
        if(taxincome<=250000){
            tax=0;
        }
        if(taxincome>=250001&&taxincome<=500000){
            tax=(taxincome-250000)*(10/100);
        }if(taxincome>=500001&&taxincome<=1000000){
            tax=10000+((20/100)*(taxincome-500000));
        }if(taxincome>1000000){
            tax=25000+((30/100)*(taxincome-1000000));
        }
    }
    void displayold(){
        System.out.println("PAN Number "+pan);
        System.out.println("Name of the employee "+name);
        System.out.println("Taxable income "+taxincome);
        System.out.println("Tax you are supposed to pay before you are penalized for tax fraud "+tax);
    }
    void display(){
        System.out.println("PAN Number"+"\t"+"Name"+"\t"+"Taxable Income"+"\t"+"Amount of tax you have to pay before Income Tax Departments raids your entire house for tax fraud :");
        System.out.println(pan+"\t"+name+"\t"+taxincome+"\t"+tax);
        
    }
}