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

    public SongInfo(String name, String album ) {
        this.name = name;
        this.album = album;
    }

    
    
    public void setAlbum(String album) {
        this.album = album;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlbum() {
        return album;
    }

    public String getName() {
        return name;
    }
    
    
    private String album;
    
    private String name;
}
