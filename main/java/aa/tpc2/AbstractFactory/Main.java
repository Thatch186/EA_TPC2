package aa.tpc2.AbstractFactory;

public class Main {
    public static void main(String[] args) {
        Client client1 = new Client(new SpotifyMusicFactory());
        client1.playAlbum();
        client1 = new Client(new AppleMusicFactory());
        client1.playAlbum();

        Client client2 = new Client(new SpotifyMusicFactory());
        client2.playPlaylist();
        client2 = new Client(new AppleMusicFactory());
        client2.playPlaylist();
    }
}