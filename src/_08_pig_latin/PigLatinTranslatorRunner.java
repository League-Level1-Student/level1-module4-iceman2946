package _08_pig_latin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import game_tools.Sound;

public class PigLatinTranslatorRunner implements ActionListener {
	static PigLatinTranslator translate;
	JButton button= new JButton(">>");
	JTextField text= new JTextField(20);
	JButton button2= new JButton("<<");
	JTextField text2= new JTextField(20);
	JButton speak= new JButton("speak");
	 void translate() {
		JFrame frame= new JFrame();
		frame.setVisible(true);
		JPanel panel= new JPanel();
		frame.add(panel);
		panel.add(text);
		panel.add(button);
		panel.add(button2);
		panel.add(text2);
		panel.add(speak);
		button.addActionListener(this);
		button2.addActionListener(this);
		speak.addActionListener(this);
		frame.pack();
	}
	public static void main(String[] args) {
		translate= new PigLatinTranslator();
	}
	


		
	





	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonPressed= (JButton) e.getSource();
		String english= text.getText();
		String pigLatin= text2.getText();
		if(buttonPressed== button) {
			text2.setText(PigLatinTranslator.translateEnglishToPigLatin(english));
		}
		if(buttonPressed== button2) {
			text.setText(PigLatinTranslator.translatePigLatinToEnglish(pigLatin));
		}
		if(buttonPressed== speak) {
			Sound.speak(pigLatin);
		}

		
		
	}
}
