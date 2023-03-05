package main.java.aa.tpc2.FactoryMethod;

public class SpotifyAlbum implements Album {

    @Override
    public void play() {
        System.out.println("Playing a Spotify album.");
    }

}