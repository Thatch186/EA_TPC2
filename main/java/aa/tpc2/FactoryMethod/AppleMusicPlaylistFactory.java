package main.java.aa.tpc2.FactoryMethod;

public class AppleMusicPlaylistFactory implements PlaylistFactory {

    @Override
    public Playlist createPlaylist() {
        return new AppleMusicPlaylist();
    }

}