package com.hyperion.training.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

import javax.swing.*;

public class TestComponent {
	
	private String t1 = "Datos blah blah blah";
	private JFrame frame = new JFrame();
	private JTextField textField1 = new JTextField();
	private JButton button1 = new JButton("Soy un boton!");
	private JLabel label1 = new JLabel();
	private JCheckBox j1 = new JCheckBox();
	private JLabel labelCheckbox = new JLabel();
	private JLabel labelCheckboxResult = new JLabel();
	private JLabel labelCbResult = new JLabel();
	private JComboBox cb;
	
	public TestComponent() {
		
		//textField1.setBounds(100,100,120,30);
		label1.setBounds(150,50,50,30);
		//button1.setBounds(100,150,120,50);
		j1.setBounds(100,50,120,30);
		labelCheckbox.setBounds(100,70,120,30);
		labelCheckboxResult.setBounds(100,100,120,30);
		labelCbResult.setBounds(100,150,120,30);
		label1.setText("DATO");
		labelCheckbox.setText("First checkbox");
		labelCheckboxResult.setText("unchecked");
		String cbData[] = {"Option A","Option B"};
		cb  = new JComboBox(cbData);
		cb.setBounds(100,130,120,30);
		
		cb.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				labelCbResult.setText("Option: " +
						cb.getItemAt(cb.getSelectedIndex()) );
			}
		});
		
		j1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {			
				//labelCheckboxResult.setText(
				//(e.getStateChange() == 1? "Checked":"unchecked"));
				if(e.getStateChange() == 1) {
					labelCheckboxResult.setText("checked");	
				} else {
					labelCheckboxResult.setText("Un-checked");
				}
				
			}		
		});
	
		button1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				textField1.setText(t1);
				int i = Integer.parseInt(textField1.getText());
				int j =Integer.parseInt(textField1.getText());  
				System.out.println("Dato:" + textField1.getText());
			}
		});
		
		
		frame.add(label1);
		frame.add(j1);
		frame.add(labelCheckbox);
		frame.add(labelCheckboxResult);
		frame.add(cb);
		frame.add(labelCbResult);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	
	public static void main(String... args) {
	
		new TestComponent();
	}

}
