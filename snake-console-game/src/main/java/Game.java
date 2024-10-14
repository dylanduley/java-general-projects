import java.util.Scanner;

class Game {
    private static final int BOARD_LENGTH = 10;
    private final char[][] gameBoard = new char[BOARD_LENGTH + 2][BOARD_LENGTH + 2];
    private final Snake snake;
    private final Apple apple;
    private boolean gameOver;
    private int score;
    private final Scanner input = new Scanner(System.in);

    public Game() {
        this.snake = new Snake(BOARD_LENGTH);
        this.apple = new Apple(BOARD_LENGTH, snake);
        this.gameOver = false;
        this.score = 0;
    }

    public void start() {
        drawGameBoard();
        while (!gameOver) {
            printGameBoard();
            getInput();
            updateGame();
        }
        endGame();
    }

    private void getInput() {
        System.out.print("Enter direction (w/a/s/d) or e to exit: ");
        String direction = input.nextLine();
        if (!snake.move(direction)) {
            gameOver = true;
        }
    }

    private void updateGame() {
        if (snake.checkCollisionWith(apple)) {
            score++;
            apple.reposition(snake);
            snake.grow();
        } else {
            snake.moveTail();
        }
        drawGameBoard();
    }

    private void drawGameBoard() {
        middleOfGameBoard();
        drawBorders();
        apple.draw(gameBoard);
        snake.draw(gameBoard);
    }

    private void middleOfGameBoard() {
        for (int i = 1; i <= BOARD_LENGTH; i++) {
            for (int j = 1; j <= BOARD_LENGTH; j++) {
                gameBoard[i][j] = ' ';
            }
        }
    }

    private void drawBorders() {
        for (int i = 0; i < gameBoard.length; i++) {
            gameBoard[0][i] = '-';
            gameBoard[gameBoard.length - 1][i] = '-';
        }
        for (int i = 0; i < gameBoard.length; i++) {
            gameBoard[i][0] = '|';
            gameBoard[i][gameBoard.length - 1] = '|';
        }
        gameBoard[0][0] = '+';
        gameBoard[0][gameBoard.length - 1] = '+';
        gameBoard[gameBoard.length - 1][0] = '+';
        gameBoard[gameBoard.length - 1][gameBoard.length - 1] = '+';
    }

    private void printGameBoard() {
        for (char[] row : gameBoard) {
            System.out.println(row);
        }
    }

    private void endGame() {
        System.out.println("Game Over. Good Try! :D");
        System.out.println("Your score was: " + score);
    }

    public static void main(String[] args) {
        new Game().start();
    }
}
