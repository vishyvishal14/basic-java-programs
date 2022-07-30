package me.vishalpj.basicjavaprograms.board;

public class NumberPattern {
    public static void main(String args[]){
        int a,b,c=1;
        for(a=1;a<=4;a++) {
            for (b = 1; b <= a; b++) {
                System.out.print(c+" ");
                    c++;
            }
            System.out.println();
        }
    }
}
