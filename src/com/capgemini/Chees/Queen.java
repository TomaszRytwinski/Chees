package com.capgemini.Chees;

public class Queen implements Chessman {
	private String color="";
	public Queen(String color){
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
		return Queen.class.getName() + " " + color;
	}

}