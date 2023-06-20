package me.vishalpj.basicjavaprograms.classxdiscord;

import java.util.*;

public class countdiigits
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n");
        int n = sc.nextInt();


        int arr[] = new int[n];
        System.out.println("Enter n no of ele:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int freq[] = new int[10];

        for(int i = 0; i < n; i++)
        {
            String arributstring = arr[i] + "";
            for(int j = 0; j < arributstring.length(); j++)
            {
                int d = arr[i]%10;
                freq[d]++;
                arr[i] = arr[i]/10;
            }
        }

        int max = freq[0];
        int min = freq[0];
        int maxIndex = -1;
        int minIndex = -1;
        for(int i = 0; i< 10; i++)
        {
            // so first non-0 instance

            if(freq[i] != 0)
            {
                minIndex = i;
                break;
            }
        }
        for(int i = 0; i < 10; i++)
        {
            if(freq[i] > max)
            {
                max = freq[i];
                maxIndex = i;
            }
            if(freq[i] < min && freq[i] != 0)
            {
                min = freq[i];
                minIndex = i;
            }
        }

        for(int i = 0; i < 10; i++)
        {
            if(freq[i] == max && i != maxIndex)
            {
                System.out.println(minIndex);
                System.exit(0);
            }
        }

        System.out.println(maxIndex);
    }
}