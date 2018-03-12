package stupidGame;

import stupidGame.entities.mainChar;
import stupidGame.levels.level1;

public class stupidGameMain {
	public static void main(String args[]){
		mainChar pj = new mainChar();
		
		logic dsa = new logic(pj);
		
		level1 crl = new level1();
		
		Interface asd = new Interface(new controls(pj), pj);
		
		
		
		while(true){
			asd.refresh();
		}
		
	}
	
}
