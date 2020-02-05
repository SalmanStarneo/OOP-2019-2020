package ie.tudublin;

import processing.core.PApplet;

public class Bugzap extends PApplet
{	
    float playerx = 100.5f;

    float playery = 100.5f;

    float playerwidth = 100.5f;
    
	public void settings()
	{
		size(500, 500);
	}

	public void setup() {
	}

    public void draw()
    {
        background(0, 0, 0);
        fill(255, 0, 110);
        triangle(100, 100, 100, 100, 100, 100);
        fill(255, 110, 0);
        point(300, 300);
    }

    public void keypressed()
    {
        if (keyCode == LEFT)
		{
			System.out.println("Left arrow pressed");
		}
		if (keyCode == RIGHT)
		{
			System.out.println("Right arrow pressed");
		}
		if (key == ' ')
		{
			System.out.println("SPACE key pressed");
		}
    }
}