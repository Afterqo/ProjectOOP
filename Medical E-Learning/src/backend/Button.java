package backend;

import frontend.Mybutton;

public class Button {
	ButtonAction action;
	String name;
	Mybutton button1;
	
	Button(ButtonAction action){
		button1 = new Mybutton("button1", this);
		this.action = action;
	}
	
	
	public void update(){
		
	}
	
	public void clicked(){
		//System.out.println("event sent");
		action.playAction();
	}
}
