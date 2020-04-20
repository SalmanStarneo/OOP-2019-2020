package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class StarMap extends PApplet
{
    // Arraylist can grow and shrink
    // Generic
    ArrayList<Star> stars = new ArrayList<Star>(); 

    public void drawStars()
    {
        for(Star s: stars)
        {
            s.render(this);
        }
    }
    int selected1 = -1;
    int selected2 = -1;

    public void mousePressed()
    {
        float border = width * 0.05f;
        for(int i = 0 ; i < stars.size() ; i++)
        {
            Star star = stars.get(i);
            
            
            float x = map(star.getxG(), -5, 5, border, width - border);
            float y = map(star.getyG(), -5, 5, border, height - border);

            if(dist(mouseX, mouseY, x, y) < star.getAbsMag() / 2 ) //what is this calculating?
            {
                if (selected1 == -1)
                {
                    selected1 = i;
                }
                else if (selected2 == -1)
                {
                    selected2 = i;
                }
                else
                {
                    selected1 = i;
                    selected2 = -1;
                }           
            }
        }  
    }
    
    public void starConnection()
    {
        float border = width * 0.05f;
        
        // If I have selected one of the stars
        if (selected1 != -1 && selected2 == -1)
        {
            Star star1 = stars.get(selected1);
            stroke(255, 255, 255);
            float x = map(star1.getxG(), -5, 5, border, width - border);
            float y = map(star1.getyG(), -5, 5, border, height - border);
            line(x, y, mouseX, mouseY);
        }
        else if (selected1 != -1 && selected2 != -1)
        {
            Star star1 = stars.get(selected1);
            Star star2 = stars.get(selected2);
            
            float x1 = map(star1.getxG(), -5, 5, border, width - border);
            float y1 = map(star1.getyG(), -5, 5, border, height - border);
            float x2  = map(star2.getxG(), -5, 5, border, width - border);
            float y2 = map(star2.getyG(), -5, 5, border, height - border);
            stroke(255, 255, 0);
            line(x1, y1, x2, y2);    
            fill(255,255,255);
            float dist = dist(star1.getxG(), star1.getyG(), star1.getzG(),
            star2.getxG(), star2.getyG(), star2.getzG());
            fill(255,255,255);
            stroke(255,255,255);
            text("Distance from " + star1.getDisplayName() + " to " + star2.getDisplayName() + " is " + dist + " parsecs", border, height - 25);
        }
    }
    
    public void drawGrid()
    {
        float border = width * 0.05f;

        stroke(0, 0, 255);
        textAlign(CENTER, CENTER);
        for(int i = -5 ; i <= 5 ; i ++)
        {
            float x = map(i, -5, 5, border, width - border);
            line(x, border, x, height - border);
            line(border, x, width - border, x);    
            
            fill(255);
            text(i, x, border / 2);
            text(i, border / 2, x);
        }
    }

    public void settings()
    {
        size(800, 800);

    }

    public void setup()
    {
        loadData();
        // printStars();
    }

    public void loadData()
    {
        Table t = loadTable("HabHYG15ly.csv", "header");
        for(TableRow tr:t.rows())
        {
            Star s = new Star(tr);
            stars.add(s);
        }
    }

    public void printStars()
    {
        for(Star s:stars)
        {
            println(s);
        }
    }

    public void draw()
    {
        background(0);
        drawGrid();
        drawStars();
        starConnection();
    }

}
