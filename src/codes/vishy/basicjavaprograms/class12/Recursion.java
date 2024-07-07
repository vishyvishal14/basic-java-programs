//Recursion BETA BY VishalPJ
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
