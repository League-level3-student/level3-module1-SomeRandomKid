package _01_IntroToArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


//Copyright The League of Amazing Programmers, 2015

public class _06_IPodShuffle implements ActionListener{
	ArrayList<Song> ShuffleSong = new ArrayList<Song>();
	JFrame Frame;
	JPanel Panel;
	JButton Button;
	public _06_IPodShuffle() {
		// 1. Use the Song class the play the demo.mp3 file.
		Frame = new JFrame();
		Panel = new JPanel();
		Button = new JButton();
		Frame.add(Panel);
		Panel.add(Button);
		Frame.setVisible(true);
		
		Button.addActionListener(this);
		Button.setText("Suprize Me!!");
		Frame.pack();
		
		Song song1 = new Song("demo.mp3");
		ShuffleSong.add(song1);
				
		/**
		 * 2. Congratulations on completing the sound check! * Now we want to make an
		 * iPod Shuffle that plays random music. * Create an ArrayList of Songs and a
		 * "Surprise Me!" button that will play a random song when it is clicked. * If
		 * you're really cool, you can stop all the songs, before playing a new one on
		 * subsequent button clicks.
		 */
		
	}
	
	public static void main(String[] args) {
		new _06_IPodShuffle();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (Button == e.getSource()) {
			
		}
	}
}