package stupidGame;

import java.awt.image.BufferedImage;

public class Shared {
	
	public static int frameWidth=1280;
	
	public static int frameHeight=720;
	
	public static int tileCount = 16;
	
	public static int scale = 2;
	
	static int offsetY;
	
	static int offsetX;
	
	private static double row =	frameWidth/tileCount;
	
	private static double line = frameHeight/tileCount;
	
	public static BufferedImage background = new BufferedImage(frameWidth, frameHeight, BufferedImage.TYPE_INT_RGB);
	
	static BufferedImage frame = new BufferedImage(frameWidth, frameHeight, BufferedImage.TYPE_INT_RGB);

	public static double getLine() {
		return line;
	}

	public static double getRow() {
		return row;
	}
	
}
