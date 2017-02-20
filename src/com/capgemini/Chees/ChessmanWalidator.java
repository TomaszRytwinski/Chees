package com.capgemini.Chees;

public class ChessmanWalidator {
	public static boolean checkMove(Chessman chessman, Field from, Field to) {
		switch (chessman.toString()) {
		case ("com.capgemini.Chees.Pawn WHITE"):
			try {
				return checkWhitePawnMove(from, to);
			} catch (IllegalStateException e) {
				return false;
			}
		case ("com.capgemini.Chees.Pawn BLACK"):
			try {
				return checkBlackPawnMove(from, to);
			} catch (IllegalStateException e) {
				return false;
			}
		case ("com.capgemini.Chees.King BLACK"):
			try {
				return checkKingMove(from, to);
			} catch (IllegalStateException e) {
				return false;
			}
		case ("com.capgemini.Chees.King WHITE"):
			try {
				return checkKingMove(from, to);
			} catch (IllegalStateException e) {
				return false;
			}
		case ("com.capgemini.Chees.Bishop WHITE"):
			try {
				return checkBishopMove(from, to);
			} catch (IllegalStateException e) {
				return false;
			}
		case ("com.capgemini.Chees.Bishop BLACK"):
			try {
				return checkBishopMove(from, to);
			} catch (IllegalStateException e) {
				return false;
			}
		case ("com.capgemini.Chees.Rock BLACK"):
			try {
				return checkRockMove(from, to);
			} catch (IllegalStateException e) {
				return false;
			}
		case ("com.capgemini.Chees.Rock WHITE"):
			try {
				return checkRockMove(from, to);
			} catch (IllegalStateException e) {
				return false;
			}
		case ("com.capgemini.Chees.Queen WHITE"):
			try {
				return checkQueenMove(from, to);
			} catch (IllegalStateException e) {
				return false;
			}
		case ("com.capgemini.Chees.Queen BLACK"):
			try {
				return checkQueenMove(from, to);
			} catch (IllegalStateException e) {
				return false;
			}
		case ("com.capgemini.Chees.Knight BLACK"):
			try {
				return checkKnightMove(from, to);
			} catch (IllegalStateException e) {
				return false;
			}
		case ("com.capgemini.Chees.Knight WHITE"):
			try {
				return checkKnightMove(from, to);
			} catch (IllegalStateException e) {
				return false;
			}
		}
		return false;
	}

	public static boolean checkTheWay(Board board, Field from, Field to, String color) {
		boolean free = true;
		int i, j;
		if (from.getX() == to.getX() && from.getY() == to.getY()) {
			throw new IllegalStateException();
		}
		j = from.getX();
		i = from.getY();
		do {
			if (!(from.getX() == j && from.getY() == i) || (to.getX() == j && to.getY() == i)) {
				if (board.getChessmanXY(i, j).toString() != "Empty") {
					free = false;
				}
			}
			i = counter(i, to.getY());
			j = counter(j, to.getX());
		} while (!(j == to.getX() || to.getY() == j));
		if (!board.isBoardXYempty(to.getY(), to.getX())) {
			if (board.getChessmanXY(to.getY(), to.getX()).getColor().equals(color)) {
				free = false;
			}
		}
		return free;
	}

	public static boolean checkTheWayPawn(Board board, Field from, Field to, String color) {
		boolean free = true;
		int i, j;
		if (from.getX() == to.getX() && from.getY() == to.getY()) {
			throw new IllegalStateException();
		}
		j = from.getX();
		i = from.getY();
		if (from.getX() == from.getY()) {
			do {
				if (!(from.getX() == j && from.getY() == i)) {
					if (board.getChessmanXY(i, j).toString() != "Empty") {
						free = false;
					}
				}
				i = counter(i, to.getY());
				j = counter(j, to.getX());
			} while (!(j == to.getX() || to.getY() == j));
		} else {
			if (!board.isBoardXYempty(to.getY(), to.getX())) {
				if (board.getChessmanXY(to.getY(), to.getX()).getColor().equals(color)) {
					free = false;
				}else{
					free = false;
				}
			}
		}

		return free;
	}


	public static boolean checkTheWayKinght(Board board, Field to, String color) {
		boolean allow = true;
		int x = to.getX();
		int y = to.getY();
		if (board.isBoardXYempty(y, x)) {
			return allow;
		} else if (board.getChessmanXY(to.getY(), to.getX()).getColor().equals(color)) {
			return false;
		}
		return false;
	}

	private static int counter(int i, int condition) {
		if (i < condition) {
			i++;
		} else if (i > condition) {
			i--;
		}
		return i;
	}

	private static boolean checkKnightMove(Field from, Field to) throws IllegalStateException {
		if (from.getX() == to.getX() && from.getY() == to.getY()) {
			throw new IllegalStateException();
		} else if ((Math.abs(from.getX() - to.getX()) == 2) && (Math.abs(from.getY() - to.getY()) == 1)) {
			return true;
		} else if ((Math.abs(from.getY() - to.getY()) == 2) && (Math.abs(from.getX() - to.getX()) == 1)) {
			return true;
		}
		return false;
	}

	private static boolean checkQueenMove(Field from, Field to) throws IllegalStateException {
		if (checkRockMove(from, to))
			return true;
		if (checkBishopMove(from, to))
			return true;
		if (checkKingMove(from, to))
			return true;
		return false;
	}

	private static boolean checkRockMove(Field from, Field to) throws IllegalStateException {
		if (from.getX() == to.getX() && from.getY() == to.getY()) {
			throw new IllegalStateException();
		} else if (from.getX() == to.getX()) {
			return true;
		} else if (from.getY() == to.getY()) {
			return true;
		} else
			return false;
	}

	private static boolean checkBishopMove(Field from, Field to) throws IllegalStateException {
		if (from.getX() == to.getX() && from.getY() == to.getY()) {
			throw new IllegalStateException();
		}
		if (Math.abs(from.getX() - to.getX()) == Math.abs(from.getY() - to.getY())) {
			return true;
		}
		return false;
	}

	private static boolean checkKingMove(Field from, Field to) throws IllegalStateException {
		if (from.getX() == to.getX() && from.getY() == to.getY()) {
			throw new IllegalStateException();
		}
		if ((Math.abs(from.getX() - to.getX()) <= 1) && (Math.abs(from.getX() - to.getX()) >= 0)
				&& (Math.abs(from.getY() - to.getY()) <= 1) && (Math.abs(from.getY() - to.getY()) >= 0)) {
			return true;
		}
		return false;
	}

	private static boolean checkWhitePawnMove(Field from, Field to) throws IllegalStateException {
		if (from.getX() == to.getX()) {
			if ((to.getY() - from.getY() <= 2) && (to.getY() - from.getY() > 0)) {
				if (to.getY() - from.getY() == 1) {
					return true;
				} else if (to.getY() - from.getY() == 2) {
					if (to.getY() <= 3) {
						return true;
					} else {
						throw new IllegalStateException("Z tego polozenie nie mozna przesunac sie o 2");
					}
				}
			} else {
				throw new IllegalStateException("Nie prawidlowa dlugosc ruchu");
			}
		} else if (Math.abs(from.getX() - to.getX()) == 1 && (to.getY() - from.getY() == 1)) {
			return true;
		} else {
			throw new IllegalStateException("Nie mozna poruszac sie pionkiem w X");
		}
		return false;
	}

	private static boolean checkBlackPawnMove(Field from, Field to) throws IllegalStateException {
		if (from.getX() == to.getX()) {
			if ((from.getY() - to.getY() <= 2) && (from.getY() - to.getY() > 0)) {
				if (from.getY() - to.getY() == 1) {
					return true;
				} else if (from.getY() - to.getY() == 2) {
					if (to.getY() >= 4) {
						return true;
					} else {
						throw new IllegalStateException("Z tego polozenie nie mozna przesunac sie o 2");
					}
				}
			} else if (Math.abs(from.getX() - to.getX()) == 1 && (from.getY() - to.getY() == 1)) {
				return true;
			} else {
				throw new IllegalStateException("Nie prawidlowa dlugosc ruchu");
			}
		} else {
			throw new IllegalStateException("Nie mozna poruszac sie pionkiem w X");
		}
		return false;
	}
}
