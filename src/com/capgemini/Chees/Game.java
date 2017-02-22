package com.capgemini.Chees;

/**
 * Class Game has 2 methods for moving the chessman
 */
public class Game {
	/**
	 * The method checks and if possible moves the white chessman
	 */
	public static boolean checkAndMoveWhite(Board board, Field from, Field to) {
		PossibleMoves possibleMoves = new PossibleMoves();
		if (ChessmanWalidator.checkMove(board, from, to)) {
			board.MoveChessmanFromTo(from, to);
			possibleMoves.createList(board);
			if (!CheckWalidator.checkChecktoWhiteKing(board, possibleMoves.getBlackList())) {
				return true;
			} else {
				board.MoveChessmanFromTo(to, from);
				return false;
			}
		} else {
			return false;
		}
	}

	/**
	 * The method checks and if possible moves the black chessman
	 */
	public static boolean checkAndMoveBlack(Board board, Field from, Field to) {
		PossibleMoves possibleMoves = new PossibleMoves();
		if (ChessmanWalidator.checkMove(board, from, to)) {
			board.MoveChessmanFromTo(from, to);
			possibleMoves.createList(board);
			if (!CheckWalidator.checkChecktoBlackKing(board, possibleMoves.getWhiteList())) {
				return true;
			} else {
				board.MoveChessmanFromTo(to, from);
				return false;
			}
		} else {
			return false;
		}
	}
}
