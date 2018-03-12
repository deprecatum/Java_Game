package stupidGame;

import java.awt.image.BufferedImage;
import java.util.ArrayList;

import stupidGame.entities.enemy;
import stupidGame.entities.mainChar;

public class logic implements Runnable {
	
	BufferedImage bufferedFrame = new BufferedImage(Shared.frameWidth, Shared.frameHeight, BufferedImage.TYPE_INT_RGB);
	
	ArrayList<enemy> enemyList;
	
	mainChar pc;
	
	logic(mainChar c){
		pc=c;
		
		//potato.add();
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			tick();
		}
	}
	
	int timer=0;
	
	//1 sec = 1000 ms
	//1 ms = 1 000 000 ns
	
	long nano = 1000000;
	
	long currentMilli, prevSec = System.nanoTime()/nano, prevMilli = System.nanoTime()/nano;
	long fps = 1000/10; //10fps
	
	public void tick(){
		currentMilli=System.nanoTime()/nano;
		
		if(currentMilli-prevMilli>=fps){
			//logic shit
			timer++;
			prevMilli=currentMilli;
		}
		if(currentMilli-prevSec>=1000){
			System.out.println("Ticks: " + timer);
			timer=0;
			prevSec=currentMilli;
		}	
	}
}
