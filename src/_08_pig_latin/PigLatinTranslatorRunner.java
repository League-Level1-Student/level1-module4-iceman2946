package _08_pig_latin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PigLatinTranslatorRunner implements ActionListener {
	static PigLatinTranslator translator;
	JButton button= new JButton(">>");
	JTextField text= new JTextField(20);
	 void translate() {
		JFrame frame= new JFrame();
		frame.setVisible(true);
		JPanel panel= new JPanel();
		frame.add(panel);
		panel.add(text);
		panel.add(button);
		button.addActionListener(this);
	}
	public static void main(String[] args) {
		translator= new PigLatinTranslator();
		
	}

		
	





	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
