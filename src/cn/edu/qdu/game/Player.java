package cn.edu.qdu.game;

public abstract class Player {
	private String playerName;  //��¼�������
	private int winningTimes;	//���ʤ����
	private int loseTimes;		//��Ҹ�����
	private int dogfallTimes;	//���ƽ����
	
	public abstract String inputName();  //�����������
	public abstract int myFist();	//��ҳ�ȭ��1=ʯͷ  2=����  3=��
	
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
