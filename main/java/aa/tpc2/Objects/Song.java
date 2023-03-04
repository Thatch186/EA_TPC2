package aa.tpc2.Objects;

import java.util.Objects;

public class Song {
    private String name;
    private String artist;
    private String album;


    public Song() {
    }

    public Song(String name, String artist, String album) {
        this.name = name;
        this.artist = artist;
        this.album = album;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtist() {
        return this.artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getAlbum() {
        return this.album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public Song name(String name) {
        setName(name);
        return this;
    }

    public Song artist(String artist) {
        setArtist(artist);
        return this;
    }

    public Song album(String album) {
        setAlbum(album);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Song)) {
            return false;
        }
        Song music = (Song) o;
        return Objects.equals(name, music.name) && Objects.equals(artist, music.artist) && Objects.equals(album, music.album);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, artist, album);
    }

    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", artist='" + getArtist() + "'" +
            ", album='" + getAlbum() + "'" +
            "}";
    }


}
