//Recursion BETA BY VishalPJ
package codes.vishy.basicjavaprograms.class12;
public class Recursion
{   static int i=1;
    public static int fact(int f){
        int soln=1;
        if(i!=f){
            soln=soln*i;
            i++;
        }
        return fact(soln);
    }
}
