package main.java.aa.tpc2.FactoryMethod;

public class Main {
    public static void main(String[] args) {
        Client client1 = new Client(new SpotifyAlbumFactory(),new SpotifyPlaylistFactory());
        client1.playAlbum();
        client1.playPlaylist();

        Client client2 = new Client(new AppleMusicAlbumFactory(),new AppleMusicPlaylistFactory());
        client2.playPlaylist();
        client2.playAlbum();
    }
}