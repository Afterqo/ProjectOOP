package frontend;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import backend.Button;

public class Mybutton extends JButton implements ActionListener{
	private Button owner;

	public Mybutton(String name, Button owner){
		setVisible(true);
		setSize(100, 100);
		setLocation(100, 100);
		setName(name);
		setText(name);
		addActionListener(this);
		Mypanel.panel1.add(this);
		this.owner = owner;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		System.out.println("pressed");
		owner.clicked();
	}
	

}
