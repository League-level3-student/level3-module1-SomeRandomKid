package _03_IntroToStacks;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class _02_TextUndoRedo implements KeyListener {
	/* 
	 * Create a JFrame with a JPanel and a JLabel.
	 * 
	 * Every time a key is pressed, add that character to the JLabel. It should look like a basic text editor.
	 * 
	 * Make it so that every time the BACKSPACE key is pressed, the last character is erased from the JLabel.
	 * Save that deleted character onto a Stack of Characters.
	 * 
	 * Choose a key to be the Undo key. Make it so that when that key is pressed, the top Character is popped 
	 * off the Stack and added back to the JLabel.
	 * 
	 * */
	public static void main(String[] args) {
		_02_TextUndoRedo write = new _02_TextUndoRedo();
	}
	
	Stack<Character> erased = new Stack<Character>();
	JFrame Frame;
	JLabel Label;
	JPanel Panel;
	
	_02_TextUndoRedo() {
	Frame = new JFrame();
	Label = new JLabel();
	Panel = new JPanel();
	Frame.add(Panel);
	Panel.add(Label);
	Label.addKeyListener(this);
	Frame.setVisible(true);
	Frame.addKeyListener(this);
	Frame.pack();
}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
	
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) { 
			String text = Label.getText();
			char bksp = text.charAt(text.length() - 1);
			erased.push(bksp);
			text = text.substring(0, text.length()-1);
			Label.setText(text);
		}
		else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
			char undo = erased.pop();
			Label.setText(Label.getText() + undo);
			
		}
		else {
		char key = e.getKeyChar();
		Label.setText(Label.getText()+key);
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}