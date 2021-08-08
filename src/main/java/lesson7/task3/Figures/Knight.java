package lesson7.task3.Figures;

import lesson7.task3.Chess.Chess;
import lesson7.task3.Chess.Player;
import lesson7.task3.Chess.Position;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Knight extends ChessFigure {
    public Knight(Player player, String position) {
        super(player, position);
        figureType = "Конь";
    }

    @Override
    public Set<Position> getAvailableMoves() {
        Set<Position> availableMoves = new HashSet<>();
        Iterator<Position> iterator = Chess.allField().iterator();
        while (iterator.hasNext()) {
            Position candidate = iterator.next();
            int dx = Math.abs(candidate.getHorizontal() - position.getHorizontal());
            int dy = Math.abs(candidate.getVertical() - position.getVertical());
            if ((dx == 2 && dy == 1) || (dx == 1 && dy == 2)) availableMoves.add(candidate);
        }
        return availableMoves;
    }
}
