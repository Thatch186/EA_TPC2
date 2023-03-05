package main.java.aa.tpc2.FactoryMethod;

public class Client {
    private AlbumFactory albumFactory;
    private PlaylistFactory playlistFactory;
    private Album album;
    private Playlist playlist;

    public Client(AlbumFactory albumFactory, PlaylistFactory playlistFactory) {
        this.albumFactory = albumFactory;
        this.playlistFactory = playlistFactory;
        album = this.albumFactory.createAlbum();
        playlist = this.playlistFactory.createPlaylist();
    }

    public void playAlbum() {
        album.play();
    }

    public void playPlaylist() {
        playlist.play();
    }
}