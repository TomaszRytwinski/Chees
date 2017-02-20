package com.capgemini.Chees;

import org.junit.Assert;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class QueenMovesTest {

	Field from;
	@Test
	public void shouldReturn5possibleMovesFor04postion() {
		List<Move> possibleMoves = new ArrayList<Move>();
		Field from= new Field(0,4);
		possibleMoves.addAll(QueenMoves.getPossibleMoves(from));
		Assert.assertEquals(21, possibleMoves.size());
	}
	@Test
	public void shouldReturn3possibleMovesFor00postion() {
		List<Move> possibleMoves = new ArrayList<Move>();
		Field from= new Field(0,0);
		possibleMoves.addAll(QueenMoves.getPossibleMoves(from));
		Assert.assertEquals(21, possibleMoves.size());
	}
	@Test
	public void shouldReturn8possibleMovesFor44postion() {
		List<Move> possibleMoves = new ArrayList<Move>();
		Field from= new Field(3,4);
		possibleMoves.addAll(QueenMoves.getPossibleMoves(from));
		Assert.assertEquals(27, possibleMoves.size());
	}
	@Test
	public void shouldReturn3possibleMovesFor77postion() {
		List<Move> possibleMoves = new ArrayList<Move>();
		Field from= new Field(7,7);
		possibleMoves.addAll(QueenMoves.getPossibleMoves(from));
		Assert.assertEquals(21, possibleMoves.size());
	}
}
