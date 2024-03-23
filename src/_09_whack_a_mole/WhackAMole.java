package _09_whack_a_mole;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener {
	
	int randomButton= (int) new Random().nextInt(25);
	JButton mole;
	JPanel panel= new JPanel();
	void CreateFrame() {
		JFrame frame= new JFrame();
		frame.setVisible(true);
		frame.setSize(30,30);
		frame.add(panel);
		DrawButtons(randomButton);
	}
	void DrawButtons(int randomButton) {
		for(int i=1; i<25; i++) {
			JButton button = new JButton();
			panel.add(button);
			button.addActionListener(this);
			if(i==randomButton) {
				mole=button;
				button.setText("mole");
			}
		}
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
