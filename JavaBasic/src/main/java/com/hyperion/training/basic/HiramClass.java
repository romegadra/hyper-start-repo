package com.hyperion.training.basic;
/* created by Hiram Padilla*/
public class HiramClass 
{

	public void mensaje()
	{System.out.println("Esta es mi clase en JAVA");}
	
	public String texto()
	{	String variable = "Esto esta geniaaaal 8) ";
		return variable;
	}
	
	public static void main (String [] args)
	{
		HiramClass objeto = new HiramClass();
		System.out.print(objeto.texto());
		
	}
}
