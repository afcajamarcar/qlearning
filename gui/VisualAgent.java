package gui;

import processing.core.PApplet;
import fisica.*;

public class VisualAgent extends PApplet {
	
	private double xspeed = 2.5;
	float xposBall, yposBall; // ball initial position
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
		yposBall = height/2 + 40;
		xposBall = width/2;
		
		
	}

	public void draw(){
		//fill background with black color
		background(0,0,0);
		//Create container box
		noFill();
		stroke(255);
		rect(10, 10, width-20, 200); //actual box
		fill(255);
		if(xposBall < 0-rad) {
			xposBall = width;
		}
		xposBall =  (float) (xposBall + (xspeed*-1));
		tint(255, 127);
		ellipse(xposBall,yposBall,rad,rad);
		System.out.println(getBallPostition());
		
	}
	
	public float getxposBall() {
		return this.xposBall;
	}
	
	public float getyposBall() {
		return this.yposBall;
	}
	
	public String getBallPostition() {
		String x = Float.toString(getxposBall());
		String y = Float.toString(getyposBall());
		return x + " "+ y;
	}
}
