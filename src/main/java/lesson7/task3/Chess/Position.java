package lesson7.task3.Chess;

public class Position {
    private char horizontal;
    private int vertical;

    public Position(String position) {
        this.horizontal = position.split("")[0].toCharArray()[0];
        this.vertical = Integer.parseInt(position.split("")[1]);
    }

    public int getVertical() {
        return vertical;
    }

    public char getHorizontal() {
        return horizontal;
    }

    public String getPosition() {
        String letterHorizontal = String.valueOf(horizontal);
        return letterHorizontal + vertical;
    }
}
