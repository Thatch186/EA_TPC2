package main.java.aa.tpc2.FactoryMethod;

public class SpotifyPlaylistFactory implements PlaylistFactory {

    @Override
    public Playlist createPlaylist() {
        return new SpotifyPlaylist();
    }

}