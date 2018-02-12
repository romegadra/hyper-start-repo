package com.hyperion.training.basic;

public abstract class Products {
	
	private int id=0;
	private String brand="";
	private double price=0;
	
	public abstract void generateId(int numero);
	
	public void setId(int id)
	{this.id = id;}
	
	public void setBrand(String brand)
	{this.brand = brand;}
	
	public void setPrice(double price)
	{this.price = price;}
	
	public int getId()
	{return id;}
	
	public String getBrand()
	{return brand;}
	
	public double getPrice()
	{return price;}
	
}
