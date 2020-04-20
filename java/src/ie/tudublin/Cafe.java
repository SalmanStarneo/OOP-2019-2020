package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class Cafe extends PApplet
{

    ArrayList<Product> products = new ArrayList<Product>();

    ArrayList<Product> bill = new ArrayList<Product>();

    float border;
        
    float left;

    float w;

    float h;

    public void settings()
    {
        size(800,800);

        border = width * 0.1f;
        
        left = width * 0.5f;

        w = width * 0.3f;

        h = height * 0.11f;
    }

    public void setup()
    {
        loadData();
        printProducts();
        mousePressed();   
    }

    public void loadData()
    {
        Table table = loadTable("cafe.csv","header");

        for(TableRow row:table.rows())
        {
            Product p = new Product(row);
            products.add(p);
        }
    }

    public void printProducts()
    {
        for(Product p:products)
        {
            System.out.println(p);
        }
    }
    
    public void displayProducts()
    {
        // float border = width * 0.1f;
        
        // float left = width * 0.5f;

        // float w = width * 0.3f;

        // float h = height * 0.11f;

        for(int i = 0; i < products.size(); i++)
        {
            Product p = products.get(i);

            float y = map(i, 0,products.size(), border, height-border);

            fill(255);
            rect(10, y, w, h);
            fill(0);
            textAlign(LEFT,CENTER);
            text(p.getName(),20, y+(h/2));
            textAlign(RIGHT,CENTER);
            text(nf(p.getPrice(),0,2)+" £",w-10,y+(h/2));
        }
    }
    public void drawBill()
    {
        float billLeft = (width/2)+55;

        // float border = width * 0.1f;
        
        // float left = width * 0.5f;

        // float w = width * 0.3f;

        float billH = height * 0.8f;
        float y = border +50;
        float total = 0;
        stroke(0);
        fill(255);
        rect(billLeft,border, w,billH);
        fill(0);
        textAlign(LEFT,CENTER);
        text("Cafe Bill", billLeft+95, y-30);
        for(int i=0; i < bill.size();i++)
        {
            Product p = bill.get(i);
            textAlign(LEFT,CENTER);
            fill(0);
            text(p.getName(), billLeft+20, y);
            text(nf(p.getPrice(),0,2)+" £", billLeft+190, y);
            y+=30;
            total += p.getPrice();
            
        }
        fill(0);
        textAlign(LEFT,CENTER);
        text("Total: "+nf(total,0,2)+" £", billLeft+95, y+15);
    }

    public void mousePressed()
    {

        for(int i =0; i<products.size();i++)
        {
            float y = map(i, 0, products.size(), border, height-border);
        
            if(mouseX > 10 && mouseX < (10+ w)
            && mouseY > y && mouseY < (y+(h/2))) 
            {
                bill.add(products.get(i));
                break;
            }
        }
    }

    public void draw()
    {
        // mousePressed();
        displayProducts();
        drawBill();
    }

}