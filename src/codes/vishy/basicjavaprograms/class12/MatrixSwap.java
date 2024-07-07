// program number  page number 393

import java.util.concurrent.TimeUnit;
import java.util.Scanner;

public class MatrixSwap{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        
        int a[][]=new int[4][4];
        
        System.out.println("Enter the array");
        
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                a[i][j]=in.nextInt();
            }
        }
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
        try{
        TimeUnit.MILLISECONDS.sleep(200);
        TimeUnit.MILLISECONDS.sleep(200);
        TimeUnit.MILLISECONDS.sleep(200);
        TimeUnit.MILLISECONDS.sleep(200);
        TimeUnit.MILLISECONDS.sleep(200);
        TimeUnit.MILLISECONDS.sleep(200);
        System.out.println("drumbeats");
        TimeUnit.MILLISECONDS.sleep(200);
        System.out.println();
        TimeUnit.MILLISECONDS.sleep(200);
        System.out.println();
        TimeUnit.MILLISECONDS.sleep(200);
        System.out.println();
        TimeUnit.MILLISECONDS.sleep(200);
        System.out.println();
        TimeUnit.MILLISECONDS.sleep(200);
        System.out.println("tada"); }catch(InterruptedException e){}
        for(int i=0;i<4;i++){
            int t=a[3][i];
            a[3][i]=a[0][i];
            a[0][i]=t;
        }
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
    }
}