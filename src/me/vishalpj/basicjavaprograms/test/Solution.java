package me.vishalpj.basicjavaprograms.test;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan=new Scanner(System.in);
        int T=10;
        String s1="",s2="",s="";
        for(int i=0;i<=T;i++)
        {
            s=scan.nextLine();
            int n=s.length();
            for(int k=0;k<n;k++){
                if(n%2==0){
                    char chr=s.charAt(k);
                    s1=s1+chr;
                }else if(n%2!=0){
                    char chr=s.charAt(k);
                    s2=s2+chr;
                }
            }
        }


    }
}