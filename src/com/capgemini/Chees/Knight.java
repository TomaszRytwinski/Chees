package com.capgemini.Chees;
/**
 * Class Knight
 * It is possible only to create object that is WHITE or BLACK
 */
public class Knight implements Chessman {
	private String color="";
	public Knight(String color){
		if(color=="WHITE" || color=="BLACK"){
			this.color=color;			
		}else{
			this.color="WHITE";
		}
	}
	/**
	Return color of Knight
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
		return Knight.class.getName() + " " + color;
	}
}
