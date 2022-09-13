package me.vishalpj.basicjavaprograms.basic;

import me.vishalpj.basicjavaprograms.dependencies.Colour;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args){
        Colour c=new Colour();
        //m is descending
        //n is original
        //p is ascending
        int m[] =new int[10];
        int n[] =new int[10];
        int p[] =new int[10];
        int i,j,t;
        Scanner in=new Scanner(System.in);
        System.out.println();
        System.out.println(c.RED+"====================================================================");
        System.out.println(c.BLUE+"Enter the array you want to sort order");
        System.out.println(c.RED+"====================================================================");
        System.out.println(c.RESET);
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
        System.out.println(c.GREEN+"Original array :");
        for(i=0;i<n.length;i++){
            System.out.print(c.WHITE+n[i]);
            System.out.print(" ");
        }
        System.out.println();
        System.out.println(c.GREEN+"Sorted in ascending order: ");
        for(i=0;i<p.length;i++){
            System.out.print(c.WHITE+p[i]);
            System.out.print(" ");
        }
        System.out.println();
        System.out.println(c.GREEN+"Sorted in descending order: ");
        for(i=0;i<m.length;i++){
            System.out.print(c.WHITE+m[i]);
            System.out.print(" ");
        }
        System.out.println();


    }
}