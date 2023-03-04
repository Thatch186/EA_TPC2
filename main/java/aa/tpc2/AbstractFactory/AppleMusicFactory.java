package aa.tpc2.AbstractFactory;

import aa.tpc2.Objects.Song;

public class AppleMusicFactory implements MusicFactory{

    @Override
    public void playMusic(Song s) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'playMusic'");
    }

    @Override
    public void createPlaylist(String name) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createPlaylist'");
    }

    @Override
    public void addToPlaylist(Song s) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addToPlaylist'");
    }
    
}
