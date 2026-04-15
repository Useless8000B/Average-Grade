package com.useless.average_grade;

import com.useless.average_grade.ui.UI;

public class App {
	public static void main(String[] args) {
		UI.getGrade();

		System.out.format("Average grade: %.2f%n", UI.averageGrade());
	}
}