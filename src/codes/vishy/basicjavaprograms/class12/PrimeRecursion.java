package codes.vishy.basicjavaprograms.class12;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class PrimeRecursion{
    int t=1;
    boolean pr(int n,int c){
        if(c>=2){
            return false;
        }else if(t==n){
            return true;
        }else if(n%t!=0){
            t=t+1;
            return(pr(n,c));
        }else{
            c=c+1;
            t=t+1;
            return(pr(n,c));
        }
    }
    
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number you want to check for prime");
        int num=in.nextInt();
        PrimeRecursion ob=new PrimeRecursion();
        boolean f=ob.pr(num,0);
        System.out.println(f);
    }
    
}