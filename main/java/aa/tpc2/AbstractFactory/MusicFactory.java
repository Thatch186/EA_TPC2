package aa.tpc2.AbstractFactory;

import aa.tpc2.Objects.Song;

/**
 * MusicFactory
 */
public interface MusicFactory {
    public void playMusic(Song s);
    public void createPlaylist(String name);
    public void addToPlaylist(Song s);
}