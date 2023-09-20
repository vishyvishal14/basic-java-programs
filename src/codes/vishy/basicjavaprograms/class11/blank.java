package codes.vishy.basicjavaprograms.class11;

import java.util.Scanner;

public class blank {
    boolean vowelCheck(String st){
        char ch1=st.charAt(0);
        char ch2=st.charAt(st.length()-1);
        if(ch1=='A'||ch1=='E'||ch1=='I'||ch1=='O'||ch1=='U'||ch1=='a'||ch1=='e'||ch1=='i'||ch1=='o'||ch1=='u'){
            if(ch2=='A'||ch2=='E'||ch2=='I'||ch2=='O'||ch2=='U'||ch2=='a'||ch2=='e'||ch2=='i'||ch2=='o'||ch2=='u'){
                return true;

            }
        }
        return false;
    }
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        blank ob=new blank();
        String mid="";
        String out="";
        int m=0;
        System.out.println("Enter a string");
        String input=in.nextLine();
        input+=" ";
        for(int i=0;i<input.length();i++){
            char ch=input.charAt(i);
            if(Character.isWhitespace(ch)){
                if(ob.vowelCheck(mid)){
                     out=mid+" "+out;
                     mid="";
                     m+=1;
                }else{
                    out=out+" "+mid;
                    mid="";
                }
            }else{
                mid=mid+ch;
            }
        }
        System.out.println("No of words starting and ending with vowels: "+m);
        System.out.println("Final String:");
        System.out.println(out);
    }
}
