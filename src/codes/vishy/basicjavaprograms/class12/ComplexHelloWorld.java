//my intrusive thoughts wanted to write this program
package codes.vishy.basicjavaprograms.class12;

import java.util.Scanner;
import java.util.concurrent.*;

public class ComplexHelloWorld{
    static String word="";
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the string you want to make complex");
        String st=in.nextLine();
        stringProcessor(st);
        
    }
    static void stringProcessor(String string){
        for(int i=0;i<string.length();i++){
            char ch=string.charAt(i);
            characterProcessor(ch);
        }
    }
    static void timeDelay() {
        try{
          TimeUnit.MILLISECONDS.sleep(10);
        }catch(InterruptedException e){
            
        }
    }
    static void characterProcessor(char character){
        if(Character.isUpperCase(character)){
            char x=character;
            for(int i=65;i<=((int)character);i++){
                System.out.println(word+(char)i);
                timeDelay();
            }
            word=word+character;
        }
        if(Character.isLowerCase(character)){
            char x=character;
            for(int i=97;i<=((int)character);i++){
                System.out.println(word+(char)i);
                timeDelay();
            }
            word=word+character;
        }
        if(Character.isWhitespace(character)){
            word=word+character;
            System.out.println(word+character);
            timeDelay();
        }
        if(Character.isDigit(character)){
            for(int i=48;i<=((int)character);i++){
                System.out.println(word+(char)i);
                timeDelay();
            }
            word=word+character;
        }
    }
}