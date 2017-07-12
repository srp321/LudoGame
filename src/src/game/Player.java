package src.game;

public class Player {

	private String color;
	private int numberRolled;
	private boolean hasRolledSix;
	private Piece[] piece;

	Player(String color) {

		this.color = color;
		piece = new Piece[4];

		for (int i = 0; i < 4; i++)
			piece[i] = new Piece(i, color);
	}

	void rollDice() {

		// Get the value when a Dice is rolled
		numberRolled = new Dice().roll();
		if (numberRolled == 6)
			hasRolledSix = true;
		else
			hasRolledSix = false;
	}

	Piece getPiece(int pieceNumber) {
		return piece[pieceNumber];
	}

	String getColor() {
		return color;
	}

	int getNumberRolled() {
		return numberRolled;
	}

	boolean hasRolledSix() {
		return hasRolledSix;
	}

	@Override
	public String toString() {
		return "Player " + color;
	}

	boolean hasWon() {

		// If any piece is not completed, will return false
		for (int i = 0; i < 4; i++)
			if (!piece[i].isCompleted())
				return false;
		// Otherwise true
		return true;
	}
}