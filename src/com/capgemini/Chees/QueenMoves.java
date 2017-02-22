package com.capgemini.Chees;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/**
 * Class QueenMoves
 * The class has rules of moves of queen 
 */
public class QueenMoves {
	/**
	 * Static method that returns list of geometric possible moves from Field 
	 */
	public static List<Move> getPossibleMoves(Field from) {
		Set<Move> possibleMovesSet = new HashSet<Move>();
		List<Move> possibleMoves = new ArrayList<Move>();
		possibleMovesSet.addAll(BishopMoves.getPossibleMoves(from));
		possibleMovesSet.addAll(RockMoves.getPossibleMoves(from));
		possibleMoves.addAll(possibleMovesSet);
		return possibleMoves;
	}
	/**
	 * Static method that returns true if move is possible from Field, to Field
	 */
	public static boolean checkQueenMove(Field from, Field to) throws IllegalStateException {
		if (RockMoves.checkRockMove(from, to))
			return true;
		if (BishopMoves.checkBishopMove(from, to))
			return true;
		return false;
	}
}
