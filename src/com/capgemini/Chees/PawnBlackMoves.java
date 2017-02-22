package com.capgemini.Chees;

import java.util.ArrayList;
import java.util.List;

/**
 * Class PawnBlackMoves The class has rules of moves of black pawn
 */
public class PawnBlackMoves {
	/**
	 * Static method that returns list of geometric possible moves from Field
	 */
	public static List<Move> getPossibleMoves(Field from) {
		int toX, toY;
		List<Move> possibleMoves = new ArrayList<Move>();
		toX = from.getX();
		toY = from.getY() - 1;
		if (toY < 7) {
			possibleMoves.add(new Move(from, new Field(toY, toX)));
		}
		toY = from.getY() - 2;
		if (toY >= 4) {
			possibleMoves.add(new Move(from, new Field(toY, toX)));
		}
		if (from.getX() < 7 && from.getY() > 0) {
			possibleMoves.add(new Move(from, new Field(from.getY() - 1, from.getX() + 1)));
		}
		if (from.getX() > 0 && from.getY() > 0) {
			possibleMoves.add(new Move(from, new Field(from.getY() - 1, from.getX() - 1)));
		}
		return possibleMoves;
	}

	/**
	 * Static method that returns true if there is no chessmen between Field
	 * from and to,
	 */
	public static boolean checkTheWayPawnBlack(Board board, Field from, Field to) {
		boolean free = true;
		if (from.getX() == to.getX() && from.getY() == to.getY()) {
			throw new IllegalStateException();
		}
		if (from.getX() == to.getX() - 1 || from.getX() == to.getX() + 1) {
			if (board.isBoardXYempty(to.getY(), to.getX())) {
				free = false;
			} else if (board.getChessmanXY(to.getY(), to.getX()).getColor().equals("BLACK")) {
				free = false;
			}
		} else if (from.getX() == to.getX()) {
			if (from.getY() == to.getY() + 1 && !board.isBoardXYempty(to.getY(), to.getX())) {
				free = false;
			} else if ((from.getY() == to.getY() + 2) && (!board.isBoardXYempty(to.getY(), to.getX())
					|| (!board.isBoardXYempty(to.getY() + 1, to.getX())))) {
				free = false;
			}
		}
		return free;
	}

	/**
	 * Static method that returns true if move is possible from Field, to Field
	 */
	public static boolean checkBlackPawnMove(Field from, Field to) throws IllegalStateException {
		if (from.getX() == to.getX()) {
			if ((from.getY() - to.getY() <= 2) && (from.getY() - to.getY() > 0)) {
				if (from.getY() - to.getY() == 1) {
					return true;
				} else if (from.getY() - to.getY() == 2) {
					if (to.getY() >= 4) {
						return true;
					} else {
						throw new IllegalStateException("Z tego polozenie nie mozna przesunac sie o 2");
					}
				}
			} else if (Math.abs(from.getX() - to.getX()) == 1 && (from.getY() - to.getY() == 1)) {
				return true;
			} else {
				throw new IllegalStateException("Nie prawidlowa dlugosc ruchu");
			}
		} else {
			throw new IllegalStateException("Nie mozna poruszac sie pionkiem w X");
		}
		return false;
	}
}
