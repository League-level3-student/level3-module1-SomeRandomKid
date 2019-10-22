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
	Song current;
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
		Song song2= new Song("223.mp3");
		ShuffleSong.add(song2);
		Song song3  = new Song("FN.mp3");
		ShuffleSong.add(song3);
		Song song4  = new Song("Ransom.mp3");
		ShuffleSong.add(song4);
		Song song5  = new Song("Bad.mp3");
		ShuffleSong.add(song5);
				
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
		int num = new Random().nextInt(ShuffleSong.size());
		if (current != null) {
			current.stop();
		}
		
		if (Button == e.getSource()) {
			current = ShuffleSong.get(num);
			ShuffleSong.get(num).play();
		}
	}
}