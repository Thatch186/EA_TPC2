package aa.tpc2.Objects;

import java.util.List;
import java.util.Objects;

public class Playlist {
    private String name;
    private List<Song> playlist;


    public Playlist() {
    }

    public Playlist(String name, List<Song> playlist) {
        this.name = name;
        this.playlist = playlist;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Song> getPlaylist() {
        return this.playlist;
    }

    public void setPlaylist(List<Song> playlist) {
        this.playlist = playlist;
    }

    public Playlist name(String name) {
        setName(name);
        return this;
    }

    public Playlist playlist(List<Song> playlist) {
        setPlaylist(playlist);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Playlist)) {
            return false;
        }
        Playlist playlist = (Playlist) o;
        return Objects.equals(name, playlist.name) && Objects.equals(playlist, playlist.playlist);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, playlist);
    }

    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", playlist='" + getPlaylist() + "'" +
            "}";
    }

}
