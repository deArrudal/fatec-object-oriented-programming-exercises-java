package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Playlist {
    private ArrayList<Music> playlistMusics;
    private String playlistAuthor;

    public Playlist() {
        super();
        playlistMusics = new ArrayList<>();
    }

    public String getPlaylistAuthor() {
        return playlistAuthor;
    }

    public void setPlaylistAuthor(String playlistAuthor) {
        this.playlistAuthor = playlistAuthor;
    }

    public void addMusic(Music music) {
        playlistMusics.add(music);
    }

    public void playPlaylist() {
        for (Music music : playlistMusics) {
            System.out.printf("Playing: %s\n", music.getMusicName());
        }
    }

    public void playPlaylistRandom() {
        ArrayList<Music> tmp = playlistMusics;

        Collections.shuffle(tmp, new Random());

        for (Music music : playlistMusics) {
            System.out.printf("Playing: %s\n", music.getMusicName());
        }
    }

}
