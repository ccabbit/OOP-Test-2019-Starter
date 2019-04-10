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
			rect(180, box * (gap-30), gap + 30, 50) ;
		}
	}

	void drawLine()
	{
		stroke(0);

		float numLines = 4;
		float gap = height / numLines;
		for(int line = 0 ; line < numLines ; line++)
		{
			//float x = 1 *gap;
			line(100, line * (gap-30), 80 , 80);
		}

		
	}
	
	public void draw()
	{		
		drawRect();
		drawLine();

	}
}
