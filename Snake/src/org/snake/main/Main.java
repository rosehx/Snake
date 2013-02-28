package org.snake.main;

import org.lwjgl.LWJGLException;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;

import static org.lwjgl.opengl.GL11.*;

import org.snake.colision.CollisionApple;
import org.snake.objects.World;
import org.snake.objects.Block;
import org.snake.objects.Apple;


public class Main {
	
	private final String TITLE = "Snake";
	public static final float WIDTH = 600;
	public static final float HEIGHT = 650;
	private int FPS = 60;
	public CollisionApple content = new CollisionApple(6);
	
	
	public Main() {
		/**
		 * 
		 */
		gameInit();
		
		
		while(!Display.isCloseRequested()&&!(Keyboard.isKeyDown(Keyboard.KEY_ESCAPE))){ 
				glClear(GL_COLOR_BUFFER_BIT);
				
				gameLoop();
				
				
				Display.update(); 
				Display.sync(FPS);
		}
			Display.destroy();
			System.exit(1);
	}
	
	private void gameInit(){
		initGL();
		content.initNoCollide();
		
	}
	public void gameLoop(){
		content.drawNoCollide();
	}

	private void initGL() {
		/**
		 * 
		 */
		try {
			Display.setInitialBackground(0.0f, 0.0f, 0.0f);
			Display.setDisplayMode(new DisplayMode((int)WIDTH, (int)HEIGHT));
			Display.setResizable(false);
			Display.setTitle(TITLE);
			Display.create();
			
		} catch (LWJGLException e) {
			e.printStackTrace();
			Display.destroy();
			System.exit(1);
		}
		
		glMatrixMode(GL_PROJECTION);
		glLoadIdentity();
		glOrtho(0, WIDTH, HEIGHT, 0, 1, -1);
		glMatrixMode(GL_MODELVIEW);
		glEnable(GL_TEXTURE_2D);
		
	}
  
	public static void main(String[] args) {
		new Main();
	}
}
