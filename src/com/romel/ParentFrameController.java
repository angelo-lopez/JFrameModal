package com.romel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;

public class ParentFrameController {
	
	ParentFrameView view;
	
	public ParentFrameController() {
		view = new ParentFrameView();
	}
	
	public void run() {
		setListeners();
		view.showGUI();
	}
	
	private void setListeners() {
		view.getButtonCreateChild().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent actionEvent) {
				ChildFrameController child = new ChildFrameController(view.getFrame());
				child.run();
			}
		});
		
		view.getButtonExit().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent actionEvent) {
				view.getFrame().dispatchEvent(new WindowEvent(view.getFrame(), WindowEvent.WINDOW_CLOSING));
			}
		});
	}

}
