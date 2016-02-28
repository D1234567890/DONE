import javax.swing.JOptionPane;

public class ListsOfLists {
	Jamie jamie = new Jamie();

	@SuppressWarnings("static-access")
	void list() {
		if (!jamie.toClass.contains("what is")) {
			if (!jamie.listHasBeenCreated) {
				jamie.joptionpane = "What would you like to name your list?";
				jamie.speak(jamie.joptionpane);
				String list = JOptionPane.showInputDialog(jamie.joptionpane);
				jamie.listName = list;
				jamie.joptionpane = "What would you like to add to your " + jamie.listName + " list?";
				jamie.speak(jamie.joptionpane);
				String whatToAdd = JOptionPane.showInputDialog(jamie.joptionpane);
				jamie.list1[jamie.numberOnList] = whatToAdd;
				jamie.numberOnList++;
				jamie.listHasBeenCreated = true;
				jamie.joptionpane = "Okay!";
				jamie.speak(jamie.joptionpane);
				JOptionPane.showMessageDialog(null, jamie.joptionpane);
			} else {
				jamie.joptionpane = "Would you like to add or check off something on your list?";
				jamie.speak(jamie.joptionpane);
				String addOrRemove = JOptionPane.showInputDialog(jamie.joptionpane);
				while (!addOrRemove.contains("remove") && !addOrRemove.contains("add")
						&& !addOrRemove.contains("check")) {
					jamie.joptionpane = "Please say add or remove!";
					jamie.speak(jamie.joptionpane);
					addOrRemove = JOptionPane.showInputDialog(jamie.joptionpane);
				}
				if (addOrRemove.contains("add")) {
					if (jamie.numberOnList <= 9) {
						jamie.joptionpane = "What would you like to add to your " + jamie.listName + " list?";
						jamie.speak(jamie.joptionpane);
						String whatToAdd = JOptionPane.showInputDialog(jamie.joptionpane);
						jamie.list1[jamie.numberOnList] = whatToAdd;
						jamie.numberOnList++;
						jamie.joptionpane = "Okay!";
						jamie.speak(jamie.joptionpane);
						JOptionPane.showMessageDialog(null, jamie.joptionpane);
					} else {
						jamie.joptionpane = "You can only have 10 items on your list!";
						jamie.speak(jamie.joptionpane);
						JOptionPane.showMessageDialog(null, jamie.joptionpane);
					}
				} else {
					jamie.joptionpane = "What item would you like to check off?";
					jamie.speak(jamie.joptionpane);
					String timeToRemove = JOptionPane.showInputDialog(jamie.joptionpane);
					if (jamie.list1[0].contains(timeToRemove) && jamie.numberOnList >= 0) {
						jamie.list1[0] = jamie.list1[0] + " Done!";
						jamie.joptionpane = "Okay!";
						jamie.speak(jamie.joptionpane);
						JOptionPane.showMessageDialog(null, jamie.joptionpane);
					} else if (jamie.list1[1].contains(timeToRemove) && jamie.numberOnList >= 1) {
						jamie.list1[1] = jamie.list1[1] + " Done!";
						jamie.joptionpane = "Okay!";
						jamie.speak(jamie.joptionpane);
						JOptionPane.showMessageDialog(null, jamie.joptionpane);
					} else if (jamie.list1[2].contains(timeToRemove) && jamie.numberOnList >= 2) {
						jamie.list1[2] = jamie.list1[2] + " Done!";
						jamie.joptionpane = "Okay!";
						jamie.speak(jamie.joptionpane);
						JOptionPane.showMessageDialog(null, jamie.joptionpane);
					} else if (jamie.list1[3].contains(timeToRemove) && jamie.numberOnList >= 3) {
						jamie.list1[3] = jamie.list1[3] + " Done!";
						jamie.joptionpane = "Okay!";
						jamie.speak(jamie.joptionpane);
						JOptionPane.showMessageDialog(null, jamie.joptionpane);
					} else if (jamie.list1[4].contains(timeToRemove) && jamie.numberOnList >= 4) {
						jamie.list1[4] = jamie.list1[4] + " Done!";
						jamie.joptionpane = "Okay!";
						jamie.speak(jamie.joptionpane);
						JOptionPane.showMessageDialog(null, jamie.joptionpane);
					} else if (jamie.list1[5].contains(timeToRemove) && jamie.numberOnList >= 5) {
						jamie.list1[5] = jamie.list1[5] + " Done!";
						jamie.joptionpane = "Okay!";
						jamie.speak(jamie.joptionpane);
						JOptionPane.showMessageDialog(null, jamie.joptionpane);
					} else if (jamie.list1[6].contains(timeToRemove) && jamie.numberOnList >= 6) {
						jamie.list1[6] = jamie.list1[6] + " Done!";
						jamie.joptionpane = "Okay!";
						jamie.speak(jamie.joptionpane);
						JOptionPane.showMessageDialog(null, jamie.joptionpane);
					} else if (jamie.list1[7].contains(timeToRemove) && jamie.numberOnList >= 7) {
						jamie.list1[7] = jamie.list1[7] + " Done!";
						jamie.joptionpane = "Okay!";
						jamie.speak(jamie.joptionpane);
						JOptionPane.showMessageDialog(null, jamie.joptionpane);
					} else if (jamie.list1[8].contains(timeToRemove) && jamie.numberOnList >= 8) {
						jamie.list1[8] = jamie.list1[8] + " Done!";
						jamie.joptionpane = "Okay!";
						jamie.speak(jamie.joptionpane);
						JOptionPane.showMessageDialog(null, jamie.joptionpane);
					} else if (jamie.list1[9].contains(timeToRemove) && jamie.numberOnList >= 9) {
						jamie.list1[9] = jamie.list1[9] + " Done!";
						jamie.joptionpane = "Okay!";
						jamie.speak(jamie.joptionpane);
						JOptionPane.showMessageDialog(null, jamie.joptionpane);
					} else {
						jamie.joptionpane = "I couldn't find anything on your list with " + timeToRemove;
						jamie.speak(jamie.joptionpane);
						JOptionPane.showMessageDialog(null, jamie.joptionpane);
					}
				}
			}
		} else {
			if (jamie.numberOnList == 9) {
				jamie.joptionpane = "Here is what you have on your list: " + jamie.list1[0] + ", " + jamie.list1[1]
						+ ", " + jamie.list1[2] + ", " + jamie.list1[3] + ", " + jamie.list1[4] + ", " + jamie.list1[5]
						+ ", " + jamie.list1[6] + ", " + jamie.list1[7] + ", " + jamie.list1[8] + ", " + jamie.list1[9]
						+ ".";
				jamie.speak(jamie.joptionpane);
				JOptionPane.showMessageDialog(null, jamie.joptionpane);
			}
			if (jamie.numberOnList == 9) {
				jamie.joptionpane = "Here is what you have on your list: " + jamie.list1[0] + ", " + jamie.list1[1]
						+ ", " + jamie.list1[2] + ", " + jamie.list1[3] + ", " + jamie.list1[4] + ", " + jamie.list1[5]
						+ ", " + jamie.list1[6] + ", " + jamie.list1[7] + ", " + jamie.list1[8] + ".";
				jamie.speak(jamie.joptionpane);
				JOptionPane.showMessageDialog(null, jamie.joptionpane);
			}
			if (jamie.numberOnList == 8) {
				jamie.joptionpane = "Here is what you have on your list: " + jamie.list1[0] + ", " + jamie.list1[1]
						+ ", " + jamie.list1[2] + ", " + jamie.list1[3] + ", " + jamie.list1[4] + ", " + jamie.list1[5]
						+ ", " + jamie.list1[6] + ", " + jamie.list1[7] + ".";
				jamie.speak(jamie.joptionpane);
				JOptionPane.showMessageDialog(null, jamie.joptionpane);
			}
			if (jamie.numberOnList == 7) {
				jamie.joptionpane = "Here is what you have on your list: " + jamie.list1[0] + ", " + jamie.list1[1]
						+ ", " + jamie.list1[2] + ", " + jamie.list1[3] + ", " + jamie.list1[4] + ", " + jamie.list1[5]
						+ ", " + jamie.list1[6] + ".";
				jamie.speak(jamie.joptionpane);
				JOptionPane.showMessageDialog(null, jamie.joptionpane);
			}
			if (jamie.numberOnList == 6) {
				jamie.joptionpane = "Here is what you have on your list: " + jamie.list1[0] + ", " + jamie.list1[1]
						+ ", " + jamie.list1[2] + ", " + jamie.list1[3] + ", " + jamie.list1[4] + ", " + jamie.list1[5]
						+ ".";
				jamie.speak(jamie.joptionpane);
				JOptionPane.showMessageDialog(null, jamie.joptionpane);
			}
			if (jamie.numberOnList == 5) {
				jamie.joptionpane = "Here is what you have on your list: " + jamie.list1[0] + ", " + jamie.list1[1]
						+ ", " + jamie.list1[2] + ", " + jamie.list1[3] + ", " + jamie.list1[4] + ".";
				jamie.speak(jamie.joptionpane);
				JOptionPane.showMessageDialog(null, jamie.joptionpane);
			}
			if (jamie.numberOnList == 4) {
				jamie.joptionpane = "Here is what you have on your list: " + jamie.list1[0] + ", " + jamie.list1[1]
						+ ", " + jamie.list1[2] + ", " + jamie.list1[3] + ".";
				jamie.speak(jamie.joptionpane);
				JOptionPane.showMessageDialog(null, jamie.joptionpane);
			}
			if (jamie.numberOnList == 3) {
				jamie.joptionpane = "Here is what you have on your list: " + jamie.list1[0] + ", " + jamie.list1[1]
						+ ", " + jamie.list1[2] + ".";
				jamie.speak(jamie.joptionpane);
				JOptionPane.showMessageDialog(null, jamie.joptionpane);
			}
			if (jamie.numberOnList == 2) {
				jamie.joptionpane = "Here is what you have on your list: " + jamie.list1[0] + ", " + jamie.list1[1]
						+ ".";
				jamie.speak(jamie.joptionpane);
				JOptionPane.showMessageDialog(null, jamie.joptionpane);
			}
			if (jamie.numberOnList == 1) {
				jamie.joptionpane = "Here is what you have on your list: " + jamie.list1[0] + ".";
				jamie.speak(jamie.joptionpane);
				JOptionPane.showMessageDialog(null, jamie.joptionpane);
			}
			if (jamie.numberOnList == 0) {
				jamie.joptionpane = "You haven't created a list yet! To create one, just say 'create a list'. I will then guide you through the instructions!";
				jamie.speak(jamie.joptionpane);
				JOptionPane.showMessageDialog(null, jamie.joptionpane);
			}
		}
	}
}