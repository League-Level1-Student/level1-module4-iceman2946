package _01_chuckle_clicker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {
	
	
	public static void main(String[] args) {
		new ChuckleClicker().makeButtons();
		
	}
	JButton jokeButton= new JButton();
	JButton punchButton= new JButton();
	public void makeButtons() {
		JFrame frame= new JFrame();
		frame.setVisible(true);
		JPanel panel= new JPanel();
		frame.add(panel);
		JLabel label= new JLabel("joke");
		jokeButton.add(label);
		JLabel label2= new JLabel("punchline");
		punchButton.add(label2);
		jokeButton.addActionListener(this);
		punchButton.addActionListener(this);
		panel.add(punchButton);
		panel.add(jokeButton);
		frame.pack();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonPressed= (JButton) e.getSource();
		if(buttonPressed != null) {
			JOptionPane.showMessageDialog(null,"hi");
		}
		if(buttonPressed == jokeButton) {
			JOptionPane.showMessageDialog(null,"Which tea is hardest to swallow?");
			JOptionPane.showMessageDialog(null, "Reality");
		}
		if(buttonPressed == punchButton) {
			JOptionPane.showMessageDialog(null, "Here's a punchline from Moss Def:\n "
					+ "'I don't hate players, I don't love the game\n" + 
					"I'm the shot clock, way above the game'");
		}
	}
}
