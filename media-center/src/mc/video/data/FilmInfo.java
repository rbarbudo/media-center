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
public class FilmInfo {
    
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public ImageIcon getPhoto() {
        return photo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPhoto(ImageIcon photo) {
        this.photo = photo;
    }
    
    String name;
    
    String description;
    
    ImageIcon photo;    
    
}
