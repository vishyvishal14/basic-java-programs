package codes.vishy.basicjavaprograms.classxdiscord;

import java.util.Scanner;

public class IntegerJava {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, y;
        int x;
        System.out.println("Enter the  array size");
        n = in.nextInt();
        int[] m = new int[n];
        int[] freq = new int[10];
        System.out.println("Enter elements:");
        for (int i = 0; i < m.length; i++) {
            m[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            do {
                y = m[i];
                x = y % 10;
                y /= 10;
                freq[x] += 1;
            } while (y != 0);
        }
        int maxCount = 0;
        int mostFrequentDigit = 0;
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > maxCount) {
                maxCount = freq[i];
                mostFrequentDigit = i;
            }
        }

        System.out.println(mostFrequentDigit);



    }
}
