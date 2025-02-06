import java.util.Scanner;

enum Status {
    WIN, DRAW, CONTINUE
}

public class TicTacToe {
    private final int BOARDSIZE = 3; 
    private char[][] board;
    private boolean first_player;
    private boolean game_over;
    private Status status;

 //constructor for board and game
    public TicTacToe(){
        board = new char[BOARDSIZE][BOARDSIZE];
        first_player = true;
        game_over = false;
        status = Status.CONTINUE;

        //initialize board with empty spaces
        for(int i = 0; i < BOARDSIZE; i++){
            for(int j = 0; j < BOARDSIZE; j++){
                board[i][j] = ' ';
            }
        }
    }

    /*
     * @brief method to play the  game
     */
    public void play(){
        Scanner input = new Scanner(System.in);
        while(!game_over){
            print_board();
           int player = first_player ? 1 : 2;
            print_status(player);

            //player input
            System.out.print("Enter row and column (0-2) separated by space: ");
            int row = input.nextInt();
            int col = input.nextInt();

            if(valid_move(row, col)){
                print_symbol(col, first_player ? 'X' : 'O');
                first_player = !first_player; //change whose turn it is
                game_status(); //check for win or end after each players turn
            } else {
                System.out.println("Invalid Move");
            }
        }
        print_board();
        if(status == Status.WIN){
            System.out.println("Player " + (first_player ? 2 : 1) + " wins!");
        } else if(status == Status.DRAW){
            System.out.println("It's a draw...");
        }
        input.close();
    }
   
    /*
     * @Brief prints the status of the game
     * @param player: player whose turn it is
     */
    private void print_status(int player){
        //TODO
    }

    /*
     * @Brief checks on the status of the game
     */
    private void game_status(){
        if(check_winner()){
            status = Status.WIN;
            game_over = true;
        } else if(check_draw()){
            status = Status.DRAW;
            game_over = true;
        }
    }

    /*
     * @brief prints the current game board 
     */
    private void print_board(){
        //TODO
    }

    /*
     * @brief determines what symbol to place and where
     * @param column: column of the 2d array to print in
     * @param value: X or O to put in the array
     */
    private void print_symbol(int column, char value){
        //TODO
    }

    /*
     * @brief determines whether a move can be made or not
     * @param row: row of the 2d array
     * @param column: column of the array
     */
    private boolean valid_move(int row, int column){
        if(row < 0 || row >= BOARDSIZE || column < 0 || column >= BOARDSIZE){
            return false;
        } else if(board[row][column] != ' '){
            return false;
        } else {
            return true;
        }
    }
    

    /*
     * @brief Check if a player has won the game
     */
    private boolean check_winner(){
        //TODO
    }

    /*
     * @brief Check if the game is a draw
     */
    private boolean check_draw(){
    //TODO
    }

    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.play();    
    }
}




