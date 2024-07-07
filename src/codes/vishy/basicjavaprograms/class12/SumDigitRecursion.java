        import java.util.*;

public class SumDigitRecursion{
    int dig(int n){
        if(n==0){
            return(0);
        }else{
            return(n%10+dig(n/10));
        }
    }
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number to add its digits");
        int num,sum;
        num=in.nextInt();
        SumDigitRecursion ob;
        ob=new SumDigitRecursion();
        sum=ob.dig(num);
        System.out.println("Sum of digits="+sum);
    }
}