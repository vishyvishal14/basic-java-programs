package me.vishalpj.basicjavaprograms.basic;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args){
        //m is descending
        //n is original
        //p is ascending
        int m[] =new int[10];
        int n[] =new int[10];
        int p[] =new int[10];
        int i,j,t;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the array you want to sort order");
        for(i=0;i<m.length;i++){
            m[i]=in.nextInt();
        }
        for(i=0;i<m.length;i++){
            n[i]=m[i];
            p[i]=n[i];
        }

        for(i=0;i<m.length-1;i++){
            for(j=0;j<(m.length-1)-i;j++){
                if(m[j]<m[j+1]){
                    t=m[j];
                    m[j]=m[j+1];
                    m[j+1]=t;

                }

            }
        }
        for(i=0;i<p.length-1;i++){
            for(j=0;j<(p.length-1)-i;j++){
                if(p[j]>p[j+1]){
                    t=p[j];
                    p[j]=p[j+1];
                    p[j+1]=t;

                }

            }
        }
        System.out.println();
        System.out.println("Original array :");
        for(i=0;i<n.length;i++){
            System.out.print(n[i]);
            System.out.print(" ");
        }
        System.out.println();
        System.out.println("Sorted in ascending order: ");
        for(i=0;i<p.length;i++){
            System.out.print(p[i]);
            System.out.print(" ");
        }
        System.out.println();
        System.out.println("Sorted in descending order: ");
        for(i=0;i<m.length;i++){
            System.out.print(m[i]);
            System.out.print(" ");
        }
        System.out.println();




    }
}
