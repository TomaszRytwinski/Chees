package com.capgemini.Chees;
/**
 * Class Field keeps coordinates
 */
public class Field {
	private int x,y;
	/**
	 * Field consturctor creates field only for Y,X values
	 */
	public Field(int y,int x) throws IllegalStateException{
		if (x>=0 && x<=7 && y>=0 && y<=7){
			this.x=x;
			this.y=y;
		}
		else{
			throw new IllegalStateException();
		}
	}
	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
}
