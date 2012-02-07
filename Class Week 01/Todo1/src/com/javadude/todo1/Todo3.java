package com.javadude.todo1;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.List;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Todo3 {
	@SuppressWarnings("serial")
	public static void main(String[] args) {
		new Frame() {{
			setLayout(new GridLayout(1,0,3,3));
			final List list = new List();
			add(list);
			add(new Panel(new BorderLayout()) {{
				final TextField tf = new TextField();
				final Mediator mediator = new Mediator(tf, list);
				add(tf, BorderLayout.NORTH);
				add(new Panel(new FlowLayout(FlowLayout.RIGHT)) {{
					add(new AddButtonForMediator(mediator));
					add(new RemoveButtonForMediator(mediator));
				}}, BorderLayout.SOUTH);
			}});
			addWindowListener(new WindowAdapter() {
				@Override public void windowClosing(WindowEvent e) {
					System.exit(0);
				}});
			setVisible(true);
		}};
	}
}
