package com.hyperion.training.basic;

public class Cellphones extends Products{

	private String phone = "smartphone";
	private String OS = "Android";
	private String OSversion = "6.0";
	private String number = "";

	public void generateId(int numero) 
	{this.phone = phone+numero;}
	
	/** Setter Methods *************************************/
	
	public void setPhone(String phonetype)
	{this.phone = phonetype;}
	
	public void setOS(String OperativeSystem)
	{this.OS = OperativeSystem;}
	
	public void setSOVersion(String VersionOS)
	{this.OSversion = VersionOS;}
	
	public void setNumber(String number)
	{this.number = number;}
	
	/** Getter Methods *************************************/
	
	public String getPhone()
	{return phone;}
	
	public String getOS()
	{return OS;}
	
	public String getVersion()
	{return OSversion;}
	
	public String getNumber()
	{return number;}
	
	/** Print data ****************************************/
	
	public void printCellphone()
	{System.out.println(this.phone +", "+ this.OS +", "+ this.OSversion +", "+ this.number);}
	

}
