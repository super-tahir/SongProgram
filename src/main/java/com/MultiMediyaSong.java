package com;

import java.util.Random;
import java.util.Scanner;

import javax.sound.sampled.Clip;

public class MultiMediyaSong {
	@SuppressWarnings("resource")
	public static void sonplay() throws Exception {
	Scanner sc = new Scanner(System.in);
	int choice = 0;
	Clip clip_Object;
	PlaySongAsChoice p = new PlaySongAsChoice(1);
	clip_Object = p.getClip_Object();
	while (true) {
		MsgClass.msg();

		choice = sc.nextInt();
		if (choice == 1) {
			clip_Object.start();
		}

		else if (choice == 2) {

			Random r = new Random();
			int ran = r.nextInt(1, 5);
			System.out.println(ran);
			clip_Object.stop();
			clip_Object.flush();
			clip_Object.stop();
			p = new PlaySongAsChoice(ran);
			clip_Object = p.getClip_Object();
			clip_Object.start();
			

		}
		
	else if(choice==3) {
		if(clip_Object.isActive()) {
			clip_Object.stop();
		}
		else {
			System.out.println("jab koi song play hai hi nahi to stop lora kr rhe ho");
		}
	}//else if block close
		
	else if(choice==4) {
		
		
		clip_Object.start();
	}	
       
  if(choice==0) {
	  break;
  }		
	}// while block hai
	
	}//mtehod

}//Class
