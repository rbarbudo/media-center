/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mc.music.data;

/**
 *
 * @author i22balur
 */
public class SongInfo {

    public String getAlbum() {
        return album;
    }

    public String getArtist() {
        return artist;
    }

    public Boolean getIsLocal() {
        return isLocal;
    }

    public String getName() {
        return name;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setIsLocal(Boolean isLocal) {
        this.isLocal = isLocal;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String album;
    
    private String artist;

    private Boolean isLocal;
    
    private String name;
    
    public SongInfo(String name, String album, String artist, Boolean isLocal) {
        this.name = name;
        this.album = album;
        this.artist = artist; 
        this.isLocal = isLocal;
    }

}
