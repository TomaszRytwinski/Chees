package com.capgemini.Chees;

public class King implements Chessman {
	private String color="";
	public King(String color){
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
		return King.class.getName() + " " + color;
	}

}
