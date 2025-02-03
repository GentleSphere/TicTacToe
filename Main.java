import java.util.Scanner;
enum Status{
    WIN,
    DRAW,
    CONTINUE
}

public class Main {

    int turn = 1;//Determines whose turn it is
    int box;//Determines which box each method affects
    int[] board = {0,0,0,0,0,0,0,0,0}; //Determines which player took which square
    public static void main(String[] args){
        //printBoard();
        return;
    }

    //Receives and displays the move by the player
    private void play(){
        if(turn == 1){
            System.out.println("Player 1: Please make a move:");

        }
        else{
            System.out.println("Player 2: Please make a move");
        }


    }
    //Displays the current status of the game
    private void printStatus(){

    }
    //Prints the current board
    private void printBoard(){
        //Use if statement later to show what is in the middle of each square
        System.out.println(" _______________________ ");
        System.out.println("|       |       |       |");
        for(int i = 0; i <= 2; i++){
            if(board[i] == 0){
                System.out.println("|       |");
            }
            else if(board[i] == 1){
                System.out.println("|   X   |");
            }
            else{
                System.out.println("|   O   |");
            }
        }
        System.out.println("|       |       |       |");
        System.out.println("|_______|_______|_______|");
        System.out.println("|       |       |       |");
        for(int i = 3; i <= 5; i++){
            if(board[i] == 0){
                System.out.println("|       |");
            }
            else if(board[i] == 1){
                System.out.println("|   X   |");
            }
            else{
                System.out.println("|   O   |");
            }
        }
        System.out.println("|_______|_______|_______|");
        System.out.println("|       |       |       |");
        for(int i = 6; i <= 9; i++){
            if(board[i] == 0){
                System.out.println("|       |");
            }
            else if(board[i] == 1){
                System.out.println("|   X   |");
            }
            else{
                System.out.println("|   O   |");
            }
        }
        System.out.println("|_______|_______|_______|");
    }
    //Checks if the move made was valid
    /* 
    private bool validMove(){

    }
    */

}
