package com.useless.ui;

import java.util.Scanner;

import com.useless.utils.Format;

public class UI {
	private static final Scanner input = new Scanner(System.in);
	private static float grade_1;
	private static float grade_2;

	public static void getGrade() {
		Format.Line();
		System.out.print("First grade: ");
		grade_1 = input.nextFloat();

		input.nextLine();

		System.out.print("Second grade: ");
		grade_2 = input.nextFloat();
		Format.Line();
	}

	public static float averageGrade() {
		return (grade_1 + grade_2) / 2;
	}
}