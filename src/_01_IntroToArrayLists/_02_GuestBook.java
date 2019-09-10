package _01_IntroToArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_GuestBook implements ActionListener{
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	JFrame Frame;
	JPanel Window;
	JButton Add;
	JButton View;
	ArrayList<String> GuestNames = new ArrayList<String>();
	public static void main(String[] args) {
		_02_GuestBook NameList = new _02_GuestBook();
	}
	
	_02_GuestBook() {
		Frame = new JFrame();
		Window = new JPanel();
		Add = new JButton();
		View = new JButton();
		
		Frame.add(Window);
		Frame.setVisible(true);
		Window.add(Add);
		Window.add(View);
		View.addActionListener(this);
		Add.addActionListener(this);
		Add.setText("Add Name");
		View.setText("View Name");
		Frame.pack();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton ButtonPressed = (JButton) e.getSource();
		// TODO Auto-generated method stub
		if (ButtonPressed == Add) {
			String input = JOptionPane.showInputDialog("Add a Name");
			GuestNames.add(input);
		}
		else {
			String blank = "";
			for(int i = 0; i < GuestNames.size(); i++) {
				String names = GuestNames.get(i);
				blank += "Guest # " + (i+1) + ": " + names;
			}
			JOptionPane.showMessageDialog(null, blank);
			
		}
				 
		}
	}
	
	

