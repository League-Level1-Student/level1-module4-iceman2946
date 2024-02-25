package _03_typing_tutor;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class TypingTutor implements KeyListener {
	JFrame frame= new JFrame();
	JPanel panel= new JPanel();
	JLabel label= new JLabel();
	char currentLetter;
	void setup() {
		frame.setVisible(true);
		currentLetter= generateRandomLetter();
		label.setText(currentLetter+"");
		label.setFont(label.getFont().deriveFont(28.0f));
		label.setHorizontalAlignment(JLabel.CENTER);
		frame.addKeyListener(this);
		panel.add(label);
		frame.add(panel);
		frame.pack();
	}
	char generateRandomLetter() {
		Random r= new Random();
		return (char) (r.nextInt(26) +'a');
	}
	Date timeAtStart = new Date();
	
	private void showTypingSpeed(int numberOfCorrectCharactersTyped) {
	    Date timeAtEnd = new Date();
	    long gameDuration = timeAtEnd.getTime() - timeAtStart.getTime();
	    long gameInSeconds = (gameDuration / 1000) % 60;
	    double charactersPerSecond = ((double) numberOfCorrectCharactersTyped / (double) gameInSeconds);
	    int charactersPerMinute = (int) (charactersPerSecond * 60);
	    JOptionPane.showMessageDialog(null, "Your typing speed is " + charactersPerMinute + " characters per minute.");
	} 
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println("you typed: "+e.getKeyChar());
		if(e.getKeyChar()==currentLetter) {
			panel.setBackground(Color.GREEN);
		}
		else {
			panel.setBackground(Color.RED);
		}
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		currentLetter= generateRandomLetter();
		label.setText(currentLetter+"");
		
	}
}
