package com.capgemini.Chees;

import java.util.ArrayList;
import java.util.List;

public class PossibleMoves {
	private static List<Move> whitePossibleMoves = new ArrayList<Move>();
	private static List<Move> blackPossibleMoves = new ArrayList<Move>();
	public static List<Move> createList(Board board){
		for(int i=0;i<8;i++){
			for(int j=0;j<8;j++){
				if(!board.getChessmanXY(i, j).toString().equals("Empty")){
					Field from = new Field(i,j);
					takeChessmannMoves(board, board.getChessmanXY(i, j), from);
				}
			}
		}
		return whitePossibleMoves;
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
	private static void takeChessmannMoves(Board board, Chessman chessman, Field from){
		switch (chessman.toString()) {
		/*case ("com.capgemini.Chees.Pawn WHITE"):
			try {
				return checkWhitePawnMove(from, to);
			} catch (IllegalStateException e) {
				break;
			}
		case ("com.capgemini.Chees.Pawn BLACK"):
			try {
				return checkBlackPawnMove(from, to);
			} catch (IllegalStateException e) {
				break;
			}
		case ("com.capgemini.Chees.King BLACK"):
			try {
				return checkKingMove(from, to);
			} catch (IllegalStateException e) {
				break;
			}*/
		case ("com.capgemini.Chees.King WHITE"):
				whitePossibleMoves.addAll(KingMoves.getPossibleMoves(from));
				for (int i=0;i<whitePossibleMoves.size();i++){
					if(!ChessmanWalidator.checkTheWay(board, whitePossibleMoves.get(i).getFrom(), whitePossibleMoves.get(i).getTo(), "WHITE")){
						whitePossibleMoves.remove(i);
						i--;
					}
				}
				break;
			/*
		case ("com.capgemini.Chees.Bishop WHITE"):
			try {
				return checkBishopMove(from, to);
			} catch (IllegalStateException e) {
				break;
			}
		case ("com.capgemini.Chees.Bishop BLACK"):
			try {
				return checkBishopMove(from, to);
			} catch (IllegalStateException e) {
				break;
			}
		case ("com.capgemini.Chees.Rock BLACK"):
			try {
				return checkRockMove(from, to);
			} catch (IllegalStateException e) {
				break;
			}
		case ("com.capgemini.Chees.Rock WHITE"):
			try {
				return checkRockMove(from, to);
			} catch (IllegalStateException e) {
				break;
			}
		case ("com.capgemini.Chees.Queen WHITE"):
			try {
				return checkQueenMove(from, to);
			} catch (IllegalStateException e) {
				break;
			}
		case ("com.capgemini.Chees.Queen BLACK"):
			try {
				return checkQueenMove(from, to);
			} catch (IllegalStateException e) {
				break;
			}
		case ("com.capgemini.Chees.Knight BLACK"):
			try {
				return checkKnightMove(from, to);
			} catch (IllegalStateException e) {
				break;
			}
		case ("com.capgemini.Chees.Knight WHITE"):
			try {
				return checkKnightMove(from, to);
			} catch (IllegalStateException e) {
				break;
			}*/
		}
	}
	
}
