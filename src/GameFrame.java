import java.awt.*;
import javax.swing.*;

public class GameFrame extends JFrame { //Frame contains the min/max button, X button
	
	GamePanel panel; // This creates an instance of a GamePanel named panel
	
	GameFrame() {
		
		panel = new GamePanel();
		this.add(panel);
		this.setTitle("Pong Game");
		this.setResizable(false);
		this.setBackground(Color.black);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		
		
	}

}
