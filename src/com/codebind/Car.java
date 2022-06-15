package com.codebind;


	
	public class Car extends Vehicle
	{
		public String model;
		
		public static void main(String[] args)
		{
		Car obj=new Car();
		obj.model="celerio";
		obj.brand="Maruthi";
		System.out.println(obj.model);
		System.out.println(obj.brand);
		obj.honk();
		
		
		}
		
	}


