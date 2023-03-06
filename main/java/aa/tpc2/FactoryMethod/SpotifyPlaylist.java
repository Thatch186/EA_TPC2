package main.java.aa.tpc2.FactoryMethod;

public class SpotifyPlaylist implements Playlist {

    @Override
    public void play() {
        System.out.println("Playing a Spotify playlist.");
    }

}