package codes.vishy.basicjavaprograms.loops.nested;

public class PyramidScheme {
    public static void main(String[] args){
        int i,k,j,n=5;
        for(i=1;i<n;i++){
            for(k=n;k>i;k++){
                System.out.println(" ");
            }
            for(j=1;j<n;j++){
                System.out.println(j);
            }
            System.out.println();
        }
    }
}
