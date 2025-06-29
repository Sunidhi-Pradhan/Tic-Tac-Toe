class Main{
    public static void main(String[] args) {
        char[][] board = new char [3][3];
        for(int row =0; row < board.length; row++){
            for(int col = 0; col < board[row].length; col++){
                board[row][col] = ' ';
            }
        }

        char player = 'X';
        boolean gameOver = false;
        Scanner scanner = new Scanner(System.in);

        while (!gameOver) {
            printBoard(board);
            System.out.println("Player " + player + "enter:");
            int row = scanner.nextInt();
            int col = scanner.nextInt();

            if(board[row][col] == ' ') {
                board[row][col] = player;
                if (checkWin(board, player)) {
                    printBoard(board);
                    System.out.println("Player " + player + " wins!");
                    gameOver = true;
                } else if (isBoardFull(board)) {
                    printBoard(board);
                    System.out.println("It's a draw!");
                    gameOver = true;
                } else {
                    player = (player == 'X') ? 'O' : 'X'; // Switch player
                }
            } else {
                System.out.println("Cell already taken. Try again.");
            }
        }
    }
    public static void printBoard(char[][] board) {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                System.out.print(board[row][col]);
                if (col < board[row].length - 1) {
                    System.out.print("|");
                }
            }
            System.out.println();
            if (row < board.length - 1) {
                System.out.println("-----");
            }
        }
        if (
            board[0][0] == player && board[0][1] == player && board[0][2] == player ||
            board[1][0] == player && board[1][1] == player && board[1][2] == player ||
            board[2][0] == player && board[2][1] == player && board[2][2] == player ||
            board[0][0] == player && board[1][0] == player && board[2][0] == player ||
            board[0][1] == player && board[1][1] == player && board[2][1] == player ||
            board[0][2] == player && board[1][2] == player && board[2][2] == player ||
            board[0][0] == player && board[1][1] == player && board[2][2] == player ||
            board[0][2] == player && board[1][1] == player && board[2][0] == player
        ) {
            
        }
    }
}