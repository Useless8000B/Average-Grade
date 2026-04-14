package com.useless;

import com.useless.ui.UI;

public class App {
	public static void main(String[] args) {
		UI.getGrade();

		System.out.format("Average grade: %.2f%n", UI.averageGrade());
	}
}