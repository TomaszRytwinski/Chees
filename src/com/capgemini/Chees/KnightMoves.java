package com.capgemini.Chees;

import java.util.ArrayList;
import java.util.List;

public class KnightMoves {
	public static List<Move> getPossibleMoves(Field from) {
		int toX, toY;
		List<Move> possibleMoves = new ArrayList<Move>();
		for (int i = -2; i <= 2; i++) {
			for (int j = -2; j <= 2; j++) {
				if (Board.checkOutOfBoard(from, i, j) && !(i == 0 && j == 0)) {
					toX = j + from.getX();
					toY = i + from.getY();
					if ((Math.abs(from.getX() - toX) == 2) && (Math.abs(from.getY() - toY) == 1)) {
						possibleMoves.add(new Move(from, new Field(toY, toX)));
					} else if ((Math.abs(from.getY() - toY) == 2) && (Math.abs(from.getX() - toX) == 1)) {
						possibleMoves.add(new Move(from, new Field(toY, toX)));
					}
				}
			}
		}
		return possibleMoves;
	}

	public static boolean checkTheWayKnight(Board board, Field to, String color) {
		boolean allow = true;
		int x = to.getX();
		int y = to.getY();
		if (board.isBoardXYempty(y, x)) {
			return allow;
		} else if (board.getChessmanXY(to.getY(), to.getX()).getColor().equals(color)) {
			return false;
		} else {
			return true;
		}

	}
	public static boolean checkKnightMove(Field from, Field to) throws IllegalStateException {
		if (from.getX() == to.getX() && from.getY() == to.getY()) {
			throw new IllegalStateException();
		} else if ((Math.abs(from.getX() - to.getX()) == 2) && (Math.abs(from.getY() - to.getY()) == 1)) {
			return true;
		} else if ((Math.abs(from.getY() - to.getY()) == 2) && (Math.abs(from.getX() - to.getX()) == 1)) {
			return true;
		}
		return false;
	}

}
