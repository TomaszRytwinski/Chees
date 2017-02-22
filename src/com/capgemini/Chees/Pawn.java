package com.capgemini.Chees;
/**
 * Class Pawn
 * It is possible only to create object that is WHITE or BLACK
 */
public class Pawn implements Chessman {
	private String color="";
	public Pawn(String color){
		if(color=="WHITE" || color=="BLACK"){
			this.color=color;			
		}else{
			this.color="WHITE";
		}
	}
	/**
	Return color of Bishop
	 */
	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return color;
	}
	/**
	Return name of class + color
	 */
	@Override
	public String toString(){
		return Pawn.class.getName() + " " + color;
	}
}
