package cn.edu.qdu.game;

import java.util.Scanner;

public class Person extends Player {
	Scanner input=new Scanner(System.in);
		
	@Override
	public String inputName() {
		String playerName=input.next();
		this.setPlayerName(playerName);
		return playerName;
	}

	@Override
	public int myFist() {
		int myFist=input.nextInt();
		return myFist;
	}
	
}
