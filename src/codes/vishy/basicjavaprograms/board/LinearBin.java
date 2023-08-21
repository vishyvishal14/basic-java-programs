package codes.vishy.basicjavaprograms.board;

import java.util.*;

public class LinearBin {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] a =new int[10];
        System.out.println("Enter numbers bruhh");
        for(int i=0;i<10;i++)
            a[i]=sc.nextInt();
        int flag = 0;
        System.out.println("Enter number to be searched");
        int n = sc.nextInt();
        System.out.println("Which way would you prefer?");
        if (sc.next().equalsIgnoreCase("linear")) {
            // linear
            for (int i = 0; i < a.length; i++) {
                if (a[i] == n) {
                    System.out.println("YES bro its there");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0)
                System.out.println("No bro sorry not found");
        } else {
            // binary
            if (n < a.length / 2) {
                for (int i = 0; i < (a.length / 2); i++) {
                    if (n == a[i]) {
                        System.out.println("YES bro its there");
                        flag = 1;
                        break;
                    }
                }
                if (flag == 0)
                    System.out.println("No bro sorry not found");
            } else {
                for (int i = a.length / 2; i < a.length; i++) {
                    if (n == a[i]) {
                        System.out.println("YES bro its there");
                        flag = 1;
                        break;
                    }
                }
                if (flag == 0)
                    System.out.println("No bro sorry not found");
            }
        }
    }
}