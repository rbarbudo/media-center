/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mc.image.data;

import mc.video.data.*;
import javax.swing.ImageIcon;

/**
 *
 * @author i22balur
 */
public class ImageInfo {
    
    public String getName() {
        return name;
    }

    public ImageIcon getPhoto() {
        return photo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoto(ImageIcon photo) {
        this.photo = photo;
    }
    
    String name;
        
    ImageIcon photo;      
}
