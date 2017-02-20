package com.capgemini.Chees;

public class Pawn implements Chessman {
	private String color="";
	public Pawn(String color){
		if(color=="WHITE" || color=="BLACK"){
			this.color=color;			
		}else{
			this.color="WHITE";
		}
	}
	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return color;
	}

	@Override
	public String toString(){
		return Pawn.class.getName() + " " + color;
	}
}
