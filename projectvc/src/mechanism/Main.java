package mechanism;

import javax.swing.JFrame;

public class Main {
	public static void main(String[] args) 
	{
		JFrame window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(false);
		window.setTitle("dit me thanh");
		
		GamePanel gamepanel = new GamePanel();
		window.add(gamepanel);
		window.pack();
		gamepanel.SetupGame();
		window.setLocationRelativeTo(null);
		window.setVisible(true);
		gamepanel.StartGame();
	}

}
