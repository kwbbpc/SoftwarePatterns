package com.javadude.todo1;

import java.awt.Button;
import java.awt.HeadlessException;
import java.awt.List;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RemoveButton extends Button {
	private List list;
	
	public RemoveButton(List list) throws HeadlessException {
		this.list = list;
	}

	public RemoveButton() {
		addActionListener(new ActionListener() {
			@Override public void actionPerformed(ActionEvent arg0) {
				list.remove(list.getSelectedIndex());
			}});
	}
}
