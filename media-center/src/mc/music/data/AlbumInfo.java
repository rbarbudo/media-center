/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mc.music.data;

import javax.swing.ImageIcon;

/**
 *
 * @author i22balur
 */

public class AlbumInfo {
    
    String name;
    
    String description;
    
    ImageIcon photo; 
    
    String artist;
    
    public AlbumInfo() 
    {
        
    }
    
    public AlbumInfo(String name, String description, String photoPath, String artist) 
    {
        this.name = name;
        this.description = description;
        this.photo = new javax.swing.ImageIcon(getClass().getResource(photoPath));;
        this.artist = artist;
    }
    
    public String getName() 
    {
        return name;
    }

    public String getDescription() 
    {
        return description;
    }

    public ImageIcon getPhoto() 
    {
        return photo;
    }

    public String getArtist() 
    {
        return artist;
    }    
    
    public void setName(String name) 
    {
        this.name = name;
    }

    public void setDescription(String description) 
    {
        this.description = description;
    }

    public void setPhoto(ImageIcon photo) 
    {
        this.photo = photo;
    }
       
    public void setArtist(String artist) 
    {
        this.artist = artist;
    }

}
