package codes.vishy.basicjavaprograms;

//todo use this package
//        System.out.println("string");
//        TimeUnit.MILLISECONDS.sleep(2000);
//        System.out.println("test");

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class complexHelloWorld {
    static String word="";
    static void stringHandler(String string) throws InterruptedException {
        for(int i=0;i<string.length();i++){
            characterHandler(string.charAt(i));
        }

    }
    static void characterHandler(char chr) throws InterruptedException {
        if(Character.isLetterOrDigit(chr)){
            if(Character.isLetter(chr)){
                if(Character.isUpperCase(chr)){
                    for(int i=65;i<=((int)chr);i++){
                        System.out.println(word+((char)i));
                        timeDelay();
                    }
                    word=word+chr;
                }
                if(Character.isLowerCase(chr)){
                    for(int i=97;i<=((int)chr);i++){
                        System.out.println(word+((char)i));
                        timeDelay();
                    }
                    word=word+chr;
                }

            }
            if(Character.isDigit(chr)){
                for(int i=48;i<=((int)chr);i++){
                    System.out.println(word+((char)i));
                    timeDelay();
                }
                word=word+chr;
            }

        }
        if(Character.isWhitespace(chr)){
            System.out.println(word+chr);
            timeDelay();
            word=word+chr;

        }

    }
    static void timeDelay() throws InterruptedException {
        TimeUnit.MILLISECONDS.sleep(100);

    }
    public static void main(String args[]) throws InterruptedException {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter string");
        String x=in.nextLine();
        stringHandler(x);


    }
}
