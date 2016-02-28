import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Optionalitynessisticallyism implements ActionListener {
	Jamie object = new Jamie();
	final int sideSize = 500;
	boolean hasCreatedFrame = false;
	String keepClassOpen = "BLAH";
	JFrame frame;
	JPanel panel;
	JTextArea textArea;
	JButton done;
	JButton math;
	JButton pronounce;
	JButton joke;
	JButton game;
	JButton convert;
	JButton timer;
	JButton population;
	JButton time;
	JButton simon;
	JButton random;
	JButton pi;
	JButton randomQuestions;
	JButton notepad;
	JButton lists;
	JButton voice;

	@SuppressWarnings("static-access")
	Optionalitynessisticallyism() {
		if (!hasCreatedFrame) {
			object.joptionpane = "Here is what I can do. Click one of the buttons for some examples! Press Done when you are done! You don't have to memorize what the steps are because I can look for key words!";
			frame = new JFrame("Options Menu");
			panel = new JPanel();
			textArea = new JTextArea();
			done = new JButton("Done");
			math = new JButton("Math");
			pronounce = new JButton("Pronounce Words");
			joke = new JButton("Jokes");
			game = new JButton("Games");
			convert = new JButton("Measurement Conversions");
			timer = new JButton("Timers");
			population = new JButton("Population Facts");
			time = new JButton("Date/Time");
			simon = new JButton("Simon Says");
			pi = new JButton("Pi");
			random = new JButton("Random Colors, Numbers, and Letters");
			randomQuestions = new JButton("Other Questions");
			notepad = new JButton("Notepad");
			lists = new JButton("List");
			voice = new JButton("Voice Control");
			frame.setVisible(true);
			frame.setSize(sideSize, sideSize);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.add(panel);
			panel.add(textArea);
			panel.add(math);
			panel.add(pronounce);
			panel.add(joke);
			panel.add(game);
			panel.add(convert);
			panel.add(timer);
			panel.add(population);
			panel.add(time);
			panel.add(simon);
			panel.add(pi);
			panel.add(random);
			panel.add(lists);
			panel.add(notepad);
			panel.add(voice);
			panel.add(randomQuestions);
			panel.add(done);
			done.addActionListener(this);
			math.addActionListener(this);
			pronounce.addActionListener(this);
			joke.addActionListener(this);
			game.addActionListener(this);
			convert.addActionListener(this);
			timer.addActionListener(this);
			population.addActionListener(this);
			time.addActionListener(this);
			simon.addActionListener(this);
			pi.addActionListener(this);
			random.addActionListener(this);
			randomQuestions.addActionListener(this);
			lists.addActionListener(this);
			notepad.addActionListener(this);
			voice.addActionListener(this);
			done.setForeground(Color.GREEN);
			textArea.setText(object.joptionpane);
			textArea.setLineWrap(true);
			textArea.setWrapStyleWord(true);
			textArea.setOpaque(false);
			textArea.setEditable(false);
			textArea.setBounds(10, 10, sideSize - 10, sideSize - 10);
			hasCreatedFrame = true;
		} else {
			frame.setVisible(true);
		}
		while (keepClassOpen.equalsIgnoreCase("BLAH")) {

		}
		frame.setVisible(false);
	}

	@SuppressWarnings("static-access")
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == done) {
			keepClassOpen = "BLEE";
		}
		if (arg0.getSource() == math) {
			object.joptionpane = "Step 1, 'do a math problem', Step 2, '<number> <operation> <number>'";
			object.speak(object.joptionpane);
			JOptionPane.showMessageDialog(null, object.joptionpane);
		}
		if (arg0.getSource() == simon) {
			object.joptionpane = "Step 1, 'simon says', Step 2, '<enter your word>'";
			object.speak(object.joptionpane);
			JOptionPane.showMessageDialog(null, object.joptionpane);
		}
		if (arg0.getSource() == pronounce) {
			object.joptionpane = "Step 1, 'pronounce a word', Step 2, '<enter your word>'";
			object.speak(object.joptionpane);
			JOptionPane.showMessageDialog(null, object.joptionpane);
		}
		if (arg0.getSource() == joke) {
			object.joptionpane = "Step 1, 'give me a joke'";
			object.speak(object.joptionpane);
			JOptionPane.showMessageDialog(null, object.joptionpane);
		}
		if (arg0.getSource() == game) {
			object.joptionpane = "Step 1, 'play a game', Step 2, '(click on what game)', Step 3, listen to what I have to say and start!";
			object.speak(object.joptionpane);
			JOptionPane.showMessageDialog(null, object.joptionpane);
		}
		if (arg0.getSource() == convert) {
			object.joptionpane = "Step 1, 'convert measurements', Step 2, '<enter what category>', Step 3, proceed with the instructions and enter your unit!";
			object.speak(object.joptionpane);
			JOptionPane.showMessageDialog(null, object.joptionpane);
		}
		if (arg0.getSource() == timer) {
			object.joptionpane = "Step 1, 'set a timer', Step 2, '<enter what unit you want to set your timer in>', Step 3, '<enter how long you want your timer to be>'";
			object.speak(object.joptionpane);
			JOptionPane.showMessageDialog(null, object.joptionpane);
		}
		if (arg0.getSource() == population) {
			object.joptionpane = "Step 1, 'what is the population of <whatever your country is (must be in uppercase)>'";
			object.speak(object.joptionpane);
			JOptionPane.showMessageDialog(null, object.joptionpane);
		}
		if (arg0.getSource() == time) {
			object.joptionpane = "Step 1, 'what time is it'";
			object.speak(object.joptionpane);
			JOptionPane.showMessageDialog(null, object.joptionpane);
		}
		if (arg0.getSource() == pi) {
			object.joptionpane = "Step 1, 'recite pi'";
			object.speak(object.joptionpane);
			JOptionPane.showMessageDialog(null, object.joptionpane);
		}
		if (arg0.getSource() == random) {
			object.joptionpane = "Step 1, 'say a random <letter, number, or color>'";
			object.speak(object.joptionpane);
			JOptionPane.showMessageDialog(null, object.joptionpane);
		}
		if (arg0.getSource() == randomQuestions) {
			object.joptionpane = "Examples: 'what is your favorite color?' or 'what do you like doing in your free time'";
			object.speak(object.joptionpane);
			JOptionPane.showMessageDialog(null, object.joptionpane);
		}
		if (arg0.getSource() == notepad) {
			object.joptionpane = "Step 1, 'open notepad', Step 2, Have Fun!";
			object.speak(object.joptionpane);
			JOptionPane.showMessageDialog(null, object.joptionpane);
		}
		if (arg0.getSource() == lists) {
			object.joptionpane = "Step 1, 'create a list', Step 2, '<list name>', Step 3, '<add something to your list>'";
			object.speak(object.joptionpane);
			JOptionPane.showMessageDialog(null, object.joptionpane);
		}
		if (arg0.getSource() == voice) {
			object.joptionpane = "Step 1, 'turn <on or off> your voice'";
			object.speak(object.joptionpane);
			JOptionPane.showMessageDialog(null, object.joptionpane);
		}
	}
}