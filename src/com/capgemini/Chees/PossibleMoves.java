package com.capgemini.Chees;

import java.util.ArrayList;
import java.util.List;

/**
 * Class PossibleMoves used for creating list of possible moves
 */
public class PossibleMoves {
	private List<Move> whitePossibleMoves = new ArrayList<Move>();
	private List<Move> blackPossibleMoves = new ArrayList<Move>();

	/**
	 * The method creates list of possible moves
	 */
	public void createList(Board board) {
		whitePossibleMoves.clear();
		blackPossibleMoves.clear();
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if (!board.getChessmanXY(i, j).toString().equals("Empty")) {
					Field from = new Field(i, j);
					takeChessmannMoves(board, board.getChessmanXY(i, j), from);
				}
			}
		}
	}

	public List<Move> getWhiteList() {
		return whitePossibleMoves;
	}

	public List<Move> getBlackList() {
		return blackPossibleMoves;
	}

	public List<Move> getBlackPossibleMoves() {
		return blackPossibleMoves;
	}

	public void setBlackPossibleMoves(List<Move> blackPossibleMoves) {
		this.blackPossibleMoves = blackPossibleMoves;
	}

	public List<Move> getWhitePossibleMoves() {
		return whitePossibleMoves;
	}

	public void setWhitePossibleMoves(List<Move> whitePossibleMoves) {
		this.whitePossibleMoves = whitePossibleMoves;
	}

	/**
	 * The method creates list of possible moves of given chessman
	 */
	private void takeChessmannMoves(Board board, Chessman chessman, Field from) {
		List<Move> tempPossible = new ArrayList<Move>();
		switch (chessman.toString()) {
		case ("com.capgemini.Chees.Pawn WHITE"):
			tempPossible.clear();
			tempPossible.addAll(PawnWhiteMoves.getPossibleMoves(from));
			for (int i = 0; i < tempPossible.size(); i++) {
				if (!PawnWhiteMoves.checkTheWayPawnWhite(board, tempPossible.get(i).getFrom(),
						tempPossible.get(i).getTo())) {
					tempPossible.remove(i);
					i--;
				}
			}
			whitePossibleMoves.addAll(tempPossible);
			break;
		case ("com.capgemini.Chees.Pawn BLACK"):
			tempPossible.clear();
			tempPossible.addAll(PawnBlackMoves.getPossibleMoves(from));
			for (int i = 0; i < tempPossible.size(); i++) {
				if (!PawnBlackMoves.checkTheWayPawnBlack(board, tempPossible.get(i).getFrom(),
						tempPossible.get(i).getTo())) {
					tempPossible.remove(i);
					i--;
				}
			}
			blackPossibleMoves.addAll(tempPossible);
			break;
		case ("com.capgemini.Chees.King WHITE"):
			tempPossible.clear();
			tempPossible.addAll(KingMoves.getPossibleMoves(from));
			for (int i = 0; i < tempPossible.size(); i++) {
				if (!ChessmanWalidator.checkTheWay(board, tempPossible.get(i).getFrom(), tempPossible.get(i).getTo(),
						"WHITE")) {
					tempPossible.remove(i);
					i--;
				}
			}
			whitePossibleMoves.addAll(tempPossible);
			break;
		case ("com.capgemini.Chees.King BLACK"):
			tempPossible.clear();
			tempPossible.addAll(KingMoves.getPossibleMoves(from));
			for (int i = 0; i < tempPossible.size(); i++) {
				if (!ChessmanWalidator.checkTheWay(board, tempPossible.get(i).getFrom(), tempPossible.get(i).getTo(),
						"BLACK")) {
					tempPossible.remove(i);
					i--;
				}
			}
			blackPossibleMoves.addAll(tempPossible);
			break;
		case ("com.capgemini.Chees.Bishop WHITE"):
			tempPossible.clear();
			tempPossible.addAll(BishopMoves.getPossibleMoves(from));
			for (int i = 0; i < tempPossible.size(); i++) {
				if (!ChessmanWalidator.checkTheWay(board, tempPossible.get(i).getFrom(), tempPossible.get(i).getTo(),
						"WHITE")) {
					tempPossible.remove(i);
					i--;
				}
			}
			whitePossibleMoves.addAll(tempPossible);
			break;
		case ("com.capgemini.Chees.Bishop BLACK"):
			tempPossible.clear();
			tempPossible.addAll(BishopMoves.getPossibleMoves(from));
			for (int i = 0; i < tempPossible.size(); i++) {
				if (!ChessmanWalidator.checkTheWay(board, tempPossible.get(i).getFrom(), tempPossible.get(i).getTo(),
						"BLACK")) {
					tempPossible.remove(i);
					i--;
				}
			}
			blackPossibleMoves.addAll(tempPossible);
			break;
		case ("com.capgemini.Chees.Knight WHITE"):
			tempPossible.clear();
			tempPossible.addAll(KnightMoves.getPossibleMoves(from));
			for (int i = 0; i < tempPossible.size(); i++) {
				if (!KnightMoves.checkTheWayKnight(board, tempPossible.get(i).getTo(), "WHITE")) {
					tempPossible.remove(i);
					i--;
				}
			}
			whitePossibleMoves.addAll(tempPossible);
			break;
		case ("com.capgemini.Chees.Knight BLACK"):
			tempPossible.clear();
			tempPossible.addAll(KnightMoves.getPossibleMoves(from));
			for (int i = 0; i < tempPossible.size(); i++) {
				if (!KnightMoves.checkTheWayKnight(board, tempPossible.get(i).getTo(), "BLACK")) {
					tempPossible.remove(i);
					i--;
				}
			}
			blackPossibleMoves.addAll(tempPossible);
			break;
		case ("com.capgemini.Chees.Queen WHITE"):
			tempPossible.clear();
			tempPossible.addAll(QueenMoves.getPossibleMoves(from));
			for (int i = 0; i < tempPossible.size(); i++) {
				if (!ChessmanWalidator.checkTheWay(board, tempPossible.get(i).getFrom(), tempPossible.get(i).getTo(),
						"WHITE")) {
					tempPossible.remove(i);
					i--;
				}
			}
			whitePossibleMoves.addAll(tempPossible);
			break;
		case ("com.capgemini.Chees.Queen BLACK"):
			tempPossible.clear();
			tempPossible.addAll(QueenMoves.getPossibleMoves(from));
			for (int i = 0; i < tempPossible.size(); i++) {
				if (!ChessmanWalidator.checkTheWay(board, tempPossible.get(i).getFrom(), tempPossible.get(i).getTo(),
						"BLACK")) {
					tempPossible.remove(i);
					i--;
				}
			}
			blackPossibleMoves.addAll(tempPossible);
			break;
		case ("com.capgemini.Chees.Rock WHITE"):
			tempPossible.clear();
			tempPossible.addAll(RockMoves.getPossibleMoves(from));
			for (int i = 0; i < tempPossible.size(); i++) {
				if (!ChessmanWalidator.checkTheWay(board, tempPossible.get(i).getFrom(), tempPossible.get(i).getTo(),
						"WHITE")) {
					tempPossible.remove(i);
					i--;
				}
			}
			whitePossibleMoves.addAll(tempPossible);
			break;
		case ("com.capgemini.Chees.Rock BLACK"):
			tempPossible.clear();
			tempPossible.addAll(RockMoves.getPossibleMoves(from));
			for (int i = 0; i < tempPossible.size(); i++) {
				if (!ChessmanWalidator.checkTheWay(board, tempPossible.get(i).getFrom(), tempPossible.get(i).getTo(),
						"BLACK")) {
					tempPossible.remove(i);
					i--;
				}
			}
			blackPossibleMoves.addAll(tempPossible);
			break;
		}

	}

}
