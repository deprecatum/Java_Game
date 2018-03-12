package stupidGame.levels;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import stupidGame.Shared;
import stupidGame.tiles.groundTile;
import stupidGame.tiles.wallTile;

public class level { 	
	
	int[][] tileMap = new int[31][31];
	
	BufferedImage buff; //1024 width 720 height
	
	level(File f){
		this.getTileMap(f); 
		this.getTileArray();
		this.loadMap();
	}
	
	
	BufferedImage bitmap;
	
	private void getTileMap(File f){
		try {
			bitmap=ImageIO.read(f);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void getTileArray(){
		
		System.out.println(bitmap.getHeight()*bitmap.getWidth());
		
		for(int y=0; y<=31; y++){
 			for(int x=0; x<=31; x++){

				System.out.println("y: "+y+" - x: "+x);
				
				switch(bitmap.getRGB(x, y)){
					case(16777215):{ //branco
						tileMap[x][y]=1; //textura 1
						break;
					}
					case(12632256):{ //64 cizento claro 
						tileMap[x][y]=1; //textura 2
						break;
					}
					case(8421504):{ //128 cinzento
						tileMap[x][y]=1; //textura 3
						break;
					}
					case(4210752):{ //192 cinzento escuro
						tileMap[x][y]=0; //textura 4
						break;
					}
					case(0):{ //preto 
						tileMap[x][y]=0; //textura 5
						break;
					}
					default:{
						tileMap[x][y]=0;
						break;
					}
				}		//switch		

				System.out.println("TileMapN: "+tileMap[x][y]);
			} //fim  x

		} //fim y
		

		System.out.println("tileMap: "+tileMap.length);
	}
	
	groundTile ground = new groundTile();
	
	wallTile wall = new wallTile();
	
	private void loadMap(){
		buff = new BufferedImage(Shared.frameWidth, Shared.frameHeight, BufferedImage.TYPE_INT_RGB);
		
		for(int y=0; y<=30; y++){	
			for(int x=0; x<=31; x++){	
				System.out.println("switch");
				switch(tileMap[x][y]){
					case(0):{
						for(int Y=0;Y<=31;Y++){
							for(int X=0;X<=31;X++){			
								buff.setRGB(x*32+X, y*32+Y, ground.getTileData(X, Y));
								
								int k=x*32+X;
								System.out.println("buff x: "+k);	
								
								int j=y*32+Y;
								System.out.println("buff y: "+j);
							}
						}
						break;
					}
					case(1):{
						
						for(int Y=0;Y<=31;Y++){
							for(int X=0;X<=31;X++){
								buff.setRGB((x*32+X), (y*32+Y), wall.getTileData(X, Y));	
							}
						}
						break;
					}
				} //fim switch	
			}	//fim while x
			
			
		}// fim while y
		
		
		Shared.background=buff;
	}
	
	
}
