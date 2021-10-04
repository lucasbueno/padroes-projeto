

public class Player {
	private Music music;
	private PlayerState state;

	public Player() {
		super();
		this.state = new Empty(this);
	}
	
	public void playPause() {
		state.playPause();
	}
	
	public void reset() {
		state.reset();
	}

	public Music getMusic() {
		return music;
	}

	public void setMusic(Music playlist) {
		this.music = playlist;
		this.setState(new Paused(this));
	}

	public PlayerState getState() {
		return state;
	}

	public void setState(PlayerState state) {
		this.state = state;
	}

}
