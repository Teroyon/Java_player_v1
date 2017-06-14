package com.music.player;
import java.io.*;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.*;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;


public class music_player {

    public static void main(String[] args){

    //MP3 Player
/*
        try {
            File file = new File("R:/Coding/JAVA/Music Player/src/test.mp3");
            FileInputStream fis = new FileInputStream(file);
            BufferedInputStream bis = new BufferedInputStream(fis);

            try {
                Player player_m = new Player(bis);
                player_m.play();
            }
            catch (JavaLayerException ex){}

        }catch (IOException e){}

    }
    //WAV PLAYER
*/
/*

        File sound = new File("R:/Coding/JAVA/Music Player/src/test2.wav");

        try {
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(sound));
            clip.start();

            Thread.sleep(clip.getMicrosecondLength()/1000);


        }catch (Exception e){}

*/

}
