package org.snake.colision;


import org.lwjgl.input.Keyboard;
import org.snake.main.Main;
import org.snake.objects.Apple;
import org.snake.objects.World;
import org.snake.objects.Block;


public class CollisionApple {
	private float WIDTH = Main.WIDTH, HEIGHT = Main.HEIGHT;
	private float lvl;
	private World world;
	private Apple apple;
	
	
	public CollisionApple(float lvl){
		this.lvl = lvl;
	}
	public void initNoCollide(){
		world = new World(lvl);
		world.initWorld();
		apple = new Apple((float)Math.random() * WIDTH,(float) Math.random() * HEIGHT, 10);
	}
	public boolean isNoCollide(){
		nextApple();
		world.drawWorld();
		for(Block b : World.blockArray){
			if(apple.getX() !=  b.getX()||apple.getY() != b.getY()){
				return true; //Is not touching any blocks
			}
		}
		return false;
	}
	public void drawNoCollide(){
		isNoCollide();
		if(isNoCollide() == true){
			apple.draw();
		}
		else if(!isNoCollide()){
			apple.nextApple();
		}
	}
	public void nextApple(){
		while(Keyboard.next()){
		if(Keyboard.isKeyDown(Keyboard.KEY_RETURN)){
			apple.nextApple();
		}
		}
	}
}
