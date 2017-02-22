package com.capgemini.Chees;

public class Board {
	private Chessman[][] chessBoard;
	private boolean[][] isWhite;
	public Board(){
		chessBoard = new Chessman[8][8];
		boolean white = false;
		isWhite= new boolean[8][8];
		int j=0;
		int i=0;
		for(i=0;i<8;i++){
			if (i>0 && isWhite[i-1][0]==false){
				white=true;
			}else{
				white=false;
			}
			for(j=0;j<8;j++){
				chessBoard[i][j]= new EmptyChessman();
				isWhite[i][j]=white;
				if (white==false){
					white=true;
				}else{
					white=false;
				}
			}
		}
	}
	public void setBeginingState(){
		setWhitePawns();
		setWhiteRocks();
		setWhiteKnights();
		setWhiteBishops();
		setWhiteQueen();
		setWhiteKing();
		setBlackPawns();
		setBlackRocks();
		setBlackKnights();
		setBlackBishops();
		setBlackQueen();
		setBlackKing();
	}
	public void setCheckStateToWhite(){
		Field from = new Field(7,7);
		Field to = new Field(5,4);
		setWhiteRocks();
		setWhiteKnights();
		setWhiteBishops();
		setWhiteQueen();
		setWhiteKing();
		setBlackRocks();
		MoveChessmanFromTo(from,to);
		setBlackKnights();
		setBlackBishops();
		setBlackQueen();
		setBlackKing();
	}
	public void MoveChessmanFromTo(Field from, Field to){
		chessBoard[to.getY()][to.getX()] = getChessmanXY(from.getY(),from.getX());
		chessBoard[from.getY()][from.getX()] = new EmptyChessman();
	}
	public boolean getIsWhite(int x,int y){
		return isWhite[x][y];
	}
	public Chessman getChessmanXY(int x, int y){
		return chessBoard[x][y];
	}
	public boolean isBoardXYempty(int y, int x){
		if (chessBoard[y][x].toString().equals("Empty")){
			return true;
		}else{
			return false;
		}
			
	}
	public static boolean checkOutOfBoard(Field f, int toY, int toX){
		return (checkYOutOfBoard(f.getY(),toY) && checkXOutOfBoard(f.getX(),toX));
	}
	private static boolean checkXOutOfBoard(int fromX, int toX){
		if(fromX+toX>=0 && fromX+toX<=7){
			
			return true;
		}else {
			return false;
		}
	}
	private static boolean checkYOutOfBoard(int fromY, int toY){
		if(fromY+toY>=0 &&fromY+toY<=7){
			return true;
		}else {
			return false;
		}
	}
	private void setWhitePawns(){
		for(int i=0;i<8;i++){
			putChessman(new Pawn("WHITE"),1,i);
		}
	}
	private void setBlackPawns(){
		for(int i=0;i<8;i++){
			putChessman(new Pawn("BLACK"),6,i);
		}
	}
	private void setWhiteBishops(){
		putChessman(new Bishop("WHITE"),0,2);
		putChessman(new Bishop("WHITE"),0,5);
	}
	private void setBlackBishops(){
		putChessman(new Bishop("BLACK"),7,2);
		putChessman(new Bishop("BLACK"),7,5);
	}
	private void setWhiteKnights(){
		putChessman(new Knight("WHITE"),0,1);
		putChessman(new Knight("WHITE"),0,6);
	}
	private void setBlackKnights(){
		putChessman(new Knight("BLACK"),7,1);
		putChessman(new Knight("BLACK"),7,6);
	}
	private void setWhiteRocks(){
		putChessman(new Rock("WHITE"),0,0);
		putChessman(new Rock("WHITE"),0,7);
	}
	private void setBlackRocks(){
		putChessman(new Rock("BLACK"),7,0);
		putChessman(new Rock("BLACK"),7,7);
	}
	private void setWhiteQueen(){
		putChessman(new Queen("WHITE"),0,3);
	}
	private void setBlackQueen(){
		putChessman(new Queen("BLACK"),7,3);
	}
	private void setWhiteKing(){
		putChessman(new King("WHITE"),0,4);
	}
	private void setBlackKing(){
		putChessman(new King("BLACK"),7,4);
	}
	private void putChessman(Chessman chessman, int x, int y){
		chessBoard[x][y]=chessman;
	}
	
}
