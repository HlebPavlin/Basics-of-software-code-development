package com.company;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner inA = new Scanner(System.in);
		System.out.println("Input a: ");
		double a = inA.nextInt();

		Scanner inB = new Scanner(System.in);
		System.out.println("Input b: ");
		double b = inA.nextInt();

		Scanner inC = new Scanner(System.in);
		System.out.println("Input c: ");
		double c = inA.nextInt();

		double z = ((a - 3) * b / 2) + c;
		System.out.println(z);

		inA.close();
		inB.close();
		inC.close();
	}


}


