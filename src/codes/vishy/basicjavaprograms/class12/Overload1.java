// page number 395 qn 23
package codes.vishy.basicjavaprograms.class12;
import java.util.*;

public class Overload1
{
    Scanner in=new Scanner(System.in);
    public double series(double n){
        double x=1;
        double sum=0;
        while(x<=(int)n){
            sum=sum+(x/(x+1));
            x++;
        }
        return sum;       
    }
    public double series(double a,double n){
        double sum=0;
        int j=1;
        for(int i=1;i<=n;i++){
            sum=sum+(j/(Math.pow(a,i+1)));
            j=j+3;
        }
                                                                                                                                                                                                          
        return sum;       
    }
}
