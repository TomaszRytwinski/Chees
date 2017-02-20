package com.capgemini.Chees;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class QueenMoves {
	public static List<Move> getPossibleMoves(Field from) {
		Set <Move> possibleMovesSet = new HashSet<Move>();
		List<Move> possibleMoves = new ArrayList<Move>();
		possibleMovesSet.addAll(BishopMoves.getPossibleMoves(from));
		possibleMovesSet.addAll(RockMoves.getPossibleMoves(from));
		possibleMoves.addAll(possibleMovesSet);
		return possibleMoves;
	}

}
