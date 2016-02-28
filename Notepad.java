import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Notepad implements ActionListener {
	Jamie jamie = new Jamie();
	final int sideSize = 500;
	JFrame frame;
	JPanel panel;
	JTextArea textArea;
	JButton clear;
	JButton done;
	JButton save;
	JButton undo;
	JButton redo;
	String save1;
	String save2;
	String save3;
	String save4;
	String save5;
	int numberOfSaves = 0;

	Notepad() {
		if (!jamie.frameHasBeenCreated) {
			notepadStarter();
			jamie.frameHasBeenCreated = true;
		} else {
			notepadOpener();
		}
	}

	void notepadCloser() {
		frame.setVisible(false);
	}

	void notepadOpener() {
		frame.setVisible(true);
	}

	@SuppressWarnings("static-access")
	void notepadStarter() {
		jamie.keepClassOpen = "BLAH";
		frame = new JFrame(jamie.name1);
		panel = new JPanel();
		textArea = new JTextArea();
		clear = new JButton("Clear");
		done = new JButton("Done");
		save = new JButton("Save");
		undo = new JButton("Undo");
		redo = new JButton("Redo");
		frame.setVisible(true);
		frame.setSize(sideSize, sideSize);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		panel.add(textArea);
		panel.add(clear);
		panel.add(undo);
		panel.add(redo);
		panel.add(save);
		panel.add(done);
		clear.addActionListener(this);
		save.addActionListener(this);
		undo.addActionListener(this);
		redo.addActionListener(this);
		done.addActionListener(this);
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
		textArea.setOpaque(false);
		textArea.setEditable(true);
		textArea.setBounds(15, 15, sideSize - 15, sideSize - 15);
		while (jamie.keepClassOpen.equalsIgnoreCase("BLAH")) {

		}
	}

	void notepadClearer() {

	}

	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == done) {
			notepadCloser();
			jamie.keepClassOpen = "BLEE";
		}
		if (arg0.getSource() == clear) {
			textArea.setText("");
		}
		if (arg0.getSource() == save) {
			if (numberOfSaves == 0) {
				save1 = textArea.getText();
				numberOfSaves++;
			}
			if (numberOfSaves == 1) {
				save2 = textArea.getText();
				numberOfSaves++;
			}
			if (numberOfSaves == 2) {
				save3 = textArea.getText();
				numberOfSaves++;
			}
			if (numberOfSaves == 3) {
				save4 = textArea.getText();
				numberOfSaves++;
			}
			if (numberOfSaves == 4) {
				save5 = textArea.getText();
				numberOfSaves = 0;
			}
		}
		if (arg0.getSource() == undo) {
			if (numberOfSaves == 0) {
				textArea.setText(save5);
			}
			if (numberOfSaves == 1) {
				textArea.setText(save1);
			}
			if (numberOfSaves == 2) {
				textArea.setText(save2);
			}
			if (numberOfSaves == 3) {
				textArea.setText(save3);
			}
			if (numberOfSaves == 4) {
				textArea.setText(save4);
			}
		}
		if (arg0.getSource() == redo) {
			if (numberOfSaves == 0) {
				textArea.setText(save2);
			}
			if (numberOfSaves == 1) {
				textArea.setText(save3);
			}
			if (numberOfSaves == 2) {
				textArea.setText(save4);
			}
			if (numberOfSaves == 3) {
				textArea.setText(save5);
			}
			if (numberOfSaves == 4) {
				textArea.setText(save1);
			}
		}
	}
}