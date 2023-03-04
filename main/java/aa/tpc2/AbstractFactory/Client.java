package aa.tpc2.AbstractFactory;

public class Client {
    private MusicFactory factory;
    private Album a;
    private Playlist p;

    public Client(MusicFactory factory){
        this.factory = factory;
        a = this.factory.createAlbum();
        p = this.factory.createPlaylist();
    }

    public void playAlbum() {
        a.play();
    }

    public void playPlaylist() {
        p.play();
    }
}
