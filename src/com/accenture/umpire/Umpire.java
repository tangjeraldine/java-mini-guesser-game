package com.accenture.umpire;

import com.accenture.guesser.Guesser;
import com.accenture.player.Player;

public class Umpire {
	int numFromGuesser, numFromP1, numFromP2, numFromP3;
	
	public void collectNumFromGuesser() {
		Guesser g = new Guesser();
		numFromGuesser = g.guessNum();
	}
	
	public void collectNumFromPlayers() {
		Player p1 = new Player();
		Player p2 = new Player();
		Player p3 = new Player();
		
		numFromP1 = p1.guessNum();
		numFromP2 = p2.guessNum();
		numFromP3 = p3.guessNum();
	}
	
	public void compareNums() {
		System.out.println("Guesser guessed "+numFromGuesser+".");
		System.out.println("Player1 has guessed "+numFromP1+".");
		System.out.println("Player2 has guessed "+numFromP2+".");
		System.out.println("Player3 has guessed "+numFromP3+".");
		if (numFromGuesser==numFromP1 && numFromGuesser==numFromP2) {
			System.out.println("Player1 and Player2 have won the game!");
		} else if (numFromGuesser==numFromP1 && numFromGuesser==numFromP3) {
			System.out.println("Player1 and Player3 have won the game!");
		} else if (numFromGuesser==numFromP2 && numFromGuesser==numFromP3) {
			System.out.println("Player2 and Player3 have won the game!");
		} else if (numFromGuesser==numFromP1 && numFromGuesser==numFromP2 && numFromGuesser==numFromP3) {
			System.out.println("ALL players win the game!");
		} else if (numFromGuesser==numFromP1) {
			System.out.println("Player1 has won the game!");
		} else if (numFromGuesser==numFromP2) {
			System.out.println("Player2 has won the game!");
		} else if (numFromGuesser==numFromP3) {
			System.out.println("Player3 has won the game!");
		} else {
			System.out.println("Nobody won...");
		}
	}
}
