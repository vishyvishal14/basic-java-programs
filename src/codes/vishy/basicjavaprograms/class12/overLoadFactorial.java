// page 33 qn  9
package codes.vishy.basicjavaprograms.class12;

import java.util.Scanner;

public class overLoadFactorial{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the two numbers");
        int m,n;
        n=in.nextInt();
        m=in.nextInt();
        if(m>n){
            System.out.println("Check failed, fixing");
            int x;
            x=n;
            n=m;
            m=x;
        }else if(m<n){
            System.out.println("Check passed");
        }else if(m==n){
            System.out.println("Check passed #2");
        }
        int soln;
        soln=(factorialFinder(n))/(factorialFinder(m)*(factorialFinder(n-m)));
        System.out.println(soln);
    }
    public static int factorialFinder(int a){
        int f=1;
        for(int i=1;i<=a;i++){
            f=f*i;
        }
        return f;
    }
}