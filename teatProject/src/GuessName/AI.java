package GuessName;

public abstract class AI extends Player {
	private static int amount = 0;
	
	public AI() {
		amount++;
	}
	protected String nameSelf() {
		return "AI "+String.valueOf(amount++);
	}
}
