//program 16

package codes.vishy.basicjavaprograms.class12;

import java.util.*;

public class DateValidation{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter date of birth in dd mm yyyy format");
        int d=in.nextInt();
        int m=in.nextInt();
        int y=in.nextInt();
        if(validator(d,m,y)){
            System.out.println("Date is valid");
        }else{
            System.out.println("Date is invalid");
        }
    }
    static boolean validator(int d,int m,int y){
        int[] arr={0,31,28,31,30,31,30,31,31,30,31,30,31};
        if(y%4==0){
            arr[2]=29;
        }
        if(!(m>=1&&m<=12)){
            return false;
        }
        if(d<=arr[m]){
            return true;
        }
        return false;
    }
}