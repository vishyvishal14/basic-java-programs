package codes.vishy.basicjavaprograms.class11;

import java.util.Scanner;

public class Bonus {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        char grade;
        int basic;
        double bonus=0;
        System.out.println("Enter your grade according to your role");
        System.out.println("Enter A if you are officer.");
        System.out.println("Enter B if you are supervisor.");
        System.out.println("Enter C if you are worker.");
        grade=in.next().charAt(0);
        System.out.println("Enter the annual salary you recieve.");
        basic=in.nextInt();
        switch (grade){
            case 'A':
                bonus=basic*(12.0/100.0);
                if(bonus>=50000){
                    bonus=50000;
                }
                break;
            case 'B':
                bonus=basic*(10.0/100.0);
                if(bonus>=40000){
                    bonus=40000;
                }
                break;
            case 'C':
                bonus=basic*(8.33/100.0);
                if(bonus>=30000){
                    bonus=30000;
                }
                break;
            default:
                System.out.println("Invalid grade. Quitting.");
                System.exit(0);
        }
        System.out.println("Bonus: "+bonus);
    }
}
