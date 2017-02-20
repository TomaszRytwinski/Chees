package com.capgemini.Chees;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PossibleMovesTest {
	Board board;
	ChessmanWalidator walidator;
	Field from,to;

	@Test
	public void test() {
		board = new Board();
		walidator = new ChessmanWalidator();
		board.setBeginingState();
		Assert.assertEquals(0,PossibleMoves.createList(board).size());
	}

}
