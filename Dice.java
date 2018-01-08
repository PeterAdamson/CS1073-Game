//Author Peter Adamson

import java.util.Random;

public class Dice 
{
	
	public static int roll(int num)
	{	
		Random gen = new Random();
		int result = gen.nextInt(num) + 1;
		return result;
		
	 	
	} 	


}
