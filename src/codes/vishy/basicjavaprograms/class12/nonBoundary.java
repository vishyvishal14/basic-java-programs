import java.util.*;

public class nonBoundary{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter order of matrix");
        int m=in.nextInt();
        int a[][]=new int[m][m];
        System.out.println("Input matrix values");
        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                a[i][j]=in.nextInt();
            }
        }
        System.out.println("Original matrix");
        print(a,m);
        int b[]=new int[(m-2)*(m-2)];
        int q=0;
        for(int i=1;i<m-1;i++){
            for(int j=1;j<m-1;j++){
                b[q]=a[i][j];
                q++;
            }
        }
        b=sort(b,(m-2)*(m-2));
        q=0;
        for(int i=1;i<m-1;i++){
            for(int j=1;j<m-1;j++){
                a[i][j]=b[q];
                q++;
            }
        }
        System.out.println("Rearranged Matrix");
        print(a,m);
        int c[][]=new int[m][m];
        int sum=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                if(i==j||((i+j)==(m-1))){
                    c[i][j]=a[i][j];
                    sum=sum+a[i][j];
                }
            }
        }
        System.out.println("Diagonal Elements");
        print(c,m);
        System.out.println("Sum of diagonal elements :"+sum);
    }
    public static void print(int a[][],int m){
        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
        public static int[] sort(int a[],int m){
        for(int i=0;i<m;i++){
            for(int j=i+1;j<m;j++){
                if(a[i]>a[j]){
                    int t=a[j];
                    a[j]=a[i];
                    a[i]=t;
                }
            }
        }
        return a;
    }
}