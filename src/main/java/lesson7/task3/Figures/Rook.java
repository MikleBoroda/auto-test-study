package lesson7.task3.Figures;

import lesson7.task3.Chess.Chess;
import lesson7.task3.Chess.Player;
import lesson7.task3.Chess.Position;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Rook extends ChessFigure {
    public Rook(Player player, String position) {
        super(player, position);
        figureType = "Ладья";
    }

    @Override
    public Set<Position> getAvailableMoves() {
        Set<Position> availableMoves = new HashSet<>();
        Iterator<Position> iterator = Chess.allField().iterator();
        while (iterator.hasNext()) {
            Position candidate = iterator.next();
            int dx = Math.abs(candidate.getHorizontal() - position.getHorizontal());
            int dy = Math.abs(candidate.getVertical() - position.getVertical());
            if (dx == 0 && dy == 0) {
                continue;
            }
            if (dx == 0 || dy == 0) {
                availableMoves.add(candidate);
            }
        }
        return availableMoves;
    }
}
