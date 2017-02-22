package com.capgemini.Chees;

import java.util.ArrayList;
import java.util.List;

public class BishopMoves {
	public static List<Move> getPossibleMoves(Field from) {
		int toX, toY;
		List<Move> possibleMoves = new ArrayList<Move>();
		for (int i = -7; i <= 7; i++) {
			for (int j = -7; j <= +7; j++) {
				if (Board.checkOutOfBoard(from, i, j) && !(i == 0 && j == 0)) {
					toX = j + from.getX();
					toY = i + from.getY();
					if (Math.abs(from.getX() - toX) == Math.abs(from.getY() - toY)) {
						possibleMoves.add(new Move(from, new Field(toY, toX)));
					} 
				}
			}
		}
		return possibleMoves;
	}
	public static boolean checkBishopMove(Field from, Field to) throws IllegalStateException {
		if (from.getX() == to.getX() && from.getY() == to.getY()) {
			throw new IllegalStateException();
		}
		if (Math.abs(from.getX() - to.getX()) == Math.abs(from.getY() - to.getY())) {
			return true;
		}
		return false;
	}
}
