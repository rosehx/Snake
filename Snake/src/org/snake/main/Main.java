package org.snake.main;

import org.lwjgl.LWJGLException;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;

import static org.lwjgl.opengl.GL11.*;

import org.snake.objects.World;
import org.snake.objects.Block;
import org.snake.objects.Apple;


public class Main {
	
	private final String TITLE = "Snake";
	private final int WIDTH = 600, HEIGHT = 650, FPS = 60;
	public World world = new World(15);
	
	
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
		world.initWorld();
		
	}
	public void gameLoop(){
		world.drawWorld();
	}

	private void initGL() {
		/**
		 * 
		 */
		try {
			Display.setInitialBackground(0.0f, 0.0f, 0.0f);
			Display.setDisplayMode(new DisplayMode(WIDTH, HEIGHT));
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
