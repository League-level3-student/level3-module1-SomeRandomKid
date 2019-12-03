package _04_HangMan;

import java.util.Random;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class HangMan{
	JFrame Frame;
	JPanel Panel;
	JLabel Label;
	public static void main(String[] args) {
		HangMan test = new HangMan();
	}
	
	HangMan() {
		Frame = new JFrame();
		Panel = new JPanel();
		Label = new JLabel();
		Frame.add(Panel);
		Panel.add(Label);
		Frame.setVisible(true);
		Stack<String> HangStack = new Stack<String>();
		String response = JOptionPane.showInputDialog("Pick a Number from 1 through 266. (This will determin the amount of words you'll guess)");
		int dictValue = Integer.parseInt(response);
		for(int i = 0; i < dictValue; i++) {
			String word = Utilities.readRandomLineFromFile("dictionary.txt");
			while (HangStack.contains(word)) {
				word = Utilities.readRandomLineFromFile("dictionary.txt");
			}
			HangStack.push(word);
		}
		HangStack.pop();
		Label.setText
	}
}
