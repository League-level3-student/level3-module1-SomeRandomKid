package _06_Intro_To_Hash_Maps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_LogSearch implements ActionListener {
	HashMap<Integer, String> values = new HashMap<Integer, String>();
	 JFrame Frame;
	 JPanel Panel;
	 JButton Button1;
	 JButton Button2; 
	 JButton Button3;
	 JButton Button4;
	 
	public static void main(String[] args) {
		 _02_LogSearch start = new _02_LogSearch();
	}
	
	_02_LogSearch() { 
		 Frame = new JFrame();
		 Frame.setVisible(true);
		 Panel = new JPanel();
		 Button1 = new JButton("Add Entry");
		 Button2 = new JButton("Search by ID");
		 Button3 = new JButton("View List");
		 Button4 = new JButton("Remove Entry");
		 Frame.add(Panel);
		 Panel.add(Button1);
		 Panel.add(Button2);
		 Panel.add(Button3);
		 Panel.add(Button4);
		 Button1.addActionListener(this);
		 Button2.addActionListener(this);
		 Button3.addActionListener(this);
		 Button4.addActionListener(this);
		 Frame.pack();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int IDnum = 0;
		JButton ButtonPressed = (JButton) e.getSource();
		if (ButtonPressed == Button1) {
			String input = JOptionPane.showInputDialog("Enter an ID number.");
			IDnum = Integer.parseInt(input);
			String name = JOptionPane.showInputDialog("Enter a Name.");
			values.put(IDnum, name);
		}
		if (ButtonPressed == Button2) {
			String input2 = JOptionPane.showInputDialog("Enter an ID number.");
			int IDCheck = Integer.parseInt(input2);
			for (Integer i : values.keySet()) {
			if (i == IDCheck) {
				JOptionPane.showMessageDialog(null, values.get(IDCheck));
				return;
			}
			}
				JOptionPane.showMessageDialog(null, "That entry does not exist.");
			}
		
		if (ButtonPressed == Button3) {
			String blank = "";
			for (Integer i : values.keySet()) {
				String names = values.get(i);
				blank += "ID: " + i + "   Name: " + names + "\n";
			}
			JOptionPane.showMessageDialog(null, blank);
			}
		if (ButtonPressed == Button4) {
			String removal = JOptionPane.showInputDialog("Enter an ID to remove an Entry.");
			int removeID = Integer.parseInt(removal);
			values.remove(removeID);
		}
		}
	
	}

  /* 
	 * Crate a HashMap of Integers for the keys and Strings for the values.
	 * Create a GUI with three buttons. 
	 * Button 1: Add Entry
	 * 				When this button is clicked, use an input dialog to ask the user to enter an ID number.
	 * 				After an ID is entered, use another input dialog to ask the user to enter a name.
	 * 				Add this information as a new entry to your HashMap.
	 * 
	 * Button 2: Search by ID
	 * 				When this button is clicked, use an input dialog to ask the user to enter an ID number.
	 * 				If that ID exists, display that name to the user.
	 * 				Otherwise, tell the user that that entry does not exist.
	 * 
	 * Button 3: View List
	 * 				When this button is clicked, display the entire list in a message dialog in the following format:
	 * 				ID: 123  Name: Harry Howard
	 * 				ID: 245  Name: Polly Powers
	 * 				ID: 433  Name: Oliver Ortega
	 * 				etc...
	 * 
	 * When this is complete, add a fourth button to your window.
	 * Button 4: Remove Entry
	 * 				When this button is clicked, prompt the user to enter an ID using an input dialog.
	 * 				If this ID exists in the HashMap, remove it. Otherwise, notify the user that the ID
	 * 				is not in the list. 
	 *
	 * */

