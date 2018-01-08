//Author Peter Adamson

import java.util.Arrays;

public class Player{

	private Rules rules;
	private static int players = 0;
	private int pNumber;
	private int score = 0;
	private int turnScore;
	private int bonus = 0;
	private int index;
	private int[][] turns;
	
	public Player(Rules r){
		rules = r;
		turns = new int[rules.getTurns()][rules.getDice()];
		pNumber = players + 1;
		players++;
	}



	public void play(int turn){

		for(int n = 1; n <= rules.getDice(); n++){
			int value = Dice.roll(rules.getSides());
			turns[turn - 1][n - 1] = value;
		}
		updateScore(turn);
		
	}

	private void updateScore(int turn){
		int[][] temp = turns;
		Arrays.sort(temp[turn - 1]);
		int max = temp[turn - 1][rules.getDice() -1];
		score += max;
		turnScore = max;
	}

	public void setBonus(int roll){
		index = roll;
		int count = 0;
		if(count == 0){
			if(index <= rules.getDice()){
				for(int n = 0; n < rules.getTurns(); n++){
					bonus += turns[n][index - 1];
				}	
			}
			count++;
			score += bonus;
		}
	}

	public int[][] getTurns(){
		return turns;
	}

	public int getScore(){
		return score;
	}

	public int getBonus(){
		return bonus;
	}

	public int getIndex(){
		return index;
	}

	public String toString(){
		String str = "Player " + pNumber + " Results:";
		return str;
	}

}
