package com.romel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;

import javax.swing.JFrame;

public class ChildFrameController {
	
	ChildFrameView view;
	
	public ChildFrameController(JFrame parentFrame) {
		view = new ChildFrameView(parentFrame);
	}
	
	public void run() {
		setListeners();
		view.showGUI();
	}
	
	public void setListeners() {
		view.getButtonClose().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent actionEvent) {
				view.getParentFrame().setEnabled(true);
				view.getParentFrame().setFocusableWindowState(true);
				view.getChildFrame().dispose();
			}
		});
		
		view.getChildFrame().addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent windowEvent) {
				view.getParentFrame().setEnabled(true);
				view.getParentFrame().setFocusableWindowState(true);
				view.getChildFrame().dispose();
			}
		});
	}

}
