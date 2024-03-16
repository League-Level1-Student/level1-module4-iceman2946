package _06_calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener {
	JFrame frame= new JFrame();
	JPanel panel= new JPanel();
	JTextField text= new JTextField(10);
	JTextField text2= new JTextField(10);
	JButton add= new JButton();
	JButton subtract= new JButton();
	JButton multiply= new JButton();
	JButton divide= new JButton();
	void calculate() {
		frame.setVisible(true);
		frame.add(panel);
		text.addActionListener(this);
		text2.addActionListener(this);
		panel.add(text);
		panel.add(text2);
		JLabel label= new JLabel("add");
		add.add(label);
		add.addActionListener(this);
		panel.add(add);
		JLabel label2= new JLabel("subtract");
		subtract.add(label2);
		subtract.addActionListener(this);
		panel.add(subtract);
		JLabel label3= new JLabel("multiply");
		multiply.add(label3);
		multiply.addActionListener(this);
		panel.add(multiply);
		JLabel label4= new JLabel("divide");
		divide.add(label4);
		divide.addActionListener(this);
		panel.add(divide);
		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonPressed= (JButton) e.getSource();
		int number1= Integer.parseInt(text.getText());
		int number2= Integer.parseInt(text2.getText());
		int answer = 0;
		JLabel label= new JLabel();
		panel.add(label);
		if(buttonPressed==add) {
			answer= number1+number2;
			String addAnswer=Integer.toString(answer);
			label.setText(addAnswer);
			}
		if(buttonPressed==subtract) {
			if(number1>number2) {
				answer=number1-number2;
				}
			if(number2>number1) {
				answer=number2-number1;
			}
			String subAnswer=Integer.toString(answer);
			label.setText(subAnswer);
		}
		if(buttonPressed==multiply) {
			answer=number1 *number2;
			String multiAnswer=Integer.toString(answer);
			label.setText(multiAnswer);
		}
		if(buttonPressed==divide) {
			if(number1>number2) {
				answer=number1/number2;
			}
			if(number2>number1) {
				answer=number2/number1;
			}
			String diviAnswer=Integer.toString(answer);
			label.setText(diviAnswer);
		}
		
	}
}
