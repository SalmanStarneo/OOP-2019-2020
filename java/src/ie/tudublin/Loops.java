package ie.tudublin;

import processing.core.PApplet;

public class Loops extends PApplet
{	
	public void settings()
	{
		size(500, 500);
	}

	public void setup() 
	{
		
	}

	
	public void keyPressed()
	{
		if (key == ' ')
		{
			
		}
	}	


	public void draw()
	{	
		background(0);		
		stroke(255);
		line(10, 10, 100, 10);
		line(10, 20, 100, 20);
		line(10, 30, 100, 30);
		line(10, 40, 100, 40);

		for(int y = 10 ; y <= 40 ; y += 10)
		{
			line(200, y, 300, y);
		}

		int yy = 10;
		while(yy <= 40)
		{
			line(300, yy, 400, yy);
			yy += 10;
		}
		
	
	}
}
