// pg 353 qn 1 

package codes.vishy.basicjavaprograms.class12;

import java.util.*;
public class doubleDimensional{
    public static void main(String args[]){
        int m[][]=new int[4][4];
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the array");
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                m[i][j]=in.nextInt();
                
            }
        }
        int r[]=new int[4];
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                r[i]=r[i]+m[i][j];
            }
        }
        int c[]=new int[4];
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                c[i]=c[i]+m[j][i];
            }
        }
        for(int i=0;i<4;i++){
            System.out.println("Row "+i+" :"+r[i]+" characters");
        }
        for(int i=0;i<4;i++){
            System.out.println("Column "+i+" :"+c[i]+" characters");
        }
    }
}