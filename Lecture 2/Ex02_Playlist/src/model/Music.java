package model;

public class Music {
    private String musicName = "";
    private String musicArtist = "";
    private String musicRecord = "";

    public Music() {
        super();
    }

    public String getMusicName() {
        return musicName;
    }

    public void setMusicName(String musicName) {
        this.musicName = musicName;
    }

    public String getMusicArtist() {
        return musicArtist;
    }

    public void setMusicArtist(String musicArtist) {
        this.musicArtist = musicArtist;
    }

    public String getMusicRecord() {
        return musicRecord;
    }

    public void setMusicRecord(String musicRecord) {
        this.musicRecord = musicRecord;
    }

}
