package aa.tpc2.AbstractFactory;

public class AppleMusicFactory implements MusicFactory{
 
    @Override
    public Album createAlbum() {
        return new AppleMusicAlbum();
    }

    @Override
    public Playlist createPlaylist() {
        return new AppleMusicPlaylist();
    }
}
    

