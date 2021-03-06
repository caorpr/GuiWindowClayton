package gui.view;

import javax.swing.JFrame;
import gui.controller.GuiController;


public class GuiFrame extends JFrame
{
	private GuiController baseController;
	private GuiPanel basePanel;
	
	public GuiFrame(GuiController baseController)
	{
		this.baseController = baseController;
		basePanel = new GuiPanel(baseController);
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setResizable(false);
		this.setTitle("Second Window I Have Ever Made.");
		this.setSize(400, 400);
		this.setVisible(true);
	}
	
	public GuiController getBaseController()
	{
		return baseController;
	}
}
