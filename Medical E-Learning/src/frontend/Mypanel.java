package frontend;

import java.awt.Color;

import javax.swing.JPanel;

public class Mypanel extends JPanel {
	public static Mypanel panel1;
	
	public Mypanel(int x, int y, int width, int height){
		setVisible(true);
		setLocation(x, y);
		setSize(width, height);
		setBackground(Color.red);
		setLayout(null);
	}

}
