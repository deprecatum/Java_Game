package stupidGame.tiles;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class tile {
	BufferedImage tile;
	
	boolean solid;
	
	tile(String s){
		try {
			tile=ImageIO.read(new File(s));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public int getTileData(int x, int y){
		return tile.getRGB(x, y);
	}
}
