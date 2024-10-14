class Apple {
    private int posX;
    private int posY;
    private final int boardLength;

    public Apple(int boardLength, Snake snake) {
        this.boardLength = boardLength;
        reposition(snake);
    }

    public void reposition(Snake snake) {
        do {
            posX = (int) (Math.random() * (boardLength)) + 1;
            posY = (int) (Math.random() * (boardLength)) + 1;
        } while (snakeCollision(snake));
    }

    public void draw(char[][] board) {
        board[posY][posX] = 'x';
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    private boolean snakeCollision(Snake snake) {
        for (Integer[] pos : snake.getBody()) {
            if (pos[0] == posY && pos[1] == posX) {
                return true;
            }
        }
        return false;
    }
}