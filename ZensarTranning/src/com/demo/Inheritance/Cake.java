package com.demo.Inheritance;

public interface Cake 
{
	 //String str;
	public void bake();

}
class Strawberry implements Cake
{
	public void bake()
	{
		System.out.println("Strawberry cake has Baked");
	}
}
class BlackForest implements Cake
{
	public void bake()
	{
		System.out.println("BlackForest cake has Baked");
	}
	
}
class Interface
{
	public static void main(String[] args) 
	{
		Cake i;
		i=new BlackForest();
		i.bake();
		i=new Strawberry();
		i.bake();
	}

}