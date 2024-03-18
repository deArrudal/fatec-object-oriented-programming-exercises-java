package view;

import model.Music;
import model.Playlist;

public class Main {
    public static void main(String[] args) {
        Music music1 = new Music();
        music1.setMusicName("1957");
        music1.setMusicArtist("Milo Greene");
        music1.setMusicRecord("Songkick");

        Music music2 = new Music();
        music2.setMusicName("Sleep on the floor");
        music2.setMusicArtist("The Lumineers");
        music2.setMusicRecord("Clubhouse Recording Studios");

        Music music3 = new Music();
        music3.setMusicName("Budapest");
        music3.setMusicArtist("George Ezra");
        music3.setMusicRecord("Sony");

        Playlist playlist = new Playlist();
        playlist.setPlaylistAuthor("User");
        playlist.addMusic(music1);
        playlist.addMusic(music2);
        playlist.addMusic(music3);

        System.out.printf("Playlist\nAuthor: %s\n", playlist.getPlaylistAuthor());
        playlist.playPlaylist();
        playlist.playPlaylistRandom();

    }
}
