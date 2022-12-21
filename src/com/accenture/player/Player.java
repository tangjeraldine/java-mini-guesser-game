package com.accenture.player;

import java.util.Random;

//import java.util.Scanner;

public class Player {
	int pnum;
	
	public int guessNum() {
//		System.out.println("Player, provide your number.");
//		Scanner scan = new Scanner(System.in);
//		pnum = scan.nextInt();
		Random rand = new Random();
		int upperbound = 10; //generate random values from 0 to 9
		pnum = rand.nextInt(upperbound);
		return pnum;
	}
}
