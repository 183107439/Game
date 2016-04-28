package cn.edu.qdu.game;

import java.util.Random;

import java.util.Scanner;

public class Computer extends Player {
	
	@Override
	public void inputName() {
		Scanner input=new Scanner(System.in);
		int choose;
		do{		
			choose=input.nextInt();
			switch (choose) {
				case 1:
					this.setPlayerName("��ʼ��");
				break;
			
				case 2:
					this.setPlayerName("�����");
				break;
			
				case 3:
					this.setPlayerName("��̫��");
				break;
			
				default:
					System.out.println("���������ѡ��1~3");
				break;
			}
		}while(choose <= 0 || choose > 3);
	}

	@Override
	public int myFist() {
		Random random=new Random();
		int myFist=1+random.nextInt(3);
		return myFist;
	}
	
}
