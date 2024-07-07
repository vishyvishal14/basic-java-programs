package codes.vishy.basicjavaprograms.class12;

import java.util.*;



class fact_recur{

    double fact(int n){
        if(n<2){
            return 1;
        }else{
            return((double)(n*fact(n-1)));
        }
    }
    public static void main(){
        Scanner in=new Scanner(System.in);
        int k;
        System.out.println("Enter a number");
        k=in.nextInt();
        fact_recur ob=new fact_recur();
        double f=ob.fact(k);
        System.out.println(f);
    }
}