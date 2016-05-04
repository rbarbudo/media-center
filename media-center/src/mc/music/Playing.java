/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mc.music;

import java.io.FileInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

/**
 *
 * @author i22balur
 */
public class Playing implements Runnable{

    private Player mp3Player;
    private Thread playerThread;


    public void createPlayer(FileInputStream file) throws JavaLayerException{

        mp3Player = new Player(file);

        playerThread = new Thread(this);
        playerThread.start();
    }

    public void run(){

        try {
            mp3Player.play();
        } 
        catch (JavaLayerException ex) {
                Logger.getLogger(Playing.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
