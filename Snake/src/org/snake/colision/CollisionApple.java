package org.snake.colision;


import org.lwjgl.opengl.Display;
import org.snake.objects.Apple;
import org.snake.objects.World;


public class CollisionApple {
	private float SCR_WIDTH = Display.getWidth(), SCR_HEIGHT = Display.getHeight();
	private float lvl;
	private World world;
	private Apple apple;
	
	
	public CollisionApple(float lvl){
		this.lvl = lvl;
	}
	public void initNoCollide(){
		world = new World(lvl);
		world.initWorld();
		apple = new Apple((float)Math.random() * SCR_WIDTH,(float) Math.random() * SCR_HEIGHT, 20);
	}
	public void drawNoCollide(){
		
	}
}
