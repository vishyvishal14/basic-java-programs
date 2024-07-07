// page 395 qn 24

import java.util.Scanner;

public class Overload3{
    void display(int n){
        int x=(int)Math.sqrt(n);
        if(Math.pow(x,2)==n){
            System.out.println("Perfect square number");
        }else{
            System.out.println("Not a perfect square number");
        }
    }
    void display(String str,char ch){
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==ch){
                System.out.println("Character present in word");
                break;
            }
        }
        System.out.println("Character not present");
    }
    void display(String str){
        int n=0;
        for(int i=0;i<str.length();i++){
            if(!Character.isLetterOrDigit(str.charAt(i))){
                n++;   
            }
        }
        System.out.println("The number of special characters: "+n);
    }
    
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter perfect square checking number, string and character to check if character exists in string and String to check number of special characters in");
        Overload3 ob=new Overload3();
        int k=in.nextInt();
        String st=in.next();
        Character ch=in.next().charAt(0);
        String string="";
        string=in.nextLine();
        ob.display(k);
        ob.display(st,ch);
        ob.display(string);
    }
}