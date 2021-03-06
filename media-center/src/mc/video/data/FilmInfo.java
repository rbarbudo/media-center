/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mc.video.data;

import javax.swing.ImageIcon;
import mc.KindMedia;

/**
 *
 * @author i22balur
 */
public class FilmInfo 
{  
    /********************************************************
     * -------------------------------------------- Variables
     *******************************************************/
    
    private String name;
    
    private String description;
    
    private ImageIcon photo;    
        
    private KindMedia kind;
    
    public FilmInfo() {
        
    }
     
    /********************************************************
     * --------------------------------------- Constructores
     *******************************************************/
    
    public FilmInfo(String name, String description, String photoPath, KindMedia kind) {
        this.name = name;
        this.description = description;
        this.photo = new javax.swing.ImageIcon(getClass().getResource(photoPath));
        this.kind = kind;
    }

    /********************************************************
     * ---------------------------------------------- Métodos
     *******************************************************/
    
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
 
}