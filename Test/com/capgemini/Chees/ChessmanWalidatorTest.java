package com.capgemini.Chees;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class ChessmanWalidatorTest {
	Board board;
	ChessmanWalidator walidator;
	Field from,to;
	@Before
	public void setup(){
		board = new Board();
		walidator = new ChessmanWalidator();
		board.setBeginingState();
	}
	@Test
	public void shouldReturnTrueForMove10to20forPawnWhite() {
		from = new Field(1,0);
		to = new Field (2,0);
		boolean temp = ChessmanWalidator.checkMove(board, from, to);
		Assert.assertTrue(temp);
	}
	@Test
	public void shouldReturnTrueForMove11to31forPawnWhite() {
		from = new Field(1,1);
		to = new Field (3,1);
		boolean temp = ChessmanWalidator.checkMove(board, from, to);
		Assert.assertTrue(temp);
	}
	@Test
	public void shouldReturnFalseForMove31to11forPawnWhite() {
		from = new Field(3,1);
		to = new Field (1,1);
		boolean temp = ChessmanWalidator.checkMove(board, from, to);
		Assert.assertFalse(temp);
	}
	@Test
	public void shouldReturnTrueForMove11to22forPawnWhite() {
		from = new Field(1,1);
		to = new Field (2,2);
		boolean temp = ChessmanWalidator.checkMove(board, from, to);
		Assert.assertTrue(temp);
	}
	@Test
	public void shouldReturnFalseForMove32to11forPawnWhite() {
		from = new Field(3,2);
		to = new Field (1,1);
		boolean temp = ChessmanWalidator.checkMove(board, from, to);
		Assert.assertFalse(temp);
	}
	@Test
	public void shouldReturnTrueForMove60to50forPawnBlack() {
		from = new Field(6,0);
		to = new Field (5,0);
		boolean temp = ChessmanWalidator.checkMove(board, from, to);
		Assert.assertTrue(temp);
	}
	@Test
	public void shouldReturnTrueForMove61to51forPawnBlack() {
		from = new Field(6,1);
		to = new Field (5,1);
		boolean temp = ChessmanWalidator.checkMove(board, from, to);
		Assert.assertTrue(temp);
	}
	@Test
	public void shouldReturnFalseForMove61to41forPawnBlack() {
		from = new Field(6,1);
		to = new Field (4,1);
		boolean temp = ChessmanWalidator.checkMove(board, from, to);
		Assert.assertTrue(temp);
	}
	@Test
	public void shouldReturnFalseForMove62to61forPawnBlack() {
		from = new Field(6,2);
		to = new Field (6,1);
		boolean temp = ChessmanWalidator.checkMove(board, from, to);
		Assert.assertFalse(temp);
	}
	@Test
	public void shouldReturnTrueForMove04to05forKingWhite() {
		from = new Field(0,4);
		to = new Field (0,5);
		boolean temp = ChessmanWalidator.checkMove(board, from, to);
		Assert.assertTrue(temp);
	}
	@Test
	public void shouldReturnFalseForMove04to06forKingWhite() {
		from = new Field(0,4);
		to = new Field (0,6);
		boolean temp = ChessmanWalidator.checkMove(board, from, to);
		Assert.assertFalse(temp);
	}
	@Test
	public void shouldReturnFalseForMove04to16forKingWhite() {
		from = new Field(0,4);
		to = new Field (1,6);
		boolean temp = ChessmanWalidator.checkMove(board, from, to);
		Assert.assertFalse(temp);
	}
	@Test
	public void shouldReturnTrueForMove04to05forKingBlack() {
		from = new Field(0,4);
		to = new Field (0,5);
		boolean temp = ChessmanWalidator.checkMove(board, from, to);
		Assert.assertTrue(temp);
	}
	@Test
	public void shouldReturnFalseForMove04to06forKingBlack() {
		from = new Field(0,4);
		to = new Field (0,6);
		boolean temp = ChessmanWalidator.checkMove(board, from, to);
		Assert.assertFalse(temp);
	}
	@Test
	public void shouldReturnFalseForMove04to16forKingBlack() {
		from = new Field(0,4);
		to = new Field (1,6);
		boolean temp = ChessmanWalidator.checkMove(board, from, to);
		Assert.assertFalse(temp);
	}
	@Test
	public void shouldReturnTrueForMove34to45forBishopWhite() {
		from = new Field(0,2);
		to = new Field (3,4);
		board.MoveChessmanFromTo(from, to);
		from = new Field(3,4);
		to = new Field (4,5);
		boolean temp = ChessmanWalidator.checkMove(board, from, to);
		Assert.assertTrue(temp);
	}
	@Test
	public void shouldReturnTrueForMove34to56forBishopBlack() {
		from = new Field(3,4);
		to = new Field (5,6);
		boolean temp = ChessmanWalidator.checkMove(board, from, to);
		Assert.assertTrue(temp);
	}
	@Test
	public void shouldReturnFalseForMove34to34forBishopBlack() {
		from = new Field(3,4);
		to = new Field (3,4);
		boolean temp = ChessmanWalidator.checkMove(board, from, to);
		Assert.assertFalse(temp);
	}
	@Test
	public void shouldReturnFalseForMove34to22forBishopBlack() {
		from = new Field(3,4);
		to = new Field (2,2);
		boolean temp = ChessmanWalidator.checkMove(board, from, to);
		Assert.assertFalse(temp);
	}
	@Test
	public void shouldReturnTrueForMove34to22forRockBlack() {
		from = new Field(3,4);
		to = new Field (3,0);
		boolean temp = ChessmanWalidator.checkMove(board, from, to);
		Assert.assertTrue(temp);
	}
	@Test
	public void shouldReturnTrueForMove34to54forRockWhite() {
		from = new Field(0,0);
		to = new Field (3,4);
		board.MoveChessmanFromTo(from, to);
		from = new Field(3,4);
		to = new Field (5,4);
		boolean temp = ChessmanWalidator.checkMove(board, from, to);
		Assert.assertTrue(temp);
	}
	@Test
	public void shouldReturnFalseForMove74to00forRockWhite() {
		from = new Field(7,4);
		to = new Field (0,0);
		boolean temp = ChessmanWalidator.checkMove(board, from, to);
		Assert.assertFalse(temp);
	}
	@Test
	public void shouldReturnTrueForMove03to02forQueenWhite() {
		from = new Field(0,3);
		to = new Field (0,2);
		boolean temp = ChessmanWalidator.checkMove(board, from, to);
		Assert.assertTrue(temp);
	}
	@Test
	public void shouldReturnTrueForMove03to05forQueenWhite() {
		from = new Field(0,3);
		to = new Field (0,5);
		boolean temp = ChessmanWalidator.checkMove(board, from, to);
		Assert.assertTrue(temp);
	}
	@Test
	public void shouldReturnTrueForMove03to25forQueenWhite() {
		from = new Field(0,3);
		to = new Field (2,5);
		boolean temp = ChessmanWalidator.checkMove(board, from, to);
		Assert.assertTrue(temp);
	}
	@Test
	public void shouldReturnTrueForMove03to26forQueenWhite() {
		from = new Field(0,3);
		to = new Field (2,6);
		boolean temp = ChessmanWalidator.checkMove(board, from, to);
		Assert.assertFalse(temp);
	}
	@Test
	public void shouldReturnTrueForMove03to02forQueenBlack() {
		from = new Field(0,3);
		to = new Field (0,2);
		boolean temp = ChessmanWalidator.checkMove(board, from, to);
		Assert.assertTrue(temp);
	}
	@Test
	public void shouldReturnTrueForMove03to05forQueenBlack() {
		from = new Field(0,3);
		to = new Field (0,5);
		boolean temp = ChessmanWalidator.checkMove(board, from, to);
		Assert.assertTrue(temp);
	}
	@Test
	public void shouldReturnTrueForMove03to25forQueenBlack() {
		from = new Field(0,3);
		to = new Field (2,5);
		boolean temp = ChessmanWalidator.checkMove(board, from, to);
		Assert.assertTrue(temp);
	}
	@Test
	public void shouldReturnTrueForMove03to26forQueenBlack() {
		from = new Field(0,3);
		to = new Field (2,6);
		boolean temp = ChessmanWalidator.checkMove(board, from, to);
		Assert.assertFalse(temp);
	}
	@Test
	public void shouldReturnTrueForMove34to42forKinghtWhite() {
		from = new Field(3,4);
		to = new Field (4,2);
		boolean temp = ChessmanWalidator.checkMove(board, from, to);
		Assert.assertTrue(temp);
	}
	@Test
	public void shouldReturnTrueForMove34to22forKinghtWhite() {
		from = new Field(3,4);
		to = new Field (2,2);
		boolean temp = ChessmanWalidator.checkMove(board, from, to);
		Assert.assertTrue(temp);
	}
	@Test
	public void shouldReturnTrueForMove34to53forKinghtWhite() {
		from = new Field(3,4);
		to = new Field (5,3);
		boolean temp = ChessmanWalidator.checkMove(board, from, to);
		Assert.assertTrue(temp);
	}
	@Test
	public void shouldReturnTrueForMove34to55forKinghtWhite() {
		from = new Field(3,4);
		to = new Field (5,5);
		boolean temp = ChessmanWalidator.checkMove(board, from, to);
		Assert.assertTrue(temp);
	}
	@Test
	public void shouldReturnTrueForMove34to46forKinghtBlack() {
		from = new Field(3,4);
		to = new Field (4,6);
		boolean temp = ChessmanWalidator.checkMove(board, from, to);
		Assert.assertTrue(temp);
	}
	@Test
	public void shouldReturnTrueForMove34to26forKinghtBlack() {
		
		from = new Field(0,4);
		to = new Field (2,6);
		boolean temp = ChessmanWalidator.checkMove(board, from, to);
		Assert.assertTrue(temp);
	}
	@Test
	public void shouldReturnTrueForMove01to22forKinghtWhite() {
		from = new Field(0,1);
		to = new Field (2,2);
		boolean temp = ChessmanWalidator.checkMove(board, from, to);
		Assert.assertTrue(temp);
	}
	@Test
	public void shouldReturnFalseForMove01to13forKinghtBlack() {
		from = new Field(0,1);
		to = new Field (1,3);
		boolean temp = ChessmanWalidator.checkMove(board, from, to);
		Assert.assertFalse(temp);
	}
	@Test
	public void shouldReturnTrueForMove34to13forKinghtBlack() {
		from = new Field(3,4);
		to = new Field (1,3);
		boolean temp = ChessmanWalidator.checkMove(board, from, to);
		Assert.assertTrue(temp);
	}	
}
