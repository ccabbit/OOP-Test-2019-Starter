package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class UI extends PApplet

{	public void separate(int value)
	{
		int hundreds = (value / 100);
		int tens = (value - (hundreds * 100)) / 10;
		int ones = value - ((hundreds * 100)  + (tens * 10));
		print(hundreds + ",");
		print(tens + ",");
		println(ones);
	}

	public void settings()
	{
		//size(500, 800);
		size(500, 500);
		separate(381);
		separate(1);
		separate(92);
	}



	public void setup() 
	{
		

	}

	void drawRect()
	{
		colorMode(RGB);
		stroke(0);
		noFill();

		float numBoxes = 4;
		float gap = height / numBoxes;
		for(int box = 0 ; box < numBoxes ; box ++)
		{
			rect(180, (box * gap)+10, gap + 30, 50) ;
		}
	}

	void drawLine1()
	{
		stroke(0);

		float numLines = 4;
		float gap = height / numLines;
		for(int lin = 0 ; lin < numLines ; lin++)
		{
			line(100, (lin * gap)+30, 180 , (lin * gap)+30);
		}
	}

	void drawLine2()
	{
		stroke(0);

		float numLines = 4;
		float gap = height / numLines;
		for(int lin = 0 ; lin < numLines ; lin++)
		{
			line( 335, (lin * gap)+30, 415 , (lin * gap)+30);
		}

		
	}
	
	public void draw()
	{		
		drawRect();
		drawLine1();
		drawLine2();

	}
}
