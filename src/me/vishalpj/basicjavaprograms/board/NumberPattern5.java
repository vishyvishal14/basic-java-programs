package me.vishalpj.basicjavaprograms.board;

public class NumberPattern5 {
    public static void main(String[] args) {

        int a, b;
        for (a = 1; a <= 5; a++) {
            for (b = 1; b <= a; b++) {
                System.out.print(a + " ");
            }
            System.out.println();
        }


    }
}
