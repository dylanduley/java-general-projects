import java.util.ArrayList;

class Snake {
    private final ArrayList<Integer[]> body;
    private int vertical;
    private int horizontal;
    private final int boardLength;

    public Snake(int boardLength) {
        this.body = new ArrayList<>();
        this.vertical = boardLength / 2 + 1;
        this.horizontal = boardLength / 2 + 1;
        this.body.add(new Integer[]{vertical, horizontal}); // Initialize snake's starting position
        this.boardLength = boardLength;
    }

    public boolean move(String direction) {
        int newVertical = vertical;
        int newHorizontal = horizontal;

        switch (direction) {
            case "w" -> newVertical--;
            case "s" -> newVertical++;
            case "a" -> newHorizontal--;
            case "d" -> newHorizontal++;
            case "e" -> {
                return false;
            }
            default -> {
                System.out.println("Invalid input. Use w/a/s/d to move or e to exit.");
                return true;
            }
        }

        if (outOfBounds(newVertical, newHorizontal)) {
            return false;
        }

        vertical = newVertical;
        horizontal = newHorizontal;
        return true;
    }

    public void grow() {
        body.add(new Integer[]{vertical, horizontal});
    }

    public void moveTail() {
        if (body.size() > 0) {
            body.remove(0);
        }
        body.add(new Integer[]{vertical, horizontal});
    }

    public boolean checkCollisionWith(Apple apple) {
        return horizontal == apple.getPosX() && vertical == apple.getPosY();
    }

    public ArrayList<Integer[]> getBody() {
        return body;
    }

    public void draw(char[][] board) {
        for (Integer[] pos : body) {
            board[pos[0]][pos[1]] = 'o';
        }
    }

    private boolean outOfBounds(int newVertical, int newHorizontal) {
        return newHorizontal <= 0 || newHorizontal >= boardLength + 1 || newVertical <= 0 || newVertical >= boardLength + 1;
    }
}