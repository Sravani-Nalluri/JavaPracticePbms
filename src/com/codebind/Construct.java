package com.codebind;

public class Construct {
	int x;
	public Construct()//constructor name equal to class name
	{
		x=78;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Construct obj=new Construct();//this will call constructor by default
		System.out.println(obj.x);

	}

}
