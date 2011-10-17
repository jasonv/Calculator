package com.jasonv.projects.calculator;

public class Calculator 
{
	String screen = "0";
	int total = 0;
	String operation = "+";


	public void press(String keyPressed) 
	{
		int value = 0;
		if
		(
				keyPressed.equals("1") ||
				keyPressed.equals("2") ||
				keyPressed.equals("3") ||
				keyPressed.equals("4") ||
				keyPressed.equals("5") ||
				keyPressed.equals("6") ||
				keyPressed.equals("7") ||
				keyPressed.equals("8") ||
				keyPressed.equals("9") ||
				keyPressed.equals("0")				
		)
		{
			value = Integer.parseInt(keyPressed);
			this.screen = "" + value;
			if("+".equals(this.operation))
			{
				this.total += value;				
			}
			else if("-".equals(this.operation))
			{
				this.total -= value;				
			}
			else if("*".equals(this.operation))
			{
				this.total *= value;				
			}
			else if("/".equals(this.operation))
			{
				this.total /= value;				
			}
			else if("^".equals(this.operation))
			{
				this.total = (int)Math.pow(this.total,(double)value);				
			}
		}
		else if
		(
				"+".equals(keyPressed) ||
				"-".equals(keyPressed) ||
				"*".equals(keyPressed) ||
				"/".equals(keyPressed) ||
				"^".equals(keyPressed)				
		)
		{
			this.operation = keyPressed;			
		}
		else if("=".equals(keyPressed))
		{
			this.screen = "" + total;			
		}
	}

	public String getScreen() {
		return screen;
	}

	public void setScreen(String screen) {
		this.screen = screen;
	}

}
