package com.javadude.todo1;

import java.awt.Button;
import java.awt.HeadlessException;
import java.awt.List;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddButtonForMediator extends Button {
	private Mediator mediator;
	
	public AddButtonForMediator(Mediator mediator) throws HeadlessException {
		this.mediator = mediator;
	}

	public AddButtonForMediator() {
		addActionListener(new ActionListener() {
			@Override public void actionPerformed(ActionEvent arg0) {
				mediator.add();
			}});
	}
}
