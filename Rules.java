//Author Peter Adamson

public class Rules{
	private int nSides = 6;
	private int nTurns = 3;
	private int nDice = 2;

	public Rules(int s, int t, int d){
		nSides = s;
		nTurns = t;
		nDice = d;

	}

	public Rules(){

	}

	public int getSides(){
		return nSides;
	}

	public int getTurns(){
		return nTurns;
	}

	public int getDice(){
		return nDice;
	}

	public String toString(){
		String rules = String.valueOf(nTurns) + " turns " + String.valueOf(nDice) + " rolls/turn " + String.valueOf(nSides) + "-sided dice";
		return rules;
	}

}
