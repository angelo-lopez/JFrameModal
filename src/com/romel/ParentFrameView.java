package com.romel;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.BorderFactory;

public class ParentFrameView {
	
	private JFrame frame;
	private JPanel panel;
	private JButton buttonCreateChild;
	private JButton buttonExit;
	
	//Constructors.
	
	public ParentFrameView() {
		frame = new JFrame();
		frame.setTitle("JFrame Parent");
		initialiseComponents();
		setFrame();
	}
	
	public ParentFrameView(String title) {
		frame = new JFrame();
		frame.setTitle(title);
		initialiseComponents();
		setFrame();
	}
	
	public ParentFrameView(boolean isMaximised) {
		frame = new JFrame();
		frame.setTitle("JFrame Parent");
		
		if(isMaximised) {
			frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		}
		
		initialiseComponents();
		setFrame();
	}
	
	public ParentFrameView(boolean isMaximised, String title) {
		frame = new JFrame();
		frame.setTitle(title);
		
		if(isMaximised) {
			frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		}
		
		initialiseComponents();
		setFrame();
	}
	
	public ParentFrameView(int width, int height) {
		frame = new JFrame();
		frame.setTitle("JFrame Parent");
		frame.setSize(width, height);
		initialiseComponents();
		setFrame();
	}
	
	public ParentFrameView(int width, int height, String title) {
		frame = new JFrame();
		frame.setTitle(title);
		frame.setSize(width, height);
		initialiseComponents();
		setFrame();
	}
	
	//Getters.
	
	public JFrame getFrame() {
		return frame;
	}
	
	public JButton getButtonCreateChild() {
		return buttonCreateChild;
	}
	
	public JButton getButtonExit() {
		return buttonExit;
	}
	
	//Custom methods.
	
	private void initialiseComponents() {
		panel = new JPanel(new GridLayout(2, 1));
		panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
		
		buttonCreateChild = new JButton("Create Child JFrame");
		buttonExit = new JButton("Exit");
		
		panel.add(buttonCreateChild);
		panel.add(buttonExit);
	}
	
	private void setFrame() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().add(panel, BorderLayout.CENTER);
	}
	
	public void showGUI() {
		frame.pack();
		frame.setVisible(true);
	}

}
