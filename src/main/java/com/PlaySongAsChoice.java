package com;

import java.io.File;
import java.util.Random;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;


public class PlaySongAsChoice extends Thread {
	
	private Clip clip_Object;
   
  public PlaySongAsChoice(int num) throws Exception {
	 
	 File  fis = new File("D:\\mp3\\"+num+".wav");
	 AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(fis);
	 
	 clip_Object = AudioSystem.getClip();
	 clip_Object.open(audioInputStream);
	 
  }

  
  public PlaySongAsChoice() throws Exception {
		 
		 File  fis = new File("D:\\mp3\\1.wav");
		 AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(fis);
		 
		 clip_Object = AudioSystem.getClip();
		 clip_Object.open(audioInputStream);
		 
	  }
  
  
    public Clip getClip_Object() {
	return clip_Object;
    }


  
   
  
  

}
