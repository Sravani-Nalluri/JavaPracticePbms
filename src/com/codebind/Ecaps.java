package com.codebind;

public class Ecaps {

   private String name;
	//getter
	public String getName()
	{
		return name;
	}
	//setter
	public void setName(String newName)
	{
		this.name=newName;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated public static void Main(String[] args)
		
		
		{
			
			Ecaps obj=new Ecaps();
			obj.setName("sravani");
			System.out.println(obj.getName());
			
		}
	}
	
}
	
	
