package gui.view;

import javax.swing.JFrame;
import gui.controller.GUIController;

public class FirstFrame extends JFrame
{
	private GUIController appController;
	private FirstPanel appPanel;
	
	public FirstFrame(GUIController appController)
	{
		super();
		this.appController = appController;
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setSize(800, 800);
		this.setTitle("hello");
		this.setResizable(true);
		this.setVisible(true);
	}

}
