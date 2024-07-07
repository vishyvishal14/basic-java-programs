/**
 * page number 355 program 12
 */

import java.util.Scanner;

public class highestValue{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int m[][]=new int[4][4];
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                System.out.println("Enter array element for row "+(i+1)+" and column "+(j+1));
                m[i][j]=in.nextInt();
            }
        }
        System.out.println("The array elements are :");
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                System.out.print(m[i][j]+"\t");
            }
            System.out.println();
        }
        int h[]=new int[4];
        for(int i=0;i<4;i++){
            int q=m[0][i];
            for(int j=0;j<3;j++){
                if(q<m[j+1][i]){
                    q=m[j+1][i];
                }
            }
            h[i]=q;
        }
        int l[]=new int[4];

        for(int i=0;i<4;i++){
            int q=m[0][i];
            for(int j=0;j<3;j++){
                if(q>m[j+1][i]){
                    q=m[j+1][i];
                }
            }
            l[i]=q;
        }
        for(int i=0;i<4;i++){
            System.out.println("Column "+(i+1)+" highest value is "+h[i]);
            System.out.println("Column "+(i+1)+" lowest value is "+l[i]);
        }
    }
}
