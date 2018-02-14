package com.hyperion.training.basic.abstractejemplo;

public class AguasFrescas{
	
	public AguasFrescas() {}
	
	public String esAlcoholica() 
	{	return "hola";
	}
	
	public String esAlcoholica(String respuesta) 
	{	return respuesta;
	}
	
	public boolean estaFria(boolean ice) 
	{	if(ice==true)return true;
		else return false;}
	
	/**sobrecarga y polimorfismo del metodo*/
	public boolean esAlcoholica(String drink, int Quantity) 
	{return false;}
	
	public boolean esAlcoholica(String drink, String brand) 
	{return false;}

}
