package main.java.aa.tpc2.FactoryMethod;

public class AppleMusicAlbumFactory implements AlbumFactory {

    @Override
    public Album createAlbum() {
        return new AppleMusicAlbum();
    }

}