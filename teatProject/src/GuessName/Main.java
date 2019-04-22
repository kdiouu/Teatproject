package GuessName;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		GuessGame game = new GuessGame();
		List<Player> players = createPlayers();
		
		System.out.println("順序為 : ");
		for ( Player p : players )
			System.out.print(p.getName());
		System.out.println();
		
		game.createAnswer();
		int turn = 0;
		
		do  
		{
			Player player = players.get(turn);
			System.out.println(game.getMin() + "~" + game.getMax());
			int guess = player.guess(game.getMin(), game.getMax());
			System.out.println(player.getName() + " 猜了" + guess);
			boolean win = game.guess(guess);
			if (win)
				System.out.println(player.getName() + "猜對了 !");
			turn = turn + 1 >= players.size() ? 0 : turn + 1;
			delay();
		}while(!game.isOver());

	}

	private static List<Player> createPlayers(){
		
		List<Player> players = new ArrayList<Player>();
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("輸入幾位現實玩家：");
		int human = scan.nextInt();
		System.out.println("輸入幾位奇數型電腦玩家:");
		int odd = scan.nextInt();
		System.out.println("輸入幾位偶數型電腦玩家: ");
		int even = scan.nextInt();
		for ( int i = 0 ; i < human; i ++ )
			players.add(new HumanPlayer());
		for ( int i = 0 ; i < odd; i ++ )
			players.add(new OddAI());
		for ( int i = 0 ; i < even; i ++ )
			players.add(new EvenAI());
		
		Collections.shuffle(players);
		
		return players;
	}
	
	private static void delay(){
		try {
			Thread.sleep(800);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
