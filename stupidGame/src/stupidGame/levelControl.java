package stupidGame;

import java.util.ArrayList;

import stupidGame.levels.level;
import stupidGame.levels.level1;

public class levelControl {
	ArrayList<level> levels = new ArrayList<level>();
	
	levelControl(){
		levels.add(new level1());
	}
}
