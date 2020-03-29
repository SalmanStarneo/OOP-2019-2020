package ie.tudublin;

import processing.core.PApplet;
import ddf.minim.*;
import ddf.minim.analysis.*;

public class Sun extends PApplet
{
    public void settings()
    {
        fullScreen();
    }

    public void setup()
    {
        colorMode(HSB);
    }
    // float w = 1000;
    // float y = 1000;

    public void Sunny()
    {  
        stroke(110,255,255);
        fill(50,255,255);
        ellipse(500, 500, 500 ,500);
        // triangle(x1, y1, x2, y2, x3, y3);
        
    }
}