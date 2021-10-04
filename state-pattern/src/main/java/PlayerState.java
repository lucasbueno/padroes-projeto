

public abstract class PlayerState {

	private Player player;

	public PlayerState(Player player) {
		super();
		this.player = player;
	}
	
	public abstract void playPause();
	
	public abstract void reset();

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

}
