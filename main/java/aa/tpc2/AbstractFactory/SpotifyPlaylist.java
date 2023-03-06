package aa.tpc2.AbstractFactory;

public class SpotifyPlaylist implements Playlist{

    @Override
    public void play() {
        System.out.println("Playing a Spotify playlist.");
    }
    
    
}
