package com.javadude.todo1;

import java.awt.List;
import java.awt.TextField;

public class Mediator {
	private TextField textField;
	private List list;
	public Mediator(TextField textField, List list) {
		this.textField = textField;
		this.list = list;
	}
	
	public void add() {
		list.add(textField.getText());
	}
	public void remove() {
		list.remove(list.getSelectedIndex());
	}
}
