package com.accenture.mainapp;

import com.accenture.umpire.Umpire;

public class LaunchGuesserGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Umpire u = new Umpire();
		u.collectNumFromGuesser();
		u.collectNumFromPlayers();
		u.compareNums();
	}

}
