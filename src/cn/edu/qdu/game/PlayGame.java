package cn.edu.qdu.game;

public class PlayGame {
	public static void main(String[] args) {
		Judger judger=new Judger();
		 judger.startGame();  //˵����Ϸ����
		 judger.askName();  //ѯ������ǳ�
		 judger.playGame();	  //��Ϸ��ʼ����ȭ����
		 judger.finalResult();//��Ϸ���� ����������Ϸ���
	}
}
