package com.sip.ocp17.day7.generics;

public class Container <T>{
	
	public T contenu;
	
	public void display()
	{
		System.out.println(this.contenu);
	}

	public Container(T t)
	{
		this.contenu = t;
	}
	
	@Override
	public String toString()
	{
		return "Container";
	}
}
