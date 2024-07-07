package codes.vishy.basicjavaprograms.class12;// pg 273 prog 9

import java.util.*;

public class VowelWords{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a string");
        String st=in.nextLine();
        System.out.println(wordProcessor(st));
    }
    static String wordProcessor(String n){
        String f="",n1="";
        String n2="";
        String m="";
        String q="";
        char l=n.charAt(n.length()-1);
        if(l=='.'||l=='!'||l=='?'){
            n=n.substring(0,n.length()-1);
            n=n+" ";
        }
        for(int i=0;i<n.length();i++){
            char ch=n.charAt(i);
            if((int)ch==32){
                if((vowelCheck(m.charAt(0)))&&(vowelCheck(m.charAt((m.length()-1))))){
                    n1=n1+m+ch;
                    m="";
                }else{
                    n2=n2+m+ch;
                    m="";
                }
            
            }else{
                m=m+ch;
            }
            /*if(!(((int)ch>=65)&&((int)ch<=90))||!(((int)ch>=97)&&((int)ch>=122))){
                if(i==(n.length()-1)){
                    f=f+ch;
                }
            }*/
        }
        n2=n2.trim();

        f=n1+n2+l;
        return f;
        }

    static boolean vowelCheck(char n){
        if(n=='a'||n=='e'||n=='i'||n=='o'||n=='u'||n=='A'||n=='E'||n=='I'||n=='O'||n=='U'){
            return true;
        }else{
            return false;
        }
    }
}