package stupidGame;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import stupidGame.entities.mainChar;

public class controls implements KeyListener {
	
	controls(mainChar mc){
		pj=mc;
	}
	
	mainChar pj;

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		switch(arg0.getKeyCode()){
			case(KeyEvent.VK_W):{
				pj.setY(pj.posY++);
				System.out.println("w");
				break;
			}
			case(KeyEvent.VK_A):{
				pj.setX(pj.posX--);
				System.out.println("a");
				break;
			}
			case(KeyEvent.VK_S):{
				pj.setY(pj.posY--);
				System.out.println("s");
				break;
			}
			case(KeyEvent.VK_D):{
				pj.setX(pj.posX++);
				System.out.println("d");
				break;
			}
		}
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
}
