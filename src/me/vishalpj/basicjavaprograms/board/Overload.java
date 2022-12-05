package me.vishalpj.basicjavaprograms.board;

import java.util.Scanner;

public class Overload {
    void print(){
        int a,b,c=1;
        for(a=1;a<=4;a++) {
            for (b = 1; b <= a; b++) {
                System.out.print(c+" ");
                c++;
            }
            System.out.println();
        }
    }
    boolean print(int n){
        int x = n;
        int sum = 0;
        while(n!= 0)
        {
            int a = n % 10;
            sum += a;
            n/=10;
        }
        return x == (sum * sum * sum);
    }
    void print(int a,char ch){
        if(ch=='s'||ch=='S'){
            System.out.println(a*a);
        }else if(ch=='c'||ch=='C'){
            System.out.println(a*a*a);
        }
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n,a;
        char ch;
        System.out.println("Enter number to check for dudency");
        n=in.nextInt();
        System.out.println("enter number to square or cube");
        a=in.nextInt();
        System.out.println("enter character to check for square or cube");
        ch=in.next().charAt(0);
        Overload ob=new Overload();
        ob.print();
        System.out.println(ob.print(n));
        ob.print(a,ch);
    }

}
