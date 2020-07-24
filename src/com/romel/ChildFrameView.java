package com.romel;

import java.awt.GridLayout;
import java.awt.BorderLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

public class ChildFrameView {
	
	JFrame frame;
	JFrame parentFrame;
	JPanel panel;
	JButton buttonClose;
	
	public ChildFrameView(JFrame parentFrame) {
		frame = new JFrame();
		frame.setTitle("JFrame Child");
		this.parentFrame = parentFrame;
		initialiseComponents();
		setFrame();
	}
	
	public ChildFrameView(JFrame parentFrame, String title) {
		frame = new JFrame();
		frame.setTitle(title);
		this.parentFrame = parentFrame;
		initialiseComponents();
		setFrame();
	}
	
	public JFrame getChildFrame() {
		return frame;
	}
	
	public JFrame getParentFrame() {
		return parentFrame;
	}
	
	public JButton getButtonClose() {
		return buttonClose;
	}
	
	private void initialiseComponents() {
		panel = new JPanel(new GridLayout(1, 1));
		panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
		
		buttonClose = new JButton("Close");
		
		panel.add(buttonClose);
	}
	
	private void setFrame() {
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setLocationRelativeTo(parentFrame);
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		
		frame.setAlwaysOnTop(true);
		parentFrame.setEnabled(false);
		parentFrame.setFocusableWindowState(false);
	}
	
	public void showGUI() {
		frame.pack();
		frame.setVisible(true);
	}
	
}
