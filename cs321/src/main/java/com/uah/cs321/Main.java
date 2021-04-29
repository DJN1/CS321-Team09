/**
 * Class: Main.java
 * Purpose: Runs the tester function and creates and runs GUI.
 */
package com.uah.cs321;

/**
 *
 * @author colin, caleb, david, zach
 */
public class Main {

	public static MainFrame simpleEmailFrame = new MainFrame();

	public static void main(String[] args) {
		Tester.test();

		//Opening GUI
		simpleEmailFrame.setVisible(true);
	}

}
