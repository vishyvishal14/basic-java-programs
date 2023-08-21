package codes.vishy.basicjavaprograms.loops.nested;

import java.util.Scanner;

public class NumberDesign {
    int rows;
    int a;
    int b;
    public void getRows(){
        Scanner in = new Scanner(System.in);
        System.out.println("What word/letter/number/emoji/object do you want to see in the right angled triangle design?");
        System.out.println("Enter 1 to print a word.");
        System.out.println("Enter 2 to print a single letter");
        System.out.println("Enter 3 to print a single number");
        System.out.println("Enter 4 to print string of multiple numbers");
        System.out.println("Enter 5 to print special characters!");
        System.out.println();
        System.out.println();
        System.out.println("If you do not know what to print or want to simply try the program select few demo options below!");
        System.out.println("Enter 6 to print asterisk(*)");
        System.out.println("Enter 7 to print unique number design!");

    }
    public void RowLoop(){
        for(a=rows;a<=5;a++){
            for(b=1;b<=a;b++){
                System.out.print(b);
            }
            System.out.println();
        }
    }
}
