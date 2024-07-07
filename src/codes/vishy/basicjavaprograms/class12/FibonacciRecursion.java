package codes.vishy.basicjavaprograms.class12;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;
/**
 * Write a description of class FibonacciRecursion here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FibonacciRecursion{
    int fib(int n){

            if(n==1){
                return(0);
            }else if(n==2){
                return(1);
            }else if(n>2){
                return(fib(n-1)+fib(n-2));
            }else{
                return(-1);
            }
    }
    
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter number of terms to display");
        int n,p=0;
        n=in.nextInt();
        FibonacciRecursion ob=new FibonacciRecursion();
        System.out.println("The series");
        int q=0;
        for(int i=1;i<=n;++i){
            q++;
            System.out.println(q+". "+ob.fib(i));
        }
    }
}