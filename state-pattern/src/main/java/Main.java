
public class Main {

	public static void main(String[] args) {
		Player player = new Player();
		
		player.reset();
		player.playPause();
		
		Music music = new Music ("Programando com foco");
		player.setMusic(music);
		player.reset();
		
		player.setMusic(music);
		player.playPause();
		
		player.playPause();
	}

}
