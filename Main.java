import java.util.Scanner;


enum Status{
    WIN,
    DRAW,
    CONTINUE
}

public class Main {
    
    public static void main(String[] args){
        int turn = 1;//Determines whose turn it is
        printBoard();
        return;
    }

    //Receives and displays the move by the player
    private void play(){
        while(Status == CONTINUE){
        Scanner move = new Scanner(System.in);
        //Player one's turn
        if(turn  % 2 == 0){ //if it is even then player ones turn.
            System.out.println("Player 1: Please make a move:");
        int input1 = move.nextLine();
            int input2 = move.nextLine();
            board[input1]
            turn++;

            
        }
        //Player two's turn
        else{
            System.out.println("Player 2: Please make a move");
            input = move.nextLine();
            input2 = move.nextLine();
            turn++;
        }
        }




    }
    //Displays the current status of the game
    private void printStatus(){

    }
    //Prints the current board
    private static void printBoard(){
        //Use if statement later to show what is in the middle of each square
        int[3][3] board = {{0,0,0},{0,0,0}}; //Determines which player took which square
        
        System.out.println(" _______________________ ");
        System.out.println("|       |       |       |");
        if(board[0] == 0){
            System.out.print("|       |");
        }
        else if(board[0] == 1){
            System.out.print("|   X   |");
        }
        else{
            System.out.print("|   O   |");

        }
            
        if(board[1] == 0){
           System.out.print("       |");
        }
        else if(board[1] == 1){
            System.out.print("   X   |");
        }
        else{
            System.out.print("   O   |");
        }

        if(board[2] == 0){
           System.out.println("       |");
        }
        else if(board[2] == 1){
            System.out.println("   X   |");
        }
        else{
            System.out.println("   O   |");
        
        }
        System.out.println("|_______|_______|_______|");
        System.out.println("|       |       |       |");
        if(board[3] == 0){
            System.out.print("|       |");
        }
        else if(board[3] == 1){
            System.out.print("|   X   |");
        }
        else{
            System.out.print("|   O   |");

        }
            
        if(board[4] == 0){
           System.out.print("       |");
        }
        else if(board[4] == 1){
            System.out.print("   X   |");
        }
        else{
            System.out.print("   O   |");
        }

        if(board[5] == 0){
           System.out.println("       |");
        }
        else if(board[5] == 1){
            System.out.println("   X   |");
        }
        else{
            System.out.println("   O   |");
        
        }
        System.out.println("|_______|_______|_______|");
        System.out.println("|       |       |       |");
        if(board[6] == 0){
            System.out.print("|       |");
        }
        else if(board[6] == 1){
            System.out.print("|   X   |");
        }
        else{
            System.out.print("|   O   |");

        }
            
        if(board[7] == 0){
           System.out.print("       |");
        }
        else if(board[7] == 1){
            System.out.print("   X   |");
        }
        else{
            System.out.print("   O   |");
        }

        if(board[8] == 0){
           System.out.println("       |");
        }
        else if(board[8] == 1){
            System.out.println("   X   |");
        }
        else{
            System.out.println("   O   |");
        
        }
        System.out.println("|_______|_______|_______|");
    }
    //Checks if the move made was valid
    /* 
    private bool validMove(){

    }
    */

}
