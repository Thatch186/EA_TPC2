package aa.tpc2.AbstractFactory;

/**
 * MusicFactory
 */
public interface MusicFactory {
    public Album createAlbum();
    public Playlist createPlaylist();
}