package lesson7.task3.Figures;

import lesson7.task3.Chess.Player;
import lesson7.task3.Chess.Position;

import java.util.Set;

public class ChessFigure {
    protected String figureType = "Шахматная фигура";
    protected Player player;
    protected Position position;

    public String getFigureType() {
        return figureType;
    }

    public ChessFigure(Player player, String position) {
        this.player = player;
        this.position = new Position(position);
    }

    public Set<Position> getAvailableMoves() {
        throw new IllegalStateException("Для данного типа определить возможные ходы невозможно");
    }

    public String getPosition() {
        return position.getPosition();
    }

}
