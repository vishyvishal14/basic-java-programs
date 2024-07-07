import java.util.*;
import java.util.concurrent.TimeUnit;

public class TailRecursion{
    public static void tail(int n){
        if(n==0){
            return;
        }else{
            try{
                TimeUnit.MILLISECONDS.sleep(20);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(n);
        }
        tail(n-1);
    }
    public static void main(){
        int k;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter no");
        k=in.nextInt();
        tail(k);
    }
}