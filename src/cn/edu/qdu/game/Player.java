package cn.edu.qdu.game;

public abstract class Player {
	private String playerName;  //记录玩家姓名
	private int winningTimes;	//玩家所赢次数
	
	{
		winningTimes=0;
	}
	
	public abstract String inputName();  //输入玩家名字
	public abstract int myFist();	//玩家出拳：1=石头  2=剪刀  3=布
	
	public String getPlayerName() {
		return playerName;
	}
	
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	
	public int getWinningTimes() {
		return winningTimes;
	}
	
	public void setWinningTimes(int winningTimes) {
		this.winningTimes = winningTimes;
	}
	
	
}
