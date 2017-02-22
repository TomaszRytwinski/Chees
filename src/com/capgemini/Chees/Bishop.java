package com.capgemini.Chees;
/**
 * Class Bishop
 * It is possible only to create object that is WHITE or BLACK
 */

public class Bishop implements Chessman {
	private String color="";
	public Bishop(String color){
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
		return color;
	}
	/**
	Return name of class + color
	 */
	@Override
	public String toString(){
		return Bishop.class.getName() + " " + color;
	}
}
