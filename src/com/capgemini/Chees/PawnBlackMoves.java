package com.capgemini.Chees;

import java.util.ArrayList;
import java.util.List;

public class PawnBlackMoves {
	public static List<Move> getPossibleMoves(Field from) {
		int toX, toY;
		List<Move> possibleMoves = new ArrayList<Move>();
		for (int i = -1; i >= -2; i--) {
			
			if ((i + from.getY()) > 0) {
				toX = from.getX();
				toY = i + from.getY();
				if (toY - from.getY() == -1) {
					possibleMoves.add(new Move(from, new Field(toY, toX)));
					System.out.println(i + from.getY());
				} else if (toY - from.getY() == 2) {
					if (toY >= 4) {
						possibleMoves.add(new Move(from, new Field(toY, toX)));
					}
				}
			}
		}
		if (from.getX() < 7 && from.getY() > 0) {
			possibleMoves.add(new Move(from, new Field(from.getY() - 1, from.getX() + 1)));
		}
		if (from.getX() > 0 && from.getY() > 0) {
			possibleMoves.add(new Move(from, new Field(from.getY() - 1, from.getX() - 1)));
		}
		return possibleMoves;
	}
}