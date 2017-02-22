package com.capgemini.Chees;

import java.util.ArrayList;
import java.util.List;
/**
 * Class RockMoves
 * The class has rules of moves of rock 
 */
public class RockMoves {
	/**
	 * Static method that returns list of geometric possible moves from Field 
	 */
	public static List<Move> getPossibleMoves(Field from) {
		int toX, toY;
		List<Move> possibleMoves = new ArrayList<Move>();
		for (int i = -7; i <= 7; i++) {
			for (int j = -7; j <= 7; j++) {
				if (Board.checkOutOfBoard(from, i, j) && !(i == 0 && j == 0)) {
					toX = j + from.getX();
					toY = i + from.getY();
					if (from.getX() == toX) {
						possibleMoves.add(new Move(from, new Field(toY, toX)));
					} else if (from.getY() == toY) {
						possibleMoves.add(new Move(from, new Field(toY, toX)));
					}
				}
			}
		}
		return possibleMoves;
	}
	/**
	 * Static method that returns true if move is possible from Field, to Field
	 */
	public static boolean checkRockMove(Field from, Field to) throws IllegalStateException {
		if (from.getX() == to.getX() && from.getY() == to.getY()) {
			throw new IllegalStateException();
		} else if (from.getX() == to.getX()) {
			return true;
		} else if (from.getY() == to.getY()) {
			return true;
		} else
			return false;
	}

}
