package com.capgemini.Chees;

import java.util.List;

public class CheckWalidator {
	public static boolean checkChecktoWhiteKing(Board board, List<Move> blackPossibleMoves){
		Field kingsPos = new Field(-1,-1);
		boolean found=false;
		int i=0;
		int j=0;
		do {
			if(board.getChessmanXY(i, j).toString().equals("com.capgemini.Chees.King WHITE")){
				kingsPos = new Field(i,j);
				found=true;
			}
			j++;
			if (j==7){
				j=0;
				i++;
			}
		}
		while(!found);
		for (i=0;i<blackPossibleMoves.size();i++){
			if (kingsPos.getX()==blackPossibleMoves.get(i).getTo().getX() && kingsPos.getY()==blackPossibleMoves.get(i).getTo().getY()){
				return true;
			}
		}
		return false;
	}
	public static boolean checkChecktoBlackKing(Board board, List<Move> whitePossibleMoves){
		Field kingsPos = new Field(-1,-1);
		boolean found=false;
		int i=0;
		int j=0;
		do {
			if(board.getChessmanXY(i, j).toString().equals("com.capgemini.Chees.King BLACK")){
				kingsPos = new Field(i,j);
				found=true;
			}
			j++;
			if (j==7){
				j=0;
				i++;
			}
		}
		while(!found);
		
		for (i=0;i<whitePossibleMoves.size();i++){
			if (kingsPos.getX()==whitePossibleMoves.get(i).getTo().getX() && kingsPos.getY()==whitePossibleMoves.get(i).getTo().getY()){
				return true;
			}
		}
		return false;
	}
}
