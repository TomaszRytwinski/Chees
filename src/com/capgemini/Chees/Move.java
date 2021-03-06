package com.capgemini.Chees;
/**
 * Class Move has variables needed to describe a move in chess
 */
public class Move {
	private Field from;
	private Field to;
	
	public Move(Field from, Field to ){
		this.setFrom(from);
		this.setTo(to);	
	}

	public Field getTo() {
		return to;
	}

	public void setTo(Field to) {
		this.to = to;
	}

	public Field getFrom() {
		return from;
	}

	public void setFrom(Field from) {
		this.from = from;
	}
}
