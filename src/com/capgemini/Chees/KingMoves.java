package com.capgemini.Chees;

import java.util.ArrayList;
import java.util.List;

public class KingMoves {
	public static List<Move> getPossibleMoves(Field from) {
		int toX, toY;
		List<Move> possibleMoves = new ArrayList<Move>();
		for (int i = -1; i <= +1; i++) {
			for (int j = -1; j <= +1; j++) {
				if (Board.checkOutOfBoard(from, i, j) && !(i == 0 && j == 0)) {
					toX = j + from.getX();
					toY = i + from.getY();
					possibleMoves.add(new Move(from, new Field(toY, toX)));
				}
			}
		}
		return possibleMoves;
	}

	public static boolean checkKingMove(Field from, Field to) throws IllegalStateException {
		if (from.getX() == to.getX() && from.getY() == to.getY()) {
			throw new IllegalStateException();
		}
		if ((Math.abs(from.getX() - to.getX()) <= 1) && (Math.abs(from.getX() - to.getX()) >= 0)
				&& (Math.abs(from.getY() - to.getY()) <= 1) && (Math.abs(from.getY() - to.getY()) >= 0)) {
			return true;
		}
		return false;
	}
}
