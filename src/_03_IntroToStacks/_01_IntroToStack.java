package _03_IntroToStacks;

import java.util.Random;
import java.util.Stack;

import javax.swing.JOptionPane;

public class _01_IntroToStack {
	public static void main(String[] args) {
		//1. Create a Stack of Doubles
		//   Don't forget to import the Stack class
		Stack<Double> num = new Stack<Double>();
		//2. Use a loop to push 100 random doubles between 0 and 100 to the Stack.
		for (int i = 0; i < 100; i++) {
			Random randNum = new Random();
		double numRandom = randNum.nextDouble();
		double rand = numRandom * 100;
			num.push(rand);
		}
		//3. Ask the user to enter in two numbers between 0 and 100, inclusive. 
		 String output1 = JOptionPane.showInputDialog("Pick a number.");
		 String output2 = JOptionPane.showInputDialog("Pick another number.");
		 int num1 = Integer.parseInt(output1);
		 int num2 = Integer.parseInt(output2);
		//4. Pop all the elements off of the Stack. Every time a double is popped that is
		//   between the two numbers entered by the user, print it to the screen.
		for (int i = 0; i < 100; i++) {
		double save = num.pop();
			if (num1 < save && save < num2) {
				System.out.println(save);
			}
			else if (num2 < save && save < num1) {
				System.out.println(save);
			}
		}
		
		//   EXAMPLE:
		//   NUM 1: 65
		//   NUM 2: 75
		
		//   Popping elements off stack...
		//   Elements between 65 and 75:
		//   66.66876846
		//   74.51651681
		//   70.05110654
		//   69.21350456
		//   71.54506465
		//   66.47984807
		//   74.12121224
	}
}
