package com.capgemini.Chees;
/**
 * Class Queen
 * It is possible only to create object that is WHITE or BLACK
 */
public class Queen implements Chessman {
	private String color="";
	public Queen(String color){
		if(color=="WHITE" || color=="BLACK"){
			this.color=color;			
		}else{
			this.color="WHITE";
		}
	}
	/**
	Return color of Queen
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
		return Queen.class.getName() + " " + color;
	}

}
