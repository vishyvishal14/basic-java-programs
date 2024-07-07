 import java.util.*;

public class EvilNumber{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number you want to check for evil number");
        int e=in.nextInt();
        if(e<3 || e>99){
            System.out.println("Out of range");
            System.exit(0);
        }
        int bin=convertToBinary(e);
        int count=counter(bin);
        if(count % 2 == 0){
            System.out.println("It is an evil number");
        }else{
            System.out.println("It is not an evil number");
        }
    }
    static int convertToBinary(int n){
        int b=0,p=0;
        while(n>0){
            int d=n%2;
            b=b+(int)Math.pow(10,p++)*d;
            n=n/2;
        }
        System.out.println(b);
        return b;
    }
    static int counter(int n){
        int c=0;
        while(n>0){
            int d=n%10;
            if(d == 1){
                c++;
            }
            n=n/10;
        }
        return c;
    }
}
