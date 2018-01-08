//Author Peter Adamson

import java.util.Arrays;

public class GameDriver{

	public static void main(String[] args){
	
		Rules r = new Rules();		
		Player p1 = new Player(r);
		Player p2 = new Player(r);

		for(int n = 1; n <= r.getTurns(); n++){
			p1.play(n);
			p2.play(n);
		}
		
		p1.setBonus(Dice.roll(r.getSides()));
		p2.setBonus(Dice.roll(r.getSides()));

		int[][] results1 = p1.getTurns();
		int[][] results2 = p2.getTurns();

		System.out.println(r.toString());
		System.out.println(p1.toString());
		for(int i = 0; i < r.getTurns(); i++){
			System.out.printf("Turn %d: %s %n", i + 1, Arrays.toString(results1[i]));
		}
		System.out.printf("Score: %d includes %d bonus(bonus roll was %d)%n", p1.getScore(), p1.getBonus(), p1.getIndex());
		System.out.println();

		System.out.println(p2.toString());
		for(int i = 0; i < r.getTurns(); i++){
			System.out.printf("Turn %d: %s %n", i + 1, Arrays.toString(results2[i]));
		}
		System.out.printf("Score: %d includes %d bonus(bonus roll was %d)%n", p2.getScore(), p2.getBonus(), p2.getIndex());
		
	}

}
