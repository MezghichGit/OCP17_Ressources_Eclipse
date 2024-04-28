package com.sip.ocp17.day4.part3_NestedClasses;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TestSwing {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Calculatrice");
		//JPanel menu = new JPanel();
		JButton bouton = new JButton("Click");
		bouton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Bouton Clicked");
				
			}
		});
		frame.add(bouton);
		frame.show();
	}

}
