package cn.edu.qdu.game;

import java.util.Random;

import java.util.Scanner;

public class Computer extends Player {
	Scanner input=new Scanner(System.in);
	
	@Override
	public String inputName() {
		int choose;
		do{
			System.out.println("��ѡ����Ե����֣�");
			System.out.println("1.��ʼ��\t2.�����\t3.��̫��");
			
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
		return this.getPlayerName();
	}

	@Override
	public int myFist() {
		Random random=new Random();
		int myFist=1+random.nextInt(3);
		return myFist;
	}
	
}
