package com.capgemini.Chees;

import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class KnightMovesTest {

	@Test
	public void shouldReturn4possibleMovesFor04postion() {
		List<Move> possibleMoves = new ArrayList<Move>();
		Field from= new Field(0,4);
		possibleMoves.addAll(KnightMoves.getPossibleMoves(from));
		Assert.assertEquals(4, possibleMoves.size());
	}
	@Test
	public void shouldReturn2possibleMovesFor00postion() {
		List<Move> possibleMoves = new ArrayList<Move>();
		Field from= new Field(0,0);
		possibleMoves.addAll(KnightMoves.getPossibleMoves(from));
		Assert.assertEquals(2, possibleMoves.size());
	}
	@Test
	public void shouldReturn8possibleMovesFor44postion() {
		List<Move> possibleMoves = new ArrayList<Move>();
		Field from= new Field(4,4);
		possibleMoves.addAll(KnightMoves.getPossibleMoves(from));
		Assert.assertEquals(8, possibleMoves.size());
	}
	@Test
	public void shouldReturn2possibleMovesFor77postion() {
		List<Move> possibleMoves = new ArrayList<Move>();
		Field from= new Field(7,7);
		possibleMoves.addAll(KnightMoves.getPossibleMoves(from));
		Assert.assertEquals(2, possibleMoves.size());
	}
}
