package _04_HangMan;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;
import java.util.Stack;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class HangMan implements KeyListener{
	Stack<String> HangStack = new Stack<String>();
	int lives = 5;
	JFrame Frame;
	JPanel Panel;
	JLabel Label;
	JButton Yes;
	JButton No;
	String guess;
	String line;
	String displayWord;
	String lineChar;
	
	public static void main(String[] args) {
		HangMan test = new HangMan();
	}
	
	HangMan() {
		Frame = new JFrame();
		Panel = new JPanel();
		Label = new JLabel();
		Frame.add(Panel);
		Panel.add(Label);
		Frame.addKeyListener(this);
		Frame.setVisible(true);
	 HangStack = new Stack<String>();
		String response = JOptionPane.showInputDialog("Pick a Number from 1 through 266. (This will determin the amount of words you'll guess)");
		int dictValue = Integer.parseInt(response);
		for(int i = 0; i < dictValue; i++) {
			String word = Utilities.readRandomLineFromFile("dictionary.txt");
			while (HangStack.contains(word)) {
				word = Utilities.readRandomLineFromFile("dictionary.txt");
			}
			HangStack.push(word);
			
		}	
		wordFrame();
		
		
	}
	
	public void wordFrame() {
		if (HangStack.empty() == false) {
		guess = HangStack.pop();  
		System.out.println(guess);
		}
		line = "";
		for (int i = 0; i < guess.length(); i++) {
			line += "_";      
		}
		Label.setText(line);
		Frame.pack();
	
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		lineChar = Label.getText();
		char key = e.getKeyChar();
		String displayWord = "";
		for (int i = 0; i < guess.length(); i++) {
			char letter = guess.charAt(i);
		 if (letter == key) {
			 displayWord  += key;
		 }
		 else {
			 displayWord += lineChar.charAt(i);
			 lives -= 1;
		 }
		}
		Label.setText(displayWord);
		
		if (displayWord.contains("_") == false) {
			wordFrame();
			if (lives == 0 || HangStack.empty()) {
				
			}
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
