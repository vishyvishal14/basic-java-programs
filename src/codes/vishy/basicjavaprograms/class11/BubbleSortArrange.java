package codes.vishy.basicjavaprograms.class11;

import java.util.Scanner;

public class BubbleSortArrange {
    public static void main(String args[]){
        int m[][]=new int[4][4];
        Scanner in=new Scanner(System.in);
        System.out.println("enter elements of the array");
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                m[i][j]=in.nextInt();
            }
        }
        //the one without 3-j
        for(int i=0;i<4;i++){
            for(int j=0;j<3;j++){
                for(int k=0;k<3;k++){
                    if(m[i][k]>m[i][k+1]){
                        int t=m[i][k];
                        m[i][k]=m[i][k+1];
                        m[i][k+1]=t;
                    }
                }
            }
        }

//        //the one with 3-j
//        for(int i=0;i<4;i++){
//            for(int j=0;j<3;j++){
//                for(int k=0;k<3-j;k++){
//                    if(m[i][k]>m[i][k+1]){
//                        int t=m[i][k];
//                        m[i][k]=m[i][k+1];
//                        m[i][k+1]=t;
//                    }
//                }
//            }
//        }

        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                System.out.print(m[i][j]+"\t");
            }
            System.out.println();
        }

    }
}
