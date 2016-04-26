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
    
        
        ImageInfo img1 = new ImageInfo();
        img1.setName("Playa");
        img1.setPhoto(new javax.swing.ImageIcon(getClass().getResource("/mc/image/beach.jpg")));
        images.add(img1);
        
        ImageInfo img2 = new ImageInfo();
        img2.setName("Campo");
        img2.setPhoto(new javax.swing.ImageIcon(getClass().getResource("/mc/image/campo.jpg")));
        images.add(img2);
        
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
