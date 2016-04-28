package cn.edu.qdu.game;

public abstract class Player {
	private String playerName;  //记录玩家姓名
	private int winningTimes;	//玩家胜场数
	private int loseTimes;		//玩家负场数
	private int dogfallTimes;	//玩家平局数
	
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
	
	public int getLoseTimes() {
		return loseTimes;
	}
	
	public void setLoseTimes(int loseTimes) {
		this.loseTimes = loseTimes;
	}
	
	public int getDogfallTimes() {
		return dogfallTimes;
	}
	
	public void setDogfallTimes(int dogfallTimes) {
		this.dogfallTimes = dogfallTimes;
	}
	
}
