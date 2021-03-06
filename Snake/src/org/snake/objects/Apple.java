package org.snake.objects;

import static org.lwjgl.opengl.GL11.*;

import org.snake.main.Main;

public class Apple {
	
	private float x, y, rad;
	private float  WIDTH = Main.WIDTH, HEIGHT = Main.HEIGHT;
	
	public Apple(float x, float y, float rad){
		this.x = x;
		this.y = y;
		this.rad = rad;
	}
	public void draw(){
		double increment = 2*Math.PI/10;
		
        glColor3f(1.0f, 0.0f, 0.0f);
     	for(double angle = 0; angle < 2 * Math.PI; angle += increment){
     		glBegin(GL_POLYGON);
     			glVertex2d(x, y);
     			glVertex2d(x + Math.cos(angle) * rad, y + Math.sin(angle) * rad);
     			glVertex2d(x + Math.cos(angle + increment)* rad, y + Math.sin(angle + increment) * rad);
			glEnd();
     	}
	}
	
	public void nextApple(){
		this.x = (float)Math.random() * WIDTH;
		this.y = (float)Math.random() * HEIGHT;
	}
		//set
	public void setX(float x){
		this.x = x;
	}
	public void setY(float y){
		this.y = y;
	}
	public void setRad(float rad){
		this.rad = rad;
	}	//get
	public float getX(){
		return x * (-getRad());
	}
	public float getY(){
		return y * (-getRad());
	}
	public float getRad(){
		return rad;
	}
}
