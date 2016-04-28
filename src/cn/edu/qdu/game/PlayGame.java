package cn.edu.qdu.game;

public class PlayGame {
	public static void main(String[] args) {
		Judger judger=new Judger();
		 judger.startGame();  //说明游戏规则
		 judger.askName();  //询问玩家昵称
		 judger.playGame();	  //游戏开始及猜拳过程
		 judger.finalResult();//游戏结束 宣布最终游戏结果
	}
}
