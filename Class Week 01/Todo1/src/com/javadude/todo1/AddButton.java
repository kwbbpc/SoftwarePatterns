package com.javadude.todo1;

import java.awt.Button;
import java.awt.HeadlessException;
import java.awt.List;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddButton extends Button {
	private List list;
	private TextField textField;
	
	public AddButton(List list, TextField textField) throws HeadlessException {
		this.list = list;
		this.textField = textField;
	}

	public AddButton() {
		addActionListener(new ActionListener() {
			@Override public void actionPerformed(ActionEvent arg0) {
				list.add(textField.getText());
			}});
	}
}
