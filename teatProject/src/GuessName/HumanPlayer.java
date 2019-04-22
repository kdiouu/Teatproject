package GuessName;

import java.util.Scanner;
public class HumanPlayer extends Player {
	Scanner scanner = new Scanner(System.in);
	@Override
	protected String nameSelf() {

		// TODO Auto-generated method stub
		return "請輸入名字";
	}

	@Override
	protected String getPlayerType() {
		// TODO Auto-generated method stub
		return "玩家";
	}

	@Override
	protected int guess(int min, int max) {
		// TODO Auto-generated method stub
		return scanner.nextInt() ;
	}
	
}
