package com.capgemini.Chees;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ChessmanWalidatorTest {
	Board board;
	ChessmanWalidator walidator;
	Field from, to;

	@Before
	public void setup() {
		board = new Board();
		walidator = new ChessmanWalidator();
		board.setBeginingState();
	}

	@Test
	public void shouldReturnTrueForMove10to20forPawnWhite() {
		//given
		from = new Field(1, 0);
		to = new Field(2, 0);
		//when
		boolean Walidator = ChessmanWalidator.checkMove(board, from, to);
		//then
		Assert.assertTrue(Walidator);
	}

	@Test
	public void shouldReturnTrueForMove11to31forPawnWhite() {
		//given
		from = new Field(1, 1);
		to = new Field(3, 1);
		//when
		boolean Walidator = ChessmanWalidator.checkMove(board, from, to);
		//then
		Assert.assertTrue(Walidator);
	}

	@Test
	public void shouldReturnFalseForMove31to11forPawnWhite() {
		//given
		from = new Field(1, 1);
		to = new Field(3, 3);
		board.MoveChessmanFromTo(from, to);
		from = new Field(3, 1);
		to = new Field(1, 1);
		//when
		boolean Walidator = ChessmanWalidator.checkMove(board, from, to);
		//then
		Assert.assertFalse(Walidator);
	}

	@Test
	public void shouldReturnFalseForMove11to22forPawnWhite() {
		//given
		from = new Field(1, 1);
		to = new Field(2, 2);
		//when
		boolean Walidator = ChessmanWalidator.checkMove(board, from, to);
		//then
		Assert.assertFalse(Walidator);
	}
	
	@Test
	public void shouldReturnTrueForMove11to22forPawnWhiteWhenPossibleToBeat() {
		//given
		from = new Field(7, 2);
		to = new Field(2, 2);
		board.MoveChessmanFromTo(from, to);
		from = new Field(1, 1);
		to = new Field(2, 2);
		//when
		boolean Walidator = ChessmanWalidator.checkMove(board, from, to);
		//then
		Assert.assertTrue(Walidator);
	}

	@Test
	public void shouldReturnFalseForMove32to11forPawnWhite() {
		//given
		from = new Field(0,2);
		to = new Field(3, 2);
		board.MoveChessmanFromTo(from, to);
		from = new Field(3, 2);
		to = new Field(1, 1);
		//when
		boolean Walidator = ChessmanWalidator.checkMove(board, from, to);
		//then
		Assert.assertFalse(Walidator);
	}
	@Test
	public void shouldReturnFalseForMove02to22forPawnWhiteWhen22isNoWalidatorty() {
		//given
		from = new Field(7,2);
		to = new Field(2, 2);
		board.MoveChessmanFromTo(from, to);
		from = new Field(1, 2);
		to = new Field(2, 2);
		//when
		boolean Walidator = ChessmanWalidator.checkMove(board, from, to);
		//then
		Assert.assertFalse(Walidator);
	}

	@Test
	public void shouldReturnTrueForMove60to50forPawnBlack() {
		//given
		from = new Field(6, 0);
		to = new Field(5, 0);
		//when
		boolean Walidator = ChessmanWalidator.checkMove(board, from, to);
		//then
		Assert.assertTrue(Walidator);
	}

	@Test
	public void shouldReturnTrueForMove61to51forPawnBlack() {
		//given
		from = new Field(6, 1);
		to = new Field(5, 1);
		//when
		boolean Walidator = ChessmanWalidator.checkMove(board, from, to);
		//then
		Assert.assertTrue(Walidator);
	}

	@Test
	public void shouldReturnFalseForMove61to41forPawnBlack() {
		//given
		from = new Field(6, 1);
		to = new Field(4, 1);
		//when
		boolean Walidator = ChessmanWalidator.checkMove(board, from, to);
		//then
		Assert.assertTrue(Walidator);
	}

	@Test
	public void shouldReturnFalseForMove62to61forPawnBlack() {
		//given
		from = new Field(6, 2);
		to = new Field(6, 1);
		//when
		boolean Walidator = ChessmanWalidator.checkMove(board, from, to);
		//then
		Assert.assertFalse(Walidator);
	}
	@Test
	public void shouldReturnFalseForMove62to42forPawnWhiteWhen52isNoWalidatorty() {
		//given
		from = new Field(0,2);
		to = new Field(5, 2);
		board.MoveChessmanFromTo(from, to);
		from = new Field(6, 2);
		to = new Field(4, 2);
		//when
		boolean Walidator = ChessmanWalidator.checkMove(board, from, to);
		//then
		Assert.assertFalse(Walidator);
	}
	@Test
	public void shouldReturnTrueForMove25to35forKingWhite() {
		//given
		from = new Field(0, 4);
		to = new Field(2, 5);
		board.MoveChessmanFromTo(from, to);
		from = new Field(2, 5);
		to = new Field(3, 5);
		//when
		boolean Walidator = ChessmanWalidator.checkMove(board, from, to);
		//then
		Assert.assertTrue(Walidator);
	}

	@Test
	public void shouldReturnFalseForMove04to06forKingWhite() {
		//given
		from = new Field(0, 4);
		to = new Field(0, 6);
		//when
		boolean Walidator = ChessmanWalidator.checkMove(board, from, to);
		//then
		Assert.assertFalse(Walidator);
	}

	@Test
	public void shouldReturnFalseForMove04to16forKingWhite() {
		//given
		from = new Field(0, 4);
		to = new Field(1, 6);
		//when
		boolean Walidator = ChessmanWalidator.checkMove(board, from, to);
		//then
		Assert.assertFalse(Walidator);
	}

	@Test
	public void shouldReturnTrueForMove74to75forKingBlack() {
		//given
		from = new Field(7, 4);
		to = new Field(7, 5);
		//when
		boolean Walidator = ChessmanWalidator.checkMove(board, from, to);
		//then
		Assert.assertFalse(Walidator);
	}

	@Test
	public void shouldReturnFalseForMove74to73forKingBlack() {
		//given
		from = new Field(7, 4);
		to = new Field(7, 3);
		//when
		boolean Walidator = ChessmanWalidator.checkMove(board, from, to);
		//then
		Assert.assertFalse(Walidator);
	}

	@Test
	public void shouldReturnTrueForMove55to44forKingBlack() {
		//given
		from = new Field(7, 4);
		to = new Field(5,5);
		board.MoveChessmanFromTo(from, to);
		from = new Field(5,5);
		to = new Field(4, 4);
		//when
		boolean Walidator = ChessmanWalidator.checkMove(board, from, to);
		//then
		Assert.assertTrue(Walidator);
	}

	@Test
	public void shouldReturnTrueForMove34to45forBishopWhite() {
		//given
		from = new Field(0, 3);
		to = new Field(3, 4);
		board.MoveChessmanFromTo(from, to);
		from = new Field(3, 4);
		to = new Field(4, 5);
		//when
		boolean Walidator = ChessmanWalidator.checkMove(board, from, to);
		//then
		Assert.assertTrue(Walidator);
	}

	@Test
	public void shouldReturnTrueForMove34to56forBishopBlack() {
		//given
		from = new Field(7,2);
		to = new Field(3, 4);
		board.MoveChessmanFromTo(from, to);
		from = new Field(3, 4);
		to = new Field(5, 6);
		//when
		boolean Walidator = ChessmanWalidator.checkMove(board, from, to);
		//then
		Assert.assertTrue(Walidator);
	}
	@Test
	public void shouldReturnFalseForMove72to54forBishopBlack() {
		//given
		from = new Field(7,2);
		to = new Field(5, 4);
		//when
		boolean Walidator = ChessmanWalidator.checkMove(board, from, to);
		//then
		Assert.assertFalse(Walidator);
	}

	@Test
	public void shouldReturnFalseForMove34to34forBishopBlack() {
		//given
		from = new Field(7,2);
		to = new Field(3, 4);
		board.MoveChessmanFromTo(from, to);
		from = new Field(3, 4);
		to = new Field(3, 4);
		//when
		boolean Walidator = ChessmanWalidator.checkMove(board, from, to);
		//then
		Assert.assertFalse(Walidator);
	}

	@Test
	public void shouldReturnFalseForMove34to22forBishopBlack() {
		//given
		from = new Field(7,2);
		to = new Field(3, 4);
		board.MoveChessmanFromTo(from, to);
		from = new Field(3, 4);
		to = new Field(2, 2);
		//when
		boolean Walidator = ChessmanWalidator.checkMove(board, from, to);
		//then
		Assert.assertFalse(Walidator);
	}

	@Test
	public void shouldReturnTrueForMove34to30forRockBlack() {
		//given
		from = new Field(7, 0);
		to = new Field(3, 4);
		board.MoveChessmanFromTo(from, to);
		from = new Field(3, 4);
		to = new Field(3, 0);
		//when
		boolean Walidator = ChessmanWalidator.checkMove(board, from, to);
		//then
		Assert.assertTrue(Walidator);
	}

	@Test
	public void shouldReturnTrueForMove34to54forRockWhite() {
		//given
		from = new Field(0, 0);
		to = new Field(3, 4);
		board.MoveChessmanFromTo(from, to);
		from = new Field(3, 4);
		to = new Field(5, 4);
		//when
		boolean Walidator = ChessmanWalidator.checkMove(board, from, to);
		//then
		Assert.assertTrue(Walidator);
	}

	@Test
	public void shouldReturnFalseForMove74to00forRockWhite() {
		//given
		from = new Field(0, 0);
		to = new Field(3, 4);
		board.MoveChessmanFromTo(from, to);
		from = new Field(7, 4);
		to = new Field(0, 0);
		//when
		boolean Walidator = ChessmanWalidator.checkMove(board, from, to);
		//then
		Assert.assertFalse(Walidator);
	}
	@Test
	public void shouldReturnFalseForMove00to50forRockWhite() {
		//given
		from = new Field(0, 0);
		to = new Field(5, 0);
		//when
		boolean Walidator = ChessmanWalidator.checkMove(board, from, to);
		//then
		Assert.assertFalse(Walidator);
	}

	@Test
	public void shouldReturnTrueForMove03to02forQueenWhite() {
		//given
		from = new Field(0, 3);
		to = new Field(0, 2);
		//when
		boolean Walidator = ChessmanWalidator.checkMove(board, from, to);
		//then
		Assert.assertFalse(Walidator);
	}

	@Test
	public void shouldReturnTrueForMove03to05forQueenWhite() {
		//given
		from = new Field(0, 3);
		to = new Field(3, 3);
		board.MoveChessmanFromTo(from, to);
		from = new Field(3, 3);
		to = new Field(5, 5);
		//when
		boolean Walidator = ChessmanWalidator.checkMove(board, from, to);
		//then
		Assert.assertTrue(Walidator);
	}
	

	@Test
	public void shouldReturnTrueForMove03to26forQueenWhite() {
		//given
		from = new Field(0, 3);
		to = new Field(2, 6);
		//when
		boolean Walidator = ChessmanWalidator.checkMove(board, from, to);
		//then
		Assert.assertFalse(Walidator);
	}

	@Test
	public void shouldReturnTrueForMove03to02forQueenBlack() {
		//given
		from = new Field(7, 3);
		to = new Field(7, 2);
		//when
		boolean Walidator = ChessmanWalidator.checkMove(board, from, to);
		//then
		Assert.assertFalse(Walidator);
	}
	@Test
	public void shouldReturnTrueForMove33to11forQueenWhite() {
		//given
		from = new Field(7, 3);
		to = new Field(3, 3);
		board.MoveChessmanFromTo(from, to);
		from = new Field(3, 3);
		to = new Field(1, 1);
		//when
		boolean Walidator = ChessmanWalidator.checkMove(board, from, to);
		//then
		Assert.assertTrue(Walidator);
	}

	@Test
	public void shouldReturnTrueForMove33to63forQueenBlack() {
		//given
		from = new Field(0, 3);
		to = new Field(3, 3);
		board.MoveChessmanFromTo(from, to);
		from = new Field(3, 3);
		to = new Field(6, 3);
		//when
		boolean Walidator = ChessmanWalidator.checkMove(board, from, to);
		//then
		Assert.assertTrue(Walidator);
	}

	@Test
	public void shouldReturnFalseForMove03to63forQueenWhite() {
		//given
		from = new Field(0, 3);
		to = new Field(6, 3);
		//when
		boolean Walidator = ChessmanWalidator.checkMove(board, from, to);
		//then
		Assert.assertFalse(Walidator);
	}

	@Test
	public void shouldReturnTrueForMove34to12forQueenBlack() {
		//given
		from = new Field(7, 3);
		to = new Field(3, 4);
		board.MoveChessmanFromTo(from, to);
		from = new Field(3,4);
		to = new Field(1,2);
		//when
		boolean Walidator = ChessmanWalidator.checkMove(board, from, to);
		//then
		Assert.assertTrue(Walidator);
	}

	@Test
	public void shouldReturnTrueForMove03to26forQueenBlack() {
		//given
		from = new Field(0, 3);
		to = new Field(2, 6);
		//when
		boolean Walidator = ChessmanWalidator.checkMove(board, from, to);
		//then
		Assert.assertFalse(Walidator);
	}

	@Test
	public void shouldReturnTrueForMove34to42forKinghtWhite() {
		//given
		from = new Field(7, 1);
		to = new Field(3, 4);
		board.MoveChessmanFromTo(from, to);
		from = new Field(3, 4);
		to = new Field(4, 2);
		//when
		boolean Walidator = ChessmanWalidator.checkMove(board, from, to);
		//then
		Assert.assertTrue(Walidator);
	}

	@Test
	public void shouldReturnTrueForMove34to22forKinghtWhite() {
		//given
		from = new Field(7, 1);
		to = new Field(3, 4);
		board.MoveChessmanFromTo(from, to);
		from = new Field(3, 4);
		to = new Field(2, 2);
		//when
		boolean Walidator = ChessmanWalidator.checkMove(board, from, to);
		//then
		Assert.assertTrue(Walidator);
	}

	@Test
	public void shouldReturnTrueForMove34to53forKinghtWhite() {
		//given
		from = new Field(0, 4);
		to = new Field(3, 4);
		board.MoveChessmanFromTo(from, to);
		from = new Field(3, 4);
		to = new Field(5, 3);
		//when
		boolean Walidator = ChessmanWalidator.checkMove(board, from, to);
		//then
		Assert.assertFalse(Walidator);
	}

	@Test
	public void shouldReturnTrueForMove34to55forKinghtWhite() {
		//given
		from = new Field(0, 1);
		to = new Field(3, 4);
		board.MoveChessmanFromTo(from, to);
		from = new Field(3, 4);
		to = new Field(5, 5);
		//when
		boolean Walidator = ChessmanWalidator.checkMove(board, from, to);
		//then
		Assert.assertTrue(Walidator);
	}

	@Test
	public void shouldReturnTrueForMove34to46forKinghtBlack() {
		//given
		from = new Field(7, 1);
		to = new Field(3, 4);
		board.MoveChessmanFromTo(from, to);
		from = new Field(3, 4);
		to = new Field(4, 6);
		//when
		boolean Walidator = ChessmanWalidator.checkMove(board, from, to);
		//then
		Assert.assertTrue(Walidator);
	}
	
	@Test
	public void shouldReturnFalseForMove34to47forKinghtBlack() {
		//given
		from = new Field(7, 1);
		to = new Field(3, 4);
		board.MoveChessmanFromTo(from, to);
		from = new Field(3, 4);
		to = new Field(4, 7);
		//when
		boolean Walidator = ChessmanWalidator.checkMove(board, from, to);
		//then
		Assert.assertFalse(Walidator);
	}

	@Test
	public void shouldReturnTrueForMove34to26forKinghtBlack() {
		//given
		from = new Field(7, 1);
		to = new Field(3, 4);
		board.MoveChessmanFromTo(from, to);
		from = new Field(3, 4);
		to = new Field(2, 6);
		//when
		boolean Walidator = ChessmanWalidator.checkMove(board, from, to);
		//then
		Assert.assertTrue(Walidator);
	}

	@Test
	public void shouldReturnFalseForMove71to63forKinghtBlack() {
		//given
		from = new Field(7, 1);
		to = new Field(6, 3);
		//when
		boolean Walidator = ChessmanWalidator.checkMove(board, from, to);
		//then
		Assert.assertFalse(Walidator);
	}

	@Test
	public void shouldReturnTrueForMove01to22forKinghtWhite() {
		//given
		from = new Field(0, 1);
		to = new Field(2, 2);
		//when
		boolean Walidator = ChessmanWalidator.checkMove(board, from, to);
		//then
		Assert.assertTrue(Walidator);
	}

	@Test
	public void shouldReturnFalseForMove01to13forKinghtBlack() {
		//given
		from = new Field(0, 1);
		to = new Field(1, 3);
		//when
		boolean Walidator = ChessmanWalidator.checkMove(board, from, to);
		//then
		Assert.assertFalse(Walidator);
	}

	@Test
	public void shouldReturnTrueForMove76to64forKinghtBlack() {
		//given
		from = new Field(7, 6);
		to = new Field(6, 4);
		//when
		boolean Walidator = ChessmanWalidator.checkMove(board, from, to);
		//then
		Assert.assertFalse(Walidator);
	}
}
