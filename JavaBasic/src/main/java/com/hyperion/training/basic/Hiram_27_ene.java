package com.hyperion.training.basic;

public class Hiram_27_ene 
{
	/* created by Hiram Padilla January 2018*/
	
	private double result;//variable to save the result
	
	
	/**add method************************************************************************/
	private double add(int number1, int number2)
	{	result = number1 + number2;
		return result;
	}
	/**substract method************************************************************************/
	private double substract(int number1, int number2)
	{	result = number1 - number2;
		return result;
	}
	/**multiply method************************************************************************/
	private double multiply(int number1, int number2)
	{	result = number1 * number2;
		return result;
	}
	/**divide method************************************************************************/
	private double divide(int number1, int number2)
	{	result = number1 / number2;
		return result;
	}
	/**Main method************************************************************************/
	public static void main(String[] args) 
	{
		Hiram_27_ene operacion = new Hiram_27_ene();
		// TODO Auto-generated method stub
		
		
		/** use of methods */
		operacion.add(12, 7);
		operacion.substract(21, 2);
		operacion.multiply(9, 11);
		operacion.divide(57, 3);

	}

}
