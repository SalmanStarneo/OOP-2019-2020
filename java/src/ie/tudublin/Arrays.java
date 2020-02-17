package ie.tudublin;

import processing.core.PApplet;

public class Arrays extends PApplet
{	

	//float[] rainFall = new float[12];
	float[] rainFall = {45,37,55,27,38,50,79,48,104,31,100,58};

	String[] months =  {"Jan", "Feb", "Mar", "Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};

	public void settings()
	{
		size(500, 500);
	}

	float max= rainFall[0];

	float min= rainFall[0];

	int minNo;

	int maxNo;

	public void setup() 
	{
		for(int i = 0; i< rainFall.length; i++)
		{
			println(months[i]+"\t"+rainFall[i]);
		}

		for(float f:rainFall)
		{
			println(f);
		}

		for(String s:months)
		{
			println(s);
		}

		for(int i=0; i<rainFall.length ; i++)
		{
			if(min>rainFall[i])
			{
				min=rainFall[i];
			}

			if(max<rainFall[i])
			{
				max=rainFall[i];
			}

			println(min)
		}
	}

	

	float offset = 0;

	
	
	public void keyPressed()
	{
		if (key == ' ')
		{
			
		}
	}	


	public void draw()
	{	
		background(0);		
		colorMode(HSB);	
	}
}
