package met.view;

import javax.swing.JFrame;
import met.controller.MetController;

public class SecondFrame extends JFrame
{
	private MetController appController;
	private SecondPanel appPanel;
	
	public SecondFrame(MetController appController)
	{
		super();
		
		this.appController = appController;
		this.appPanel = new SecondPanel(appController);
		
		setupFrame();
	}
	
	public void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setSize(420,420);
		this.setTitle("This is a frame");
		this.setResizable(true);
		this.setVisible(true);
	}

}
