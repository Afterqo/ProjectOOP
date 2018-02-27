package frontend;

import java.awt.Toolkit;

import javax.swing.JFrame;

public class Myframe extends JFrame {
	int defaultWidth = 800;
	int defaultHeight = 600;
	public Myframe(){
		setVisible(true);
		setSize(800, 600);
		setName("Calculator");
		setLocation((Toolkit.getDefaultToolkit().getScreenSize().width /2) - (defaultWidth/2),(Toolkit.getDefaultToolkit().getScreenSize().height /2) - (defaultHeight/2));
		Mypanel.panel1 = new Mypanel(0, 0, 800, 600);
		add(Mypanel.panel1);
	}
}
