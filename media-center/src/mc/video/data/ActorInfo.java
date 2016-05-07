/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mc.video.data;

import javax.swing.ImageIcon;

/**
 *
 * @author i22balur
 */
public class ActorInfo 
{  
    /********************************************************
     * -------------------------------------------- Variables
     *******************************************************/
    
    private String name;
    
    private String description;
    
    private ImageIcon photo;    
    
    private String film;
    
    private String character;
     
    /********************************************************
     * --------------------------------------- Constructores
     *******************************************************/
    
    public ActorInfo() {
        
    }
    
    public ActorInfo(String name, String description, String photoPath, String film, String character) {
        this.name = name;
        this.description = description;
        this.photo = new javax.swing.ImageIcon(getClass().getResource(photoPath));
        this.film = film;
        this.character = character;
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

    public String getFilm() 
    {
        return film;
    }
    
    public String getCharacter() 
    {
        return character;
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
  
    public void setFilm(String film) 
    {
        this.film = film;
    }
 
    public void setCharacter(String character) 
    {
        this.character = character;
    }
}