package com.capgemini.Chees;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CheckWalidatorTest {
	Board board;
	ChessmanWalidator walidator;
	Field from,to;
	PossibleMoves possibleMoves;
	@Before
	public void setup(){
		board = new Board();
		walidator = new ChessmanWalidator();
		possibleMoves = new PossibleMoves();
	}
	// tests for check to white king
	@Test
	public void shouldReturnFalseForBegining() {
		board.setBeginingState();
		boolean temp = CheckWalidator.checkChecktoWhiteKing(board, possibleMoves.getBlackList());
		Assert.assertFalse(temp);
	}
	@Test
	public void shouldReturnTrueForCheckPos() {
		board.setCheckStateToWhite();
		possibleMoves.createList(board);
		boolean temp = CheckWalidator.checkChecktoWhiteKing(board, possibleMoves.getBlackList());
		Assert.assertTrue(temp);
	}
	@Test
	public void shouldReturnTrueForCheckPosPawnCloseToKing() {
		board.setBeginingState();
		Field from = new Field(6,7);
		Field to = new Field(1,5);
		board.MoveChessmanFromTo(from, to);
		possibleMoves.createList(board);
		boolean temp = CheckWalidator.checkChecktoWhiteKing(board, possibleMoves.getBlackList());
		Assert.assertTrue(temp);
	}
	@Test
	public void shouldReturnTrueForCheckPosKinghtInPos() {
		board.setBeginingState();
		Field from = new Field(7,1);
		Field to = new Field(2,3);
		board.MoveChessmanFromTo(from, to);
		possibleMoves.createList(board);
		boolean temp = CheckWalidator.checkChecktoWhiteKing(board, possibleMoves.getBlackList());
		Assert.assertTrue(temp);
	}
	@Test
	public void shouldReturnTrueForCheckPosBishopInPos() {
		board.setBeginingState();
		Field from = new Field(1,5);
		Field to = new Field(2,5);
		board.MoveChessmanFromTo(from, to);
		from = new Field(7,5);
		to = new Field(2,6);
		board.MoveChessmanFromTo(from, to);
		possibleMoves.createList(board);
		boolean temp = CheckWalidator.checkChecktoWhiteKing(board, possibleMoves.getBlackList());
		Assert.assertTrue(temp);
	}
	@Test
	public void shouldReturnTrueForCheckPosQueenInPos() {
		board.setBeginingState();
		Field from = new Field(1,3);
		Field to = new Field(2,3);
		board.MoveChessmanFromTo(from, to);
		from = new Field(7,3);
		to = new Field(2,2);
		board.MoveChessmanFromTo(from, to);
		possibleMoves.createList(board);
		boolean temp = CheckWalidator.checkChecktoWhiteKing(board, possibleMoves.getBlackList());
		Assert.assertTrue(temp);
	}
	@Test
	public void shouldReturnFalseForNonCheckPos() {
		Field from = new Field(0,0);
		Field to = new Field(0,0);
		board.setBeginingState();
		for (int i=0;i<8;i++){
			from = new Field(0,i);
			to = new Field(1,i);
			board.MoveChessmanFromTo(from, to);
		}
		for (int i=0;i<8;i++){
			from = new Field(7,i);
			to = new Field(6,i);
			board.MoveChessmanFromTo(from, to);
		}
		boolean temp = CheckWalidator.checkChecktoWhiteKing(board, possibleMoves.getBlackList());
		Assert.assertFalse(temp);
	}
	// tests for check to Black king
	@Test
	public void shouldReturnFalseForBeginingBlack() {
		board.setBeginingState();
		boolean temp = CheckWalidator.checkChecktoBlackKing(board, possibleMoves.getWhiteList());
		Assert.assertFalse(temp);
	}
	@Test
	public void shouldReturnTrueForCheckPosPawnCloseToKingBlack() {
		board.setBeginingState();
		Field from = new Field(1,7);
		Field to = new Field(6,5);
		board.MoveChessmanFromTo(from, to);
		possibleMoves.createList(board);
		boolean temp = CheckWalidator.checkChecktoBlackKing(board, possibleMoves.getWhiteList());
		Assert.assertTrue(temp);
	}
	@Test
	public void shouldReturnTrueForCheckPosKinghtInPosBlack() {
		board.setBeginingState();
		Field from = new Field(0,1);
		Field to = new Field(5,3);
		board.MoveChessmanFromTo(from, to);
		possibleMoves.createList(board);
		boolean temp = CheckWalidator.checkChecktoBlackKing(board, possibleMoves.getWhiteList());
		Assert.assertTrue(temp);
	}
	@Test
	public void shouldReturnTrueForCheckPosBishopInPosBlack() {
		board.setBeginingState();
		Field from = new Field(6,5);
		Field to = new Field(5,5);
		board.MoveChessmanFromTo(from, to);
		from = new Field(0,5);
		to = new Field(5,6);
		board.MoveChessmanFromTo(from, to);
		possibleMoves.createList(board);
		boolean temp = CheckWalidator.checkChecktoBlackKing(board, possibleMoves.getWhiteList());
		Assert.assertTrue(temp);
	}
	@Test
	public void shouldReturnTrueForCheckPosQueenInPosBlack() {
		board.setBeginingState();
		Field from = new Field(6,3);
		Field to = new Field(5,3);
		board.MoveChessmanFromTo(from, to);
		from = new Field(0,3);
		to = new Field(5,2);
		board.MoveChessmanFromTo(from, to);
		possibleMoves.createList(board);
		boolean temp = CheckWalidator.checkChecktoBlackKing(board, possibleMoves.getWhiteList());
		Assert.assertTrue(temp);
	}
	@Test
	public void shouldReturnFalseForNonCheckPosBlack() {
		Field from = new Field(0,0);
		Field to = new Field(0,0);
		board.setBeginingState();
		for (int i=0;i<8;i++){
			from = new Field(0,i);
			to = new Field(1,i);
			board.MoveChessmanFromTo(from, to);
		}
		for (int i=0;i<8;i++){
			from = new Field(7,i);
			to = new Field(6,i);
			board.MoveChessmanFromTo(from, to);
		}
		boolean temp = CheckWalidator.checkChecktoBlackKing(board, possibleMoves.getWhiteList());
		Assert.assertFalse(temp);
	}
	private void printBlackPossibleMoves(){
		for (int i=0;i<possibleMoves.getBlackList().size();i++){
			System.out.println(possibleMoves.getBlackList().get(i).getFrom().getY()+ " " +possibleMoves.getBlackList().get(i).getFrom().getX() + " to " + possibleMoves.getBlackList().get(i).getTo().getY() +" " + possibleMoves.getBlackList().get(i).getTo().getX());
		}
	}
	private void printWhitePossibleMoves(){
		for (int i=0;i<possibleMoves.getWhiteList().size();i++){
			System.out.println(possibleMoves.getWhiteList().get(i).getFrom().getY()+ " " +possibleMoves.getWhiteList().get(i).getFrom().getX() + " to " + possibleMoves.getWhiteList().get(i).getTo().getY() +" " + possibleMoves.getWhiteList().get(i).getTo().getX());
		}
	}
}
