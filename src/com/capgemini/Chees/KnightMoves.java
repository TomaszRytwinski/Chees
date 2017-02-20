package com.capgemini.Chees;

import java.util.ArrayList;
import java.util.List;

public class KnightMoves {
	public static List<Move> getPossibleMoves(Field from) {
		int toX,toY;
		List<Move> possibleMoves = new ArrayList<Move>();
		for (int i=-2;i<=2;i++){
			for(int j=-2;j<=2;j++){
				if(Board.checkOutOfBoard(from, i, j) && !(i==0 && j==0) ) {
					toX=j+from.getX();
					toY=i+from.getY();
					if ((Math.abs(from.getX() - toX) == 2) && (Math.abs(from.getY() - toY) == 1)) {
						possibleMoves.add(new Move(from, new Field(toY,toX)));
					} else if ((Math.abs(from.getY() - toY) == 2) && (Math.abs(from.getX() - toX) == 1)) {
						possibleMoves.add(new Move(from, new Field(toY,toX)));
					}
				}
			}
		}
		return possibleMoves;
	}

}
