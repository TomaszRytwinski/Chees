package com.capgemini.Chees;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GameTest {
	Board board;
	ChessmanWalidator walidator;
	Field from,to;
	PossibleMoves possibleMoves;
	@Before
	public void setup(){
		board = new Board();
		walidator = new ChessmanWalidator();
		possibleMoves = new PossibleMoves();
		board.setBeginingState();
	}
	
	@Test
	public void shouldReturnTrueFor11to21() {
		from = new Field(1,1);
		to = new Field(2,1);
		Assert.assertTrue(Game.checkAndMoveWhite(board, from, to));
	}

	@Test
	public void shouldReturnTrueFor61to51() {
		from = new Field(1,1);
		to = new Field(2,1);
		Game.checkAndMoveWhite(board, from, to);
		from = new Field(6,1);
		to = new Field(5,1);
		Assert.assertTrue(Game.checkAndMoveBlack(board, from, to));
	}
	
	@Test
	public void shouldReturnFalseFor00to50() {
		from = new Field(0,0);
		to = new Field(5,0);
		Assert.assertFalse(Game.checkAndMoveWhite(board, from, to));
	}
	
	@Test
	public void shouldReturnFalseFor02to50() {
		from = new Field(0,2);
		to = new Field(5,0);
		Assert.assertFalse(Game.checkAndMoveWhite(board, from, to));
	}
	@Test
	public void shouldReturnFalseFor63to43WhenCheck() {
		from = new Field(1,4);
		to = new Field(2,4);
		Game.checkAndMoveWhite(board, from, to);
		from = new Field(6,4);
		to = new Field(5,4);
		Game.checkAndMoveBlack(board, from, to);
		from = new Field(0,5);
		to = new Field(4,1);
		Game.checkAndMoveWhite(board, from, to);
		from = new Field(6,3);
		to = new Field(4,3);
		Assert.assertFalse(Game.checkAndMoveBlack(board, from, to));
	}
	@Test
	public void shouldReturnFalseFor10to20WhenCheck() {
		from = new Field(7,1);
		to = new Field(5,2);
		Game.checkAndMoveBlack(board, from, to);
		from = new Field(5,2);
		to = new Field(3,3);
		Game.checkAndMoveBlack(board, from, to);
		from = new Field(3,3);
		to = new Field(2,5);
		Game.checkAndMoveBlack(board, from, to);
		from = new Field(1,0);
		to = new Field(2,0);
		Assert.assertFalse(Game.checkAndMoveWhite(board, from, to));
	}
}
