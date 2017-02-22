package com.capgemini.Chees;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PossibleMovesTest {
	Board board;
	ChessmanWalidator walidator;
	Field from,to;
	PossibleMoves possibleMoves;
	@Before
	public void setup(){
		board = new Board();
		walidator = new ChessmanWalidator();
		board.setBeginingState();
		possibleMoves = new PossibleMoves();
	}
	@Test
	public void ShouldReturnListOfPossibleMovesWhite() {
		
		possibleMoves.createList(board);
		Assert.assertEquals(20,possibleMoves.getWhiteList().size());
	}
	@Test
	public void ShouldReturnListOfPossibleMovesBlack() {
		possibleMoves.createList(board);
		Assert.assertEquals(20,possibleMoves.getBlackList().size());
	}

}
