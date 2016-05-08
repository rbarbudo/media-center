/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mc.image.data;

import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;

/**
 *
 * @author i22balur
 */
public class InitializerImage {

    List<ImageInfo> images = new ArrayList<ImageInfo>();
    
    public InitializerImage() {
   
    }


    public ImageIcon getImagePhoto(String name) {
        
        for(int i=0; i<images.size(); i++) {
            if(images.get(i).name.equals(name)) {
                return images.get(i).getPhoto();
            }
        }
        
        // Never reached
        return null;    
    }
    
}
