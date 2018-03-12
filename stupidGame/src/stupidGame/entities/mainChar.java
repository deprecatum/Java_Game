package stupidGame.entities;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class mainChar extends entity {
	public mainChar(){
		try {
			sprite = ImageIO.read(new File("char.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
