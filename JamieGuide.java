import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class JamieGuide implements ActionListener {
	final int sideSize = 500;
	static Jamie j = new Jamie();
	JFrame frame = new JFrame("Help Menu");
	JPanel panel = new JPanel();
	JTextArea textArea = new JTextArea();
	JButton button = new JButton("Done");
	boolean hasCreatedFrame = false;
	String userCanGo = "BLAH";

	@SuppressWarnings("static-access")
	JamieGuide() {
		j.joptionpane = "I have many abilities! To access them, when I ask what problems do you have for me, just say what you want me to do. If you want me to do math problems, you have to say solve a math problem. After that, just enter your math problem that has ONLY one symbol! After I do problems, I will ask you do you want me to do another problem or something along those lines. If you want me to do more problems, just say something that means yes. I can also set timers in many forms; minutes and seconds! I also have a variety of games that you can play with me! When I ask what problems do you have for me, just say play a game. I can play 3 games; rock paper scissors, guess the number, and long list! I can also say random numbers, letters, and colors! I also have a special pronunciation ability that will help you pronounce hard words. I can also give the date/time and much more! Remember to type options if you want more detailed instructions! Enjoy using me!";
		if (!hasCreatedFrame) {
			textArea.setText(j.joptionpane);
			textArea.setLineWrap(true);
			textArea.setWrapStyleWord(true);
			textArea.setOpaque(false);
			textArea.setEditable(false);
			textArea.setBounds(10, 10, sideSize - 10, sideSize - 10);
			frame.setVisible(true);
			frame.setSize(sideSize, sideSize);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.add(panel);
			panel.add(textArea);
			panel.add(button);
			button.addActionListener(this);
			j.speak(j.joptionpane);
			while (userCanGo.equalsIgnoreCase("BLAH")) {

			}
			frame.setVisible(false);
			hasCreatedFrame = true;
		} else {
			frame.setVisible(true);
			j.speak(j.joptionpane);
			frame.setVisible(false);
		}
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button) {
			userCanGo = "BLEE";
		}
	}
}