package cn.edu.qdu.game;

public class PlayGame {
	public static void main(String[] args) {
		Judger judger=new Judger();
		 judger.startGame();
		 judger.askName();
		 judger.playGame();
		 judger.finalResult();
	}
}
