package com.capgemini.Chees;
/**
 * Class Rock
 * It is possible only to create object that is WHITE or BLACK
 */
public class Rock implements Chessman {
	private String color="";
	public Rock(String color){
		if(color=="WHITE" || color=="BLACK"){
			this.color=color;			
		}else{
			this.color="WHITE";
		}
	}
	/**
	Return color of Rock
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
		return Rock.class.getName() + " " + color;
	}

}
