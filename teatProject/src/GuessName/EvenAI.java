package GuessName;

import java.util.Scanner;

public class EvenAI extends AI {
	Scanner scan = new Scanner(System.in);
	@Override
	protected String getPlayerType() {
		// TODO Auto-generated method stub
		return "偶數AI";
	}

	@Override
	protected int guess(int min, int max) {
		if (max == min) {
			return max;
		}
		int rand;
		do {
			rand = scan.nextInt(max - min) + min;
		} while (rand % 2 != 0 || rand < min || rand > max);
		return rand;
	}

}
