package backend;

import frontend.Myframe;

public class Main {
	public static void main(String[] args) {
		new Myframe();
		Button b1 = new Button(new TestAction());
		while(true)
		{
			b1.update();
		}
	}
}
