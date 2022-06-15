package com.codebind;

public class StatvsNonstat {
	int x,y;
	
	static void staticMethod()
	{
		System.out.println("for static methods no need to create object");
	}
   
	public void publicMethod(int x,int y)
	{
	 this.x=x;
	 this.y=y;
	 System.out.println(x+y);
	   
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		staticMethod();
		StatvsNonstat obj=new StatvsNonstat ();
		obj.publicMethod(20, 30);
		
	}

}
