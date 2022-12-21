package com.accenture.guesser;

import java.util.Random;

//import java.util.Scanner;

public class Guesser {
	int gnum;
	
	public int guessNum() {
//		System.out.println("Guesser, please guess a number.");
//		Scanner scan = new Scanner(System.in);
//		gnum = scan.nextInt();
		Random rand = new Random();
		int upperbound = 10; //generate random values from 0 to 9
		gnum = rand.nextInt(upperbound);
		return gnum;
	}

}
