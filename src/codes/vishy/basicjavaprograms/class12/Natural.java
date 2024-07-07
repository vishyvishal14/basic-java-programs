package codes.vishy.basicjavaprograms.class12;

import java.util.*;
public class Natural
{
    public static void main (String args[])
    {
        Scanner in = new Scanner(System.in);
        int a,n,s=0;
        System.out.println("ENTER THE VALUE OF N");
        n=in.nextInt();
        for(a=1;a<=n;a++)
        s=s+a;
        System.out.println("The sum of natural numbers up to "+n+"="+s);
    }
}
