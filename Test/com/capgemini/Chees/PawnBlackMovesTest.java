package com.capgemini.Chees;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class PawnBlackMovesTest {
	Field from;
	@Test
	public void shouldReturn5possibleMovesFor04postion() {
		List<Move> possibleMoves = new ArrayList<Move>();
		Field from= new Field(7,4);
		possibleMoves.addAll(PawnBlackMoves.getPossibleMoves(from));
		Assert.assertEquals(4, possibleMoves.size());
	}
	@Test
	public void shouldReturn3possibleMovesFor00postion() {
		List<Move> possibleMoves = new ArrayList<Move>();
		Field from= new Field(7,0);
		possibleMoves.addAll(PawnBlackMoves.getPossibleMoves(from));
		Assert.assertEquals(3, possibleMoves.size());
	}
	@Test
	public void shouldReturn8possibleMovesFor44postion() {
		List<Move> possibleMoves = new ArrayList<Move>();
		Field from= new Field(4,4);
		possibleMoves.addAll(PawnBlackMoves.getPossibleMoves(from));
		Assert.assertEquals(3, possibleMoves.size());
	}
	@Test
	public void shouldReturn3possibleMovesFor77postion() {
		List<Move> possibleMoves = new ArrayList<Move>();
		Field from= new Field(0,7);
		possibleMoves.addAll(PawnBlackMoves.getPossibleMoves(from));
		Assert.assertEquals(0, possibleMoves.size());
	}
}
