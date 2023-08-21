package codes.vishy.basicjavaprograms.board;

import java.util.Scanner;

public class StringBoard {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int i,p,n=0;
        String original,reversed="";
        System.out.println("Enter the string to reverse");
        original=in.nextLine();
        p=original.length();
        for(i=p-1;i>=0;i--){
            char chr=original.charAt(i);
            reversed += chr;
            if(chr=='a'||chr=='e'||chr=='i'||chr=='o'||chr=='u'||chr=='A'||chr=='E'||chr=='O'||chr=='U'){
                n=n+1;
            }
        }
        System.out.println("Reversed string: "+ reversed);
        System.out.println("Number of vowels: "+n);

    }
}
