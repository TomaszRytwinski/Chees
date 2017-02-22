package com.capgemini.Chees;
/**
 * Class ChessmanWalidator triggers proper method during check of movements
 */
public class ChessmanWalidator {
	/**
	 * The method triggers method of given chessman. The method starts method that check moves geometry and the way.
	 */
	public static boolean checkMove(Board board, Field from, Field to) {
		Chessman chessman = board.getChessmanXY(from.getY(), from.getX());
		switch (chessman.toString()) {
		case ("com.capgemini.Chees.Pawn WHITE"):
			try {
				return (PawnWhiteMoves.checkWhitePawnMove(from, to) && PawnWhiteMoves.checkTheWayPawnWhite(board, from, to));
			} catch (IllegalStateException e) {
				return false;
			}
		case ("com.capgemini.Chees.Pawn BLACK"):
			try {
				return (PawnBlackMoves.checkBlackPawnMove(from, to) && PawnBlackMoves.checkTheWayPawnBlack(board, from, to) );
			} catch (IllegalStateException e) {
				return false;
			}
		case ("com.capgemini.Chees.King BLACK"):
			try {
				return (KingMoves.checkKingMove(from, to) && checkTheWay(board, from, to, "BLACK"));
			} catch (IllegalStateException e) {
				return false;
			}
		case ("com.capgemini.Chees.King WHITE"):
			try {
				return (KingMoves.checkKingMove(from, to) && checkTheWay(board, from, to, "WHITE"));
			} catch (IllegalStateException e) {
				return false;
			}
		case ("com.capgemini.Chees.Bishop WHITE"):
			try {
				return (BishopMoves.checkBishopMove(from, to) && checkTheWay(board, from, to, "WHITE"));
			} catch (IllegalStateException e) {
				return false;
			}
		case ("com.capgemini.Chees.Bishop BLACK"):
			try {
				return (BishopMoves.checkBishopMove(from, to) && checkTheWay(board, from, to, "BLACK"));
			} catch (IllegalStateException e) {
				return false;
			}
		case ("com.capgemini.Chees.Rock BLACK"):
			try {
				return (RockMoves.checkRockMove(from, to) && checkTheWay(board, from, to, "BLACK"));
			} catch (IllegalStateException e) {
				return false;
			}
		case ("com.capgemini.Chees.Rock WHITE"):
			try {
				return (RockMoves.checkRockMove(from, to) && checkTheWay(board, from, to, "WHITE"));
			} catch (IllegalStateException e) {
				return false;
			}
		case ("com.capgemini.Chees.Queen WHITE"):
			try {
				return (QueenMoves.checkQueenMove(from, to) && checkTheWay(board, from, to, "WHITE"));
			} catch (IllegalStateException e) {
				return false;
			}
		case ("com.capgemini.Chees.Queen BLACK"):
			try {
				return (QueenMoves.checkQueenMove(from, to) && checkTheWay(board, from, to, "BLACK"));
			} catch (IllegalStateException e) {
				return false;
			}
		case ("com.capgemini.Chees.Knight BLACK"):
			try {
				return (KnightMoves.checkKnightMove(from, to) && KnightMoves.checkTheWayKnight(board, to, "BLACK"));
			} catch (IllegalStateException e) {
				return false;
			}
		case ("com.capgemini.Chees.Knight WHITE"):
			try {
				return (KnightMoves.checkKnightMove(from, to) && KnightMoves.checkTheWayKnight(board, to, "WHITE"));
			} catch (IllegalStateException e) {
				return false;
			}
		}
		return false;
	}
	
	/**
	 * The method that checks the way of move for common chessman.
	 */
	public static boolean checkTheWay(Board board, Field from, Field to, String color) {
		boolean free = true;
		int i, j;
		if (from.getX() == to.getX() && from.getY() == to.getY()) {
			throw new IllegalStateException();
		}
		j = from.getX();
		i = from.getY();
		do {
			if (!((from.getX() == j && from.getY() == i) || (to.getX() == j && to.getY() == i))) {
				if (board.getChessmanXY(i, j).toString() != "Empty") {
					free = false;
				}
			}
			i = counter(i, to.getY());
			j = counter(j, to.getX());

		} while (!((j == to.getX() && to.getY() == i)));
		if (!board.isBoardXYempty(to.getY(), to.getX())) {
			if (board.getChessmanXY(to.getY(), to.getX()).getColor().equals(color)) {
				free = false;
			}
		}
		return free;
	}

	private static int counter(int i, int condition) {
		if (i < condition) {
			i++;
		} else if (i > condition) {
			i--;
		}
		return i;
	}











	
	
}
