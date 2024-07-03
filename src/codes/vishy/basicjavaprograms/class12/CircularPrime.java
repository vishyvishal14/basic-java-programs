package codes.vishy.basicjavaprograms.class12;

/*1.CIRCULAR PRIME

A Circular Prime is a prime number that remains prime under cyclic shifts of its digits. When the leftmost digit is removed and replaced at the end of the remaining string of digits, the generated number is still prime. The process is repeated until the original number is reached again.
A number is said to be prime if it has only two factors 1 and itself. Example:
131 311 113
Hence, 131 is a circular prime.
Accept a positive number N and check whether it is a circular prime or not. The new numbers formed after the shifting of the digits should also be displayed.
Test your program with the following data and some random data: Example 1:
INPUT: N = 197
OUTPUT: 197
971 719
197 IS A CIRCULAR PRIME. Example 2:
INPUT: N = 1193
OUTPUT: 1193
1931 9311 3119
1193 IS A CIRCULAR PRIME. Example 3:
INPUT: N = 29
OUTPUT: 29
92
29 IS NOT A CIRCULAR PRIME.
*/

import java.util.Scanner;

public class CircularPrime {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.print("N = ");
        int n=in.nextInt();
        int temp =n;
        int k=checkDigits(n);
        int q=0;
        do{
            if (isPrime(temp)) {
                q++;
            }
            int t1=temp%10;
            temp=temp/10;
            String st;
            st=temp+""+t1;
            temp=Integer.parseInt(st);
            System.out.print(temp);
        }while (temp!=n);

        if(q==k){
            System.out.println("IT IS A CIRCULAR PRIME");
        }else{
            System.out.println("It IS NOT CIRCULAR PRIME");
        }

    }

    public static boolean isPrime(int n){
        if(n==1){
            return false;
        }
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static int checkDigits(int n) {
        int temp1=n;
        int x=0;
        while (temp1 != 0) {
            int t1 = temp1 % 10;
            temp1 = temp1 / 10;
            x++;
        }
        return x;
    }
}
