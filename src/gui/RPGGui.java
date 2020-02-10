package gui;

import java.awt.Frame;
import java.awt.Window;

public class RPGGui {

	Frame window;
	
	public RPGGui() {
		window = new Frame();
		window.setName("Unnamed RPG");
		initialize(window);
	}
	
	private void initialize(Window window) {
		window.setBounds(50, 50, 400, 400);
		
	}
	
}
