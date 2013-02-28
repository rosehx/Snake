package org.snake.objects;

import static org.lwjgl.opengl.GL11.*;

import java.util.Random;

public class Block {
	
	private float x, y, size;
	
	public Block(float x, float y, float size){
		this.x = x;
		this.y = y;
		this.size = size;
	}

	public void draw(){
		glColor3f(1.0f, 1.0f, 1.0f);
		glBegin(GL_QUADS);
			glVertex2f(x, y);
			glVertex2f(x + size, y);
			glVertex2f(x + size, y + size);
			glVertex2f(x, y + size);
		glEnd();
	}
		//set
	public void setX(float x){
		this.x = x;
	}
	public void setY(float y){
		this.y = y;
	}
	public void setSize(float size){
		this.size = size;
	}	//get
	public float getX(){
		return x;
	}
	public float getY(){
		return y;
	}
	public float getSize(){
		return size;
	}
}
