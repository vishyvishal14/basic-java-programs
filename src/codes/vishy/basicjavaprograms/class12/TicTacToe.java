package codes.vishy.basicjavaprograms.class12;


import java.util.Scanner;
import java.util.concurrent.TimeUnit;
/* Tic Tac Toe by Vishal PJ
 *
 * First to get three in a row wins the game!
 * Started on: 21st December 2023
 * Finished by: 15th January 2024
 *
 * TODO List:
 * [DONE]Make the game loopable by players after match end
 * Use classes for everything so the game can be repeated
 *
 */
public class TicTacToe{
    int m=0;
    int x=0;
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        char x[][]=new char[3][3];
        TicTacToe st=new TicTacToe();
        st.emptySpaces();
        st.welcomeInterface();
        int sg=0;
        do{
            System.out.println("Start game? Enter \"y\" or \"n\"");
            char game=in.next().charAt(0);
            if(game=='y'){
                st.resetGame(x);
                st.runGame(x);
                System.out.println("Game over, do you want to restart ?Enter \"y\" or \"n\"");
                char re=in.next().charAt(0);{
                    if(re=='y'){
                        st.resetGame(x);
                        st.runGame(x);
                    }else if(re=='n'){
                        sg=1;
                    }
                }
            }else{
                System.out.println("Terminate game? Enter \"y\" or \"n\"");
                char term=in.next().charAt(0);
                if(term=='y'){
                    System.exit(-1);
                }
            }
        }while(sg==0);
    }

    void resetGame(char r[][]){
        int q=49;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                r[i][j]=(char)q;
                q++;
            }
        }

    }

    void welcomeInterface(){
        System.out.println("Welcome to Tic Tac Toe by vishalpj");
        System.out.println("");
        System.out.println("First the move is played by Player X who can use the character X");
        System.out.println("Second the move is played by Player Y who can use the character Y");
        System.out.println("First person to get three in a row wins!");
        System.out.println("");


    }


    void printGameStatus(char[][] k){
        for(int i=0;i<3;i++){
            System.out.println("-------------------------------------------------");
            System.out.print("|"+"\t");
            for(int j=0;j<3;j++){
                System.out.print(k[i][j]+"\t"+"|"+"\t");
            }
            System.out.println();
        }
        System.out.println("-------------------------------------------------");

    }
    void emptySpaces(){
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

    }
    void repeaterCheck(int rep[]){
        for(int i=0;i<10;i++){
            if(!(rep[i]<=1)){
                System.out.println("Failed check, repeating number, terminating");
                System.exit(-1);
            }
        }
    }

    void runGame(char[][] q){
        int r[]= new int[10];

        Scanner st=new Scanner(System.in);
        switch(m){
            case 0:

        }
        System.out.println("Player 1: 'X'");
        System.out.println("Player 2: 'O'");
        System.out.println("Default Variables");
        printGameStatus(q);
        int x;
        System.out.println("Player 1, please enter your position");
        x=st.nextInt();
        r[x]++;
        repeaterCheck(r);
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(q[i][j]==Integer.toString(x).charAt(0)){
                    q[i][j]='X';
                }
            }
        }
        emptySpaces();
        gameLogic(q);
        printGameStatus(q);
        System.out.println("Player 2, please enter your position");
        x=st.nextInt();
        r[x]++;
        repeaterCheck(r);
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(q[i][j]==Integer.toString(x).charAt(0)){
                    q[i][j]='O';
                }
            }
        }
        emptySpaces();
        gameLogic(q);
        printGameStatus(q);
        System.out.println("Player 1, please enter your position");
        x=st.nextInt();
        r[x]++;
        repeaterCheck(r);
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(q[i][j]==Integer.toString(x).charAt(0)){
                    q[i][j]='X';
                }
            }
        }
        emptySpaces();
        gameLogic(q);
        printGameStatus(q);
        System.out.println("Player 2, please enter your position");
        x=st.nextInt();
        r[x]++;
        repeaterCheck(r);
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(q[i][j]==Integer.toString(x).charAt(0)){
                    q[i][j]='O';
                }
            }
        }
        emptySpaces();
        gameLogic(q);
        printGameStatus(q);
        System.out.println("Player 1, please enter your position");
        x=st.nextInt();
        r[x]++;
        repeaterCheck(r);
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(q[i][j]==Integer.toString(x).charAt(0)){
                    q[i][j]='X';
                }
            }
        }
        emptySpaces();
        gameLogic(q);
        printGameStatus(q);
        System.out.println("Player 2, please enter your position");
        x=st.nextInt();
        r[x]++;
        repeaterCheck(r);
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(q[i][j]==Integer.toString(x).charAt(0)){
                    q[i][j]='O';
                }
            }
        }
        emptySpaces();
        gameLogic(q);
        printGameStatus(q);
        System.out.println("Player 1, please enter your position");
        x=st.nextInt();
        r[x]++;
        repeaterCheck(r);
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(q[i][j]==Integer.toString(x).charAt(0)){
                    q[i][j]='X';
                }
            }
        }
        emptySpaces();
        gameLogic(q);
        printGameStatus(q);
        System.out.println("Player 2, please enter your position");
        x=st.nextInt();
        r[x]++;
        repeaterCheck(r);
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(q[i][j]==Integer.toString(x).charAt(0)){
                    q[i][j]='O';
                }
            }
        }
        emptySpaces();
        gameLogic(q);
        printGameStatus(q);
        System.out.println("Player 1, please enter your position");
        x=st.nextInt();
        r[x]++;
        repeaterCheck(r);
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(q[i][j]==Integer.toString(x).charAt(0)){
                    q[i][j]='X';
                }
            }
        }
        emptySpaces();
        gameLogic(q);
        printGameStatus(q);
        System.out.println("It is a draw");
    }
    /*
        Logic of the game
        Total checks:8
        three rows
        three colums
        and two diagonals if they are straight in either X/O
        if everything fail boom boom bam bam its a draw ggwp

    */

    void terminator(){
        try{
            TimeUnit.MILLISECONDS.sleep(2000);
        }catch(InterruptedException e){}
        System.exit(-1);
    }
    void gameLogic(char[][] l){
        int q=0,p=0,d1=0,d2=0;
        for(int i=0;i<3;i++){
            q=0;
            for(int j=0;j<3;j++){
                if(l[0][j]=='X'){
                    q++;
                    if(q==3){
                        System.out.println("Player 1 wins");
                        m=1;
                        printGameStatus(l);
                        terminator();
                    }
                }
            }
            q=0;
            for(int j=0;j<3;j++){
                if(l[0][j]=='O'){
                    q++;
                    if(q==3){
                        System.out.println("Player 2 wins");
                        m=1;
                        printGameStatus(l);
                        terminator();
                    }
                }
            }
        }
        for(int i=0;i<3;i++){
            p=0;
            for(int j=0;j<3;j++){
                if(l[j][0]=='X'){
                    p++;
                    if(p==3){
                        System.out.println("Player 1 wins");
                        m=1;
                        printGameStatus(l);
                        terminator();
                    }
                }
            }
            p=0;
            for(int j=0;j<3;j++){
                if(l[j][0]=='O'){
                    p++;
                    if(p==3){
                        System.out.println("Player 2 wins");
                        m=1;
                        printGameStatus(l);
                        terminator();
                    }
                }
            }
        }
        d1=0;
        for(int i=0;i<3;i++){
            if(l[i][i]=='X'){
                d1++;
                if(d1==3){
                    System.out.println("Player 1 wins");
                    m=1;
                    printGameStatus(l);
                    terminator();
                }
            }
        }
        d1=0;
        for(int i=0;i<3;i++){
            if(l[i][i]=='O'){
                d1++;
                if(d1==3){
                    System.out.println("Player 2 wins");
                    m=1;
                    printGameStatus(l);
                    terminator();
                }
            }
        }
        d2=0;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if((i+j)==2&&l[i][j]=='X'){
                    d2++;
                    if(d2==3){
                        System.out.println("Player 1 wins");
                        m=1;
                        printGameStatus(l);
                        terminator();
                    }
                }
            }
        }
        d2=0;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if((i+j)==2&&l[i][j]=='O'){
                    d2++;
                    if(d2==3){
                        System.out.println("Player 1 wins");
                        m=1;
                        printGameStatus(l);
                        terminator();
                    }
                }
            }
        }
        /*if(q==3||p==3||d1==3||d2==3){
            System.out.println("Player X wins!");
            System.exit(0);
        }*/

    }
        /*void gameLogicO(char[][] l){
        int q=0,p=0,d1=0,d2=0;
        for(int i=0;i<3;i++){
            if(l[0][i]=='O'){
                q++;
            }
        }
        for(int i=0;i<3;i++){
            if(l[i][0]=='O'){
                p++;
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(i==j){
                    if(l[i][j]=='O'){
                        d1++;
                    }
                }
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if((i+j)==2&&l[i][j]=='O'){
                    d2++;
                }
            }
        }
        if(q==3||p==3||d1==3||d2==3){
            System.out.println("Player O wins!");
            System.exit(0);
        }
    }*/
}


