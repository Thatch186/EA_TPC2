package aa.tpc2.AbstractFactory;

public class SpotifyMusicFactory implements MusicFactory{

    @Override
    public Album createAlbum() {
        return new SpotifyAlbum();
    }

    @Override
    public Playlist createPlaylist() {
       return new SpotifyPlaylist();
    }   
}
