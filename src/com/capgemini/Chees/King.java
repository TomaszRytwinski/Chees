package com.capgemini.Chees;
/**
 * Class King
 * It is possible only to create object that is WHITE or BLACK
 */
public class King implements Chessman {
	private String color="";
	public King(String color){
		if(color=="WHITE" || color=="BLACK"){
			this.color=color;			
		}else{
			this.color="WHITE";
		}
	}
	/**
	Return color of King
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
		return King.class.getName() + " " + color;
	}

}
