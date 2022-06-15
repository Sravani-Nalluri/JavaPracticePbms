package com.codebind;

abstract class Birds {
	public abstract void birdSound();//abstract method no body
	
	public void sleep()//regular method
	{
		System.out.println("Zzz");
	}	

}


class Crow extends Birds

{
	
	public void birdSound()
	{
		System.out.println("cowwwwww");
	}
}