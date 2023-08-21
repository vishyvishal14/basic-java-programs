package codes.vishy.basicjavaprograms.basic;

import codes.vishy.basicjavaprograms.dependencies.Colour;

import java.util.Scanner;

public class Matrices {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int[][] a = new int[3][3];
        int[][] b = new int[3][3];
        int[][] c = new int[3][3];
        System.out.println("Enter values of the first 3*3 matrix");

        for(int x=0;x<3;x++){
            for(int y=0;y<3;y++){
                a[x][y]=in.nextInt();
            }
        }

        System.out.println("Enter values of the second 3*3 matrix");
        for(int x=0;x<3;x++){
            for(int y=0;y<3;y++){
                b[x][y]=in.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = a[i][j] + b[i][j];
                System.out.print(Colour.BLACK+"|"+" "+Colour.GREEN +c[i][j] + " ");
            }
            System.out.println();
        }
    }
}