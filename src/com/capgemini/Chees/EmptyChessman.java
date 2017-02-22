package com.capgemini.Chees;
/**
 * Class EmptyChessman
 * A dummy class used to fill the board in empty places
 */
public class EmptyChessman implements Chessman {
	/**
	Return null- emptychessman has no color
	 */
	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return null;
	}
	/**
	Return string "Empty"
	 */
	@Override
	public String toString(){
		return "Empty";
	}



}
