package com.jasonv.projects.calculator;

import junit.framework.TestCase;

public class FeatureTest extends TestCase
{
	public void test_screen_is_zero()
	{
		Calculator calculator = new Calculator();
		assertEquals("0",calculator.getScreen());
	}
	
	public void test_press_one()
	{
		Calculator calculator = new Calculator();
		calculator.press("1");
		assertEquals("1",calculator.getScreen());
	}
	
	public void test_one_plus_one()
	{
		Calculator calculator = new Calculator();
		calculator.press("1");
		calculator.press("+");
		calculator.press("1");
		assertEquals("1",calculator.getScreen());
	}

	public void test_one_plus_one_equals_two()
	{
		Calculator calculator = new Calculator();
		calculator.press("1");
		calculator.press("+");
		calculator.press("1");
		calculator.press("=");
		assertEquals("2",calculator.getScreen());
	}
	
	public void test_two_plus_one_equals_two()
	{
		Calculator calculator = new Calculator();
		calculator.press("2");
		calculator.press("-");
		calculator.press("1");
		calculator.press("=");
		assertEquals("1",calculator.getScreen());
	}

	public void test_plus_and_minus()
	{
		Calculator calculator = new Calculator();
		calculator.press("2");
		calculator.press("-");
		calculator.press("1");
		calculator.press("+");
		calculator.press("3");
		calculator.press("=");
		assertEquals("4",calculator.getScreen());
	}

	public void test_multiply()
	{
		Calculator calculator = new Calculator();
		calculator.press("2");
		calculator.press("*");
		calculator.press("3");
		calculator.press("=");
		assertEquals("6",calculator.getScreen());
	}

	public void test_divide()
	{
		Calculator calculator = new Calculator();
		calculator.press("4");
		calculator.press("/");
		calculator.press("2");
		calculator.press("=");
		assertEquals("2",calculator.getScreen());
	}

	public void test_to_the_power()
	{
		Calculator calculator = new Calculator();
		calculator.press("2");
		calculator.press("^");
		calculator.press("3");
		calculator.press("=");
		assertEquals("8",calculator.getScreen());
	}
	
}
