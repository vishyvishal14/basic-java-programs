import java.util.*;

public class Goldbach{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the even number you want to find pairs of");
        int n=in.nextInt();
        System.out.println("Prime+odd inputs");
        if(n%2==0){//Check if number we want to find is even or not
            for(int i=1;i<=n;i++){//Two loops
                for(int j=0;j<=n;j++){
                    if(!(i%2==0)){//Check if i is odd
                        if(!(j%2==0)){//Check if I is even
                            if(isPrime(i)&&(isPrime(j))){//Prime number check
                                if((i+j)==n){
                                    System.out.println(i+" "+j);
                                }
                            }   
                        }
                    }
                }
            }
        }
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
}