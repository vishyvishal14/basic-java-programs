package codes.vishy.basicjavaprograms.class12;

import java.util.Scanner;
public class PrimeAdam {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int m,n;
        System.out.println("Enter the lower range and upper range(Integer)");
        m=in.nextInt();
        n=in.nextInt();
        if(m>=n){
            System.out.println("Invalid");
        }
        int c=0;
        for(int i=m;i<=n;i++){
            if(isPrime(i)&&isAdam(i)){
                c++;
            }
        }
        System.out.println("There were "+c+" Prime-Adam numbers");
    }
    public static boolean isPrime(int n){
        int f=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                f++;
            }
        }
        return(f==2);
    }
    public static boolean isAdam(int n){
        int rev1=reverse(n);
        int sq1=n*n;
        int sq2=rev1*rev1;
        int rev2=reverse(sq2);
        return(sq1==rev2);
    }
    public static int reverse(int n){
        int rev=0;
        while(n!=0){
            rev=rev*10+n%10;
            n/=10;
        }
        return rev;
    }
  
}
