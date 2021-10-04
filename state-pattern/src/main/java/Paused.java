

public class Paused extends PlayerState{	

	public Paused(Player player) {
		super(player);
		System.out.println("Player: " + getPlayer().getMusic().getName() + " is paused");
	}

	@Override
	public void playPause() {
		getPlayer().setState(new Playing(getPlayer()));
	}

	@Override
	public void reset() {
		getPlayer().setState(new Empty(getPlayer()));
	}

}