package com.capgemini.Chees;

import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class BishopMovesTest {

	Field from;
	@Test
	public void shouldReturn5possibleMovesFor04postion() {
		List<Move> possibleMoves = new ArrayList<Move>();
		Field from= new Field(0,4);
		possibleMoves.addAll(BishopMoves.getPossibleMoves(from));
		Assert.assertEquals(7, possibleMoves.size());
	}
	@Test
	public void shouldReturn3possibleMovesFor00postion() {
		List<Move> possibleMoves = new ArrayList<Move>();
		Field from= new Field(0,0);
		possibleMoves.addAll(BishopMoves.getPossibleMoves(from));
		Assert.assertEquals(7, possibleMoves.size());
	}
	@Test
	public void shouldReturn8possibleMovesFor44postion() {
		List<Move> possibleMoves = new ArrayList<Move>();
		Field from= new Field(4,4);
		possibleMoves.addAll(BishopMoves.getPossibleMoves(from));
		Assert.assertEquals(13, possibleMoves.size());
	}
	@Test
	public void shouldReturn3possibleMovesFor77postion() {
		List<Move> possibleMoves = new ArrayList<Move>();
		Field from= new Field(7,7);
		possibleMoves.addAll(BishopMoves.getPossibleMoves(from));
		Assert.assertEquals(7, possibleMoves.size());
	}

}
