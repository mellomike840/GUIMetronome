package met.controller;

import met.model.Dog;
import met.view.SecondFrame;

public class MetController 
{
	private Dog jasper;
	private SecondFrame appFrame;
	
	public MetController()
	{
		jasper = new Dog();
		appFrame = new SecondFrame(this);
	}
	
	public void start()
	{
		
	}

}
