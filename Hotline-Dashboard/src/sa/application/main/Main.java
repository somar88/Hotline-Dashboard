package sa.application.main;

import java.awt.Dimension;
import java.util.Scanner;

import javax.swing.JFrame;

public class Main {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		JFrame frm = new JFrame("Welcome");
		frm.setSize(new Dimension(600, 400));
		frm.setLocationRelativeTo(null);
		frm.setResizable(false);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setVisible(true);	

	}

}
