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
	 
	public static void main(String[] args) {
		 _02_LogSearch start = new _02_LogSearch();
	}
	
	_02_LogSearch() { 
		 Frame = new JFrame();
		 Frame.setVisible(true);
		 Panel = new JPanel();
		 Button1 = new JButton();
		 Button2 = new JButton();
		 Button3 = new JButton();
		 Frame.add(Panel);
		 Panel.add(Button1);
		 Panel.add(Button2);
		 Panel.add(Button3);
		 Button1.addActionListener(this);
		 Button1.setText("Add Entry");
		 Button2.addActionListener(this);
		 Button2.setText("Search by ID");
		 Button3.addActionListener(this);
		 Button3.setText("View List");
		 Frame.pack();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton ButtonPressed = (JButton) e.getSource();
		if (ButtonPressed == Button1) {
			String input = JOptionPane.showInputDialog("Enter an ID number.");
			int IDnum = Integer.parseInt(input);
			String name = JOptionPane.showInputDialog("Enter a Name.");
			values.put(IDnum, name);
		}
		if (ButtonPressed == Button2) {
			
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

}