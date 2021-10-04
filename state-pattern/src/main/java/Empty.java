

public class Empty extends PlayerState {

	public Empty(Player player) {
		super(player);
		System.out.println("Player: I'm empty");
	}

	@Override
	public void playPause() {
		System.out.println("Player: I have no music to play/pause :(");
	}

	@Override
	public void reset() {
		System.out.println("Player: I'm already empty :|");
	}

}
