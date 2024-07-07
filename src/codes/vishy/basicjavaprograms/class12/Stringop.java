// page 448 qn 8
package codes.vishy.basicjavaprograms.class12;

import java.util.Scanner;

public class Stringop{
    String str;
    String fin;
    Stringop(){
        str="";
        fin="";
    }
    void accept(){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the string");
        str=in.nextLine();
    }
    void encode(){

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(!Character.isWhitespace(ch)){
                int k;
                k=(int)ch;
                k=k+2;
                fin=fin+(char)k;
            }else{
                fin=fin+" ";
            }
        }
        //System.out.println(fin);
    }
    void display(){
        fin=fin+" " ;
        for(int i=0;i<fin.length();i++){        
            char ch=fin.charAt(i);
            if(ch!=' '){
                System.out.print(fin.charAt(i));
            }else{
                System.out.println();
            }
        }
    }
    public static void main(String args[]){
        Stringop o=new Stringop();
        o.accept();
        o.encode();
        o.display();
    }
}