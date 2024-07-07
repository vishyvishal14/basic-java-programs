// page 451 program 20

import java.util.Scanner;

public class wordWise{
    String str;
    wordWise(){
        String str="";
    }
    void readsent(){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the string");
        str=in.nextLine();        
    }
    int freq_vowel(String w){
        int x=0;
        for(int i=0;i<w.length();i++){
            char c=w.charAt(i);
            if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U'||c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                x=x+1;
            }
        }
        return x;
    }
    void arrange(){
        String mid="";
        String q=str+" ";
        for(int i=0;i<q.length();i++){
            char c=q.charAt(i);
            if(!Character.isWhitespace(c)){
                mid=mid+c;
            }else{
                System.out.print(mid+"\t");
                System.out.println(freq_vowel(mid));
                mid="";
            }
        }
        
    }
    public static void main(String args[]){
        wordWise ob=new wordWise();
        ob.readsent();
        ob.arrange();
    }
}