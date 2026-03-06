public class Interface {
    public static void main(String[] args){
        Queen q = new Queen();
        q.move();
    }
}

interface ChessPlayer {
    void move();
}

class Queen implements ChessPlayer {
    public void move() {
        System.out.println("right, left, down, up and diagonally (move 4 directional)");
    }
}

class King implements ChessPlayer {
    public void move() {
        System.out.println("right, left, down, up (only one step)");
    }
}

class Elephant implements ChessPlayer {
    public void move() {
        System.out.println("Move two steps up or down and one step left or right");
    }
}