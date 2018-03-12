package stupidGame.entities;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;

public class enemy extends entity{
	
	enemy(){
	
//		if(new Random().nextInt(15)==){
//			
//		}
		
		try {
			sprite = ImageIO.read(new File("enemy.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
