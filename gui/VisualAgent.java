package gui;

import processing.core.PApplet;

public class VisualAgent extends PApplet {
	
	private double xspeed = 2.5;
	float xpos, ypos; // ball initial position
	int rad = 20;



	public static void main(String[] args) {
		PApplet.main("gui.VisualAgent");

	}

	public void settings(){
		size(800,300);
	}

	public void setup(){
		
		noStroke();
		ellipseMode(rad);
		ypos = height/2;
		xpos = width/2;
		
		
	}

	public void draw(){
		
		background(0,0,0);
		noFill();
		stroke(255);
		rect(10, 10, width-20, 200);
		fill(255);
		if(xpos < 0-rad) {
			xpos = width;
		}
		xpos =  (float) (xpos + (xspeed*-1));
		ellipse(xpos,ypos,rad,rad);
		
	}
}
