package com.app.ioc.IoC;

public class Medico {

	IUtensiolios tools;
	
	public void setTools(IUtensiolios tools)
	{
		this.tools = tools;
	}
	public void operar()
	{
		System.out.println("Operando!!!");
		tools.usar();
	}
}
