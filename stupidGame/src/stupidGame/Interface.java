package stupidGame;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

import stupidGame.entities.mainChar;

public class Interface extends JFrame{
	
	gui graph = new gui();
	
	int timer=0;
	
	//1 sec = 1000 ms
	//1 ms = 1 000 000 ns
	
	long nano = 1000000;
	
	long currentMilli, prevSec = System.nanoTime()/nano, prevMilli = System.nanoTime()/nano;
	long fps = 1000/40; //20fps
	
	public void refresh(){
		currentMilli=System.nanoTime()/nano;
		
		if(currentMilli-prevMilli>=fps){
			graph.repaint();
			timer++;
			prevMilli=currentMilli;
		}
		if(currentMilli-prevSec>=1000){
			System.out.println("FPS: " + timer);
			timer=0;
			prevSec=currentMilli;
		}	
	}

	mainChar ddd;
	
	
	private class gui extends JPanel{
		protected void paintComponent(Graphics g){
			super.paintComponent(g);
			g.drawImage(Shared.background, 0, 0, null);
			//g.drawImage(ddd.sprite, 0, 0, null);
		}
		
		gui(){	
			setMaximumSize(new Dimension(Shared.frameWidth, Shared.frameHeight));
			setMinimumSize(new Dimension(Shared.frameWidth, Shared.frameHeight));
			setResizable(false);
			setVisible(true);
		}
	}

	Interface(controls c, mainChar k){
		
		ddd=k;
		
		addKeyListener(c);
		
		setMaximumSize(new Dimension(Shared.frameWidth, Shared.frameHeight));
		setMinimumSize(new Dimension(Shared.frameWidth, Shared.frameHeight));
		add(graph);
		pack();
		setTitle("Shit");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
	}	
	
	
}
