package main.java.aa.tpc2.FactoryMethod;

public class SpotifyAlbumFactory implements AlbumFactory {

    @Override
    public Album createAlbum() {
        return new SpotifyAlbum();
    }

}