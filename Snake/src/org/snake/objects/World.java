package org.snake.objects;


import org.lwjgl.opengl.Display;
import org.snake.main.Main;
import org.snake.objects.Block;


public class World {
	
	private float lvl;
	private float WIDTH = Main.WIDTH;
	private float HEIGHT = Main.HEIGHT;
	public static Block[] blockArray;
	
	public World(float lvl){
		this.lvl = lvl;
		blockArray = new Block[(int)lvl];
	}
	
	public void initWorld(){
		float  fX, fY, fS;
		for(int i = 0; i < (int)lvl; i++){
			fS = (float)Math.random() * (40f - 5) -5f;//float fS = (Random r = new Random).nextFloat() * (Max BlockSize - Minimum BlockSize) - Minimum;
			fX = (float)Math.random()* WIDTH - fS;
			fY = (float)Math.random()* HEIGHT - fS;
			blockArray[i] = new Block(fX, fY, fS);
		}
	}
	
	public void drawWorld(){
		for(int i = 0; i < (int)lvl; i++){
			blockArray[i].draw();
		}
	}
}
