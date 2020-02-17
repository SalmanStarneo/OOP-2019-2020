package ie.tudublin;

import java.security.cert.X509CRLEntry;

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
		// q1();
		// q2();
		// q3();
		// q4();
		// q5();
		// q6();
		//  q7();
		q8();
	}

	
		
		//height and width = 500 each
		//loop star using x and y axes to draw line
		public void q1()
		{
			background(255);		
			stroke(0);
			//Question 1 Lab 3
			int x = 0;
			int y = 0;
			int centerx=width/2;
			int centery=height/2;
			for(x=0 ; x<= width ; x+=20)
			{
					
				line(x, 0, centerx, centery);
				line(0, y, centerx, centery);
				line(height, height-y, centerx, centery);
				line(width-x, width, centerx, centery);
				y+=20;
				
			}
			
			
			// Star loop (centerPoint = 250,250)
			// for(xe=0 ; xe<= 500 ; xe+=20)
			// {
				
			// 	line(xe, 0, centerx, centery);
				
			// }
			// for(yy=0 ; yy<= 500 ; yy+=20)
			// {
				
			// 	line(0, yy, centerx, centery);
			// 	// xe+=100;
			// 	// yy+=10;
			// }

			// for(xe=500 ; xe>0 ; xe-=20)
			// {
				
			// 	line(xe, 500, centerx, centery);
			// 	// xe+=100;
			// 	yy+=10;
			// }
			// for(yy=0 ; yy<= 500 ; yy+=20)
			// {
			// 	stroke(5);
			// 	line(500, yy, centerx, centery);
			// 	// xe+=100;
			// 	// yy+=10;
			// }
		}

		public void tutoQ1()
		{
			stroke(255);
			int numoflines = 100;
			float gap =(int) (30*(mouseX /(float)width));
			// an int divided by int = int even if it result or stored in a float so cast it as float
			for(int i=0; i<=width; i++)
			{
				float x = i * gap;
				line(x, 0, width-x, height);
				line(0,x,width,height-x);
			}
		}
		public void q2()
		{
			background(255);		
			stroke(0);
			int x=25;
			int y=height/2;
			// int centerx=width/2;
			//Question 2 lab 3
			while(x<=width)
			{
				// background(255);
				circle(x, y, 50);
				x+=50;
			}
		}

		public void TutoQ4() 
		{
			int numCirlcles	= (int)(20 * (mouseX/(float)width));
			float w = width/(float)numCirlcles;
			float radius = w /2.0f;
			float nGap = 255/(float) numCirlcles;
			for(int j =0 ; j < numCirlcles ; j++)
			{
				for(int i = 0 ; i <numCirlcles ; i++)
				{

				}
			}
		}

		public void q3()
		{
			background(255);		
			stroke(0);
			// Question 3 lab 3
			int x=0;
			int y=0;
			int colors=0;
			
			while(x<=width)
			{
				colorMode(HSB);
				fill(colors,255,255);
				noStroke();
				rect(x, y, 50, height);
				x+=50;
				colors+=20;
			}
		}
		public void q4()
		{
			background(255);		
			stroke(0);
		     //Question 4 lab 3
			int x=25;
			int y=height/2;
			int colors=0;

			while(x<=width)
			{
				colorMode(HSB);
				fill(colors,255,255);
				noStroke();
				circle(x, y, 50);
				x+=50;
				colors+=20;
			}	
			
		}

		public void q5()
		{
			int x;
			int y;
			int SSize=400;
			int Num=-5; 
			// X/width=40 , Y/height=40 so  Size of Square should be 400 but since starting postions(30,30) we add 30 to the Side 
			background(0);
			stroke(0,255,0);
			fill(0);
			for(x=30;x<=SSize;x+=40)
			{
				for(y=30;y<=SSize;y+=40)
				{
					square(x, y, 40);
				}

			}
			int xTxt = 430;
			int yTxt = 430;
			fill(255);
			for(x=30;x<=xTxt;x+=40)
			{
				text(Num, x, 15);
				Num++;
			}

			Num=-5;
			for(y=30;y<=yTxt;y+=40)
			{
				text(Num, 15, y);
				Num++;
			}			



		}

		public void tutoQ5()
		{
			float gap = width * 0.1f;
			float halfgap = gap /2.0f;
			colorMode(RGB);
			stroke(0,255,0);
			textAlign(CENTER,CENTER);
			for(int i =0; i<= 5 ; i++)
			{
				float x = map(i, -5, 5, gap, width-gap);
				// map(percentage,pointA in range, pointB in range, RangeA, RangeB)
				line(x, gap, x, height-gap);
				line(gap, x, width - gap, x);
				fill(255);
				text(i, x, halfgap);
				text(i, halfgap, x);

			}
		}

		public void q6()
		{
			int x=0;
			int y=50;
			int xWid=200;
			int yHei=50;
			//full width is 200 if we cut 20 each time it will only be from one size so xWid need to be twice the cut
			for(x=20;x<=100;x+=20)
			{
				rect(x, y, xWid, yHei);
				xWid-=40;
				y+=50;
			}
		}
		
		public void q7()//The colored circles  two loops(nest loop)
		{
			int x;
			int y;
			int SSize=450;
			int colors=-5;
			int nextcolor=-5;
			// X/width=40 , Y/height=40 so  Size of Square should be 400 but since starting postions(30,30) we add 30 to the Side 
			background(255);
			colorMode(HSB);
			fill(colors,255,255);
			noStroke();
			for(x=20;x<=SSize;x+=45)
			{
				// fill(colors,255,255);
				for(y=20;y<=SSize;y+=45)
				{					
					fill(colors,255,255);
					circle(x, y, 40);
					colors+=10;
				}				
				// fill(colors,255,255);
				nextcolor+=10;
				colors=nextcolor;
				
			}

		}

		

		public void q8()//The blue squares two loops(nest loop)
		{
			int x;
			int y;
			int SSize=500;
			int colors=180;
			// int nextcolor=-5;
			// X/width=40 , Y/height=40 so  Size of Square should be 400 but since starting postions(30,30) we add 30 to the Side 
			background(255);
			colorMode(HSB);
			fill(255,255,colors);
			noStroke();
			for(x=0;x<=SSize;x+=20)
			{
				// fill(colors,255,255);
				for(y=0;y<=SSize;y+=20)
				{					
					fill(colors,255,255);
					square(x, y, 30);
					if(colors==180)
					{
						colors=150;
					}
					else
					{
						colors=180;
					}
				}
				
				if(colors==180)
					{
						colors=150;
					}
					else
					{
						colors=180;
					}				
			}

		}

		//  int x1 = 200;

		//  int x2 = 300;

		//  int x3 = 300;

		//  int x4 = 400;

		// for(int y = 10 ; y <= 50 ; y += 10)
		// {
		// 	line(x1, y, x2, y);
		// 	x1+=100;
		// 	x2+=100;
		// }

		
		// while(yy <= 50)
		// {
		// 	line(x3, yy, x4, yy);
		// 	yy += 10;
		// 	x3+=100;
		// 	x4+=100;
		// }

}
