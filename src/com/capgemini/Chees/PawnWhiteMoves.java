package com.capgemini.Chees;

import java.util.ArrayList;
import java.util.List;

public class PawnWhiteMoves {
	public static List<Move> getPossibleMoves(Field from) {
		int toX, toY;
		List<Move> possibleMoves = new ArrayList<Move>();
		for (int i = 1; i <= 2; i++) {
			if ((i + from.getY()) < 7) {
				toX = from.getX();
				toY = i + from.getY();
				if (toY - from.getY() == 1) {
					possibleMoves.add(new Move(from, new Field(toY, toX)));
				} else if (toY - from.getY() == 2) {
					if (toY <= 3) {
						possibleMoves.add(new Move(from, new Field(toY, toX)));
					}
				}
			}
		}
		if (from.getX() < 7 && from.getY() < 7) {
			possibleMoves.add(new Move(from, new Field(from.getY() + 1, from.getX() + 1)));
		}
		if (from.getX() > 0 && from.getY() < 7) {
			possibleMoves.add(new Move(from, new Field(from.getY() + 1, from.getX() - 1)));
		}
		return possibleMoves;
	}

	public static boolean checkTheWayPawnWhite(Board board, Field from, Field to) {
		boolean free = true;
		if (from.getX() == to.getX() && from.getY() == to.getY()) {
			throw new IllegalStateException();
		}
		if (from.getX() == to.getX() - 1 || from.getX() == to.getX() + 1) {
			if (board.isBoardXYempty(to.getY(), to.getX())) {
				free = false;
			} else if (board.getChessmanXY(to.getY(), to.getX()).getColor().equals("WHITE")) {
				free = false;
			}
		} else if (from.getX() == to.getX()) {
			if (from.getY() == to.getY() - 1 && !board.isBoardXYempty(to.getY(), to.getX())) {
				free = false;
			} else if ((from.getY() == to.getY() - 2) && (!board.isBoardXYempty(to.getY(), to.getX())
					|| (!board.isBoardXYempty(to.getY() - 1, to.getX())))) {
				free = false;
			}
		}
		return free;
	}

	public static boolean checkWhitePawnMove(Field from, Field to) throws IllegalStateException {
		if (from.getX() == to.getX()) {
			if ((to.getY() - from.getY() <= 2) && (to.getY() - from.getY() > 0)) {
				if (to.getY() - from.getY() == 1) {
					return true;
				} else if (to.getY() - from.getY() == 2) {
					if (to.getY() <= 3) {
						return true;
					} else {
						throw new IllegalStateException("Z tego polozenie nie mozna przesunac sie o 2");
					}
				}
			} else {
				throw new IllegalStateException("Nie prawidlowa dlugosc ruchu");
			}
		} else if (Math.abs(from.getX() - to.getX()) == 1 && (to.getY() - from.getY() == 1)) {
			return true;
		} else {
			throw new IllegalStateException("Nie mozna poruszac sie pionkiem w X");
		}
		return false;
	}

}
