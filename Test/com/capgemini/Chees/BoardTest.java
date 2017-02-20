package com.capgemini.Chees;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BoardTest {
	Board board;
	ChessmanWalidator walidator;
	@Before
	public void setup(){
		board = new Board();
		walidator = new ChessmanWalidator();
		board.setBeginingState();
		
	}
	@Test
	public void shouldCreateWhitePawnInRow1() {
		boolean compare=true;
		for (int i=0;i<8;i++){
			if (!board.getChessmanXY(1, i).toString().equals("com.capgemini.Chees.Pawn WHITE")){
				compare=false;
			}
		}
		Assert.assertTrue(compare);
	}
	@Test
	public void shouldCreate2WhiteRocks() {
		boolean compare=true;
		if (!board.getChessmanXY(0, 0).toString().equals("com.capgemini.Chees.Rock WHITE")){
			compare=false;
		}
		if (!board.getChessmanXY(0, 7).toString().equals("com.capgemini.Chees.Rock WHITE")){
			compare=false;
		}
		Assert.assertTrue(compare);
	}
	@Test
	public void shouldCreate2WhiteKnights() {
		boolean compare=true;
		if (!board.getChessmanXY(0, 1).toString().equals("com.capgemini.Chees.Knight WHITE")){
			compare=false;
		}
		if (!board.getChessmanXY(0, 6).toString().equals("com.capgemini.Chees.Knight WHITE")){
			compare=false;
		}
		Assert.assertTrue(compare);
	}
	@Test
	public void shouldCreate2WhiteBishops() {
		boolean compare=true;
		if (!board.getChessmanXY(0, 2).toString().equals("com.capgemini.Chees.Bishop WHITE")){
			compare=false;
		}
		if (!board.getChessmanXY(0, 5).toString().equals("com.capgemini.Chees.Bishop WHITE")){
			compare=false;
		}
		Assert.assertTrue(compare);
	}
	@Test
	public void shouldCreateWhiteQueen() {
		boolean compare=true;
		if (!board.getChessmanXY(0, 3).toString().equals("com.capgemini.Chees.Queen WHITE")){
			compare=false;
		}
		Assert.assertTrue(compare);
	}
	@Test
	public void shouldCreateWhiteKing() {
		boolean compare=true;
		if (!board.getChessmanXY(0, 4).toString().equals("com.capgemini.Chees.King WHITE")){
			compare=false;
		}
		Assert.assertTrue(compare);
	}
	@Test
	public void shouldCreateBlackPawnInRow7() {
		boolean compare=true;
		for (int i=0;i<8;i++){
			if (!board.getChessmanXY(6, i).toString().equals("com.capgemini.Chees.Pawn BLACK")){
				compare=false;
			}
		}
		Assert.assertTrue(compare);
	}
	@Test
	public void shouldCreate2BlackRocks() {
		boolean compare=true;
		if (!board.getChessmanXY(7, 0).toString().equals("com.capgemini.Chees.Rock BLACK")){
			compare=false;
		}
		if (!board.getChessmanXY(7, 7).toString().equals("com.capgemini.Chees.Rock BLACK")){
			compare=false;
		}
		Assert.assertTrue(compare);
	}
	@Test
	public void shouldCreate2BlackKnights() {
		boolean compare=true;
		if (!board.getChessmanXY(7, 1).toString().equals("com.capgemini.Chees.Knight BLACK")){
			compare=false;
		}
		if (!board.getChessmanXY(7, 6).toString().equals("com.capgemini.Chees.Knight BLACK")){
			compare=false;
		}
		Assert.assertTrue(compare);
	}
	@Test
	public void shouldCreate2BlackBishops() {
		boolean compare=true;
		if (!board.getChessmanXY(7, 2).toString().equals("com.capgemini.Chees.Bishop BLACK")){
			compare=false;
		}
		if (!board.getChessmanXY(7, 5).toString().equals("com.capgemini.Chees.Bishop BLACK")){
			compare=false;
		}
		Assert.assertTrue(compare);
	}
	@Test
	public void shouldCreateBlackQueen() {
		boolean compare=true;
		if (!board.getChessmanXY(7, 3).toString().equals("com.capgemini.Chees.Queen BLACK")){
			compare=false;
		}
		Assert.assertTrue(compare);
	}
	@Test
	public void shouldCreateBlackKing() {
		boolean compare=true;
		if (!board.getChessmanXY(7, 4).toString().equals("com.capgemini.Chees.King BLACK")){
			compare=false;
		}
		Assert.assertTrue(compare);
	}
	@Test
	public void should00onBoardbeBlack(){
		Assert.assertFalse(board.getIsWhite(0, 0));
	}
	@Test
	public void should12onBoardbeWhite(){
		Assert.assertTrue(board.getIsWhite(1, 2));
	}
	@Test
	public void should7onBoardbeBlack(){
		Assert.assertFalse(board.getIsWhite(7, 7));
	}


}
