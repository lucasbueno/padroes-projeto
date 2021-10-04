

public class Playing extends PlayerState {

	public Playing(Player player) {
		super(player);
		System.out.println("Player: I'm now playing " + getPlayer().getMusic().getName());
	}

	@Override
	public void playPause() {
		getPlayer().setState(new Paused(getPlayer()));
	}

	@Override
	public void reset() {
		getPlayer().setState(new Empty(getPlayer()));
	}

}
