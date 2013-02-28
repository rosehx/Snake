package org.snake.controls;

import org.lwjgl.input.Keyboard;
import static org.lwjgl.input.Keyboard.*;

public class Controls {
	
	int key = 0;
	
	public void move(){
		getKey();
		switch(key){
		case 1:
			
			break;
			/////
		case 2:
			
			break;
			/////
		case 3:
			
			break;
			/////
		case 4:
			
			break;
			/////
		case 0:
			
			break;
		}
	}
	
	public void setKey(){
		if(isKeyDown(KEY_W)){
			key = 1;
		}
		else if(isKeyDown(KEY_A)){
			key = 2;
		}
		else if(isKeyDown(KEY_S)){
			key = 3;
		}
		else if(isKeyDown(KEY_D)){
			key = 4;
		}
		else if(isKeyDown(KEY_P)){
			key = 0;
		}
	}
	public int getKey(){
		return key;
	}
}
