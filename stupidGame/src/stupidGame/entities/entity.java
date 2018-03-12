package stupidGame.entities;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import stupidGame.Shared;

public class entity {
	public BufferedImage sprite;
	
	public double posX=0;
	
	public double posY=0;
	
	public void setX(double x){
		if(posX<=Shared.getRow()||posX>=Shared.getRow()){	
		}
		else{
			posX=Shared.getRow()*x;
		}
	}
	
	public void setY(double y){
		if(posY<=Shared.getLine()||posY>=Shared.getLine()){	
		}
		else{
			posY=Shared.getLine()*y;
		}
	}
}
