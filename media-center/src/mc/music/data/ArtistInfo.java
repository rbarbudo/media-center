/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mc.music.data;

import javax.swing.ImageIcon;
import mc.KindMedia;

/**
 *
 * @author i22balur
 */
public class ArtistInfo {
    
    String name;
    
    String description;
    
    ImageIcon photo;
       
    KindMedia kind;

    
    public ArtistInfo()
    {
        
    }
    
    public ArtistInfo(String name, String description, String photoPath, KindMedia kind) 
    {
        this.name = name;
        this.description = description;
        this.photo = new javax.swing.ImageIcon(getClass().getResource(photoPath));
        this.kind = kind;
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

    public void setKind(KindMedia kind) 
    {
        this.kind = kind;
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

    public KindMedia getKind() 
    {
        return kind;
    }

}
