// pg 393 qn 10

import java.util.Scanner;

public class Overload2{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the string");
        String st=in.nextLine();
        stringChecker(st);
        
    }
    public static void stringChecker(String s){
        int c[]=new int[5];
        for(int i=0;i<s.length();i++){
             char ch=s.charAt(i);
             int x=0;
             if(ch=='A'||ch=='a'){
                 c[0]++;
                 System.out.println("a or A :"+c[0]);
             }
             if(ch=='E'||ch=='e'){
                 c[1]++;
                 System.out.println("e or E :"+c[1]);
             }
             if(ch=='I'||ch=='i'){
                 c[2]++;
                 System.out.println("i or I :"+c[2]);
             }
             if(ch=='O'||ch=='o'){
                 c[3]++;
                 System.out.println("o or O :"+c[3]);
             }
             if(ch=='U'||ch=='u'){
                 c[4]++;
                 System.out.println("u or U :"+c[4]);
             }
             
         }
    }
}