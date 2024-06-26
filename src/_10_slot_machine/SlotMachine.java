package _10_slot_machine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SlotMachine implements ActionListener {
	JFrame frame= new JFrame();
	JPanel panel= new JPanel();
	JButton spin= new JButton("SPIN");
	Random r= new Random();
	void spin() throws MalformedURLException {
		frame.setVisible(true);
		frame.setSize(800,800);
		frame.add(panel);
		panel.add(createCherryLabel());
		panel.add(createOrangeLabel());
		panel.add(createTomatoLabel());
		panel.add(spin);
		spin.addActionListener(this);
		frame.pack();
	}
	private JLabel createCherryLabel() throws MalformedURLException {
		return createLabelImage("cherry.png");
	}
	private JLabel createOrangeLabel() throws MalformedURLException {
		return createLabelImage("orange.png") ;
	}
	private JLabel createTomatoLabel() throws MalformedURLException {
		return createLabelImage("tomato.png");
	}
	private JLabel createLabelImage(String fileName) throws MalformedURLException{
        URL imageURL = getClass().getResource(fileName);
	if (imageURL == null){
		System.err.println("Could not find image " + fileName);
		return new JLabel();
	}
	Icon icon = new ImageIcon(imageURL);
	JLabel imageLabel = new JLabel(icon);
	return imageLabel;
}
	int a=0;
	int b=0;
	int c=0;
	@Override
	public void actionPerformed(ActionEvent e) {
		panel.removeAll();
		for(int i=0; i<3; i++) {
			int x= r.nextInt(3);
			try {
			switch(x) {
			case 0:
				panel.add(createCherryLabel());
				a+=1;
				break;
			case 1:
				panel.add(createOrangeLabel());
				b+=1;
				break;
			case 2:
				panel.add(createTomatoLabel());
				c+=1;
				break;
			}
			}
			catch (Exception k) {
				k.printStackTrace();
			}

			
		}
		if(a==3) {
			JLabel label= new JLabel("YOU WIN!");
			panel.add(label);
		}
		else if(b==3) {
			JLabel label1= new JLabel("YOU WIN!");
			panel.add(label1);
		}
		else if(c==3) {
			JLabel label2= new JLabel("YOU WIN!");
			panel.add(label2);
		}
		panel.add(spin);
		frame.pack();
		
		
		
	}
    
}
