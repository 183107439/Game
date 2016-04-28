package cn.edu.qdu.game;

import java.util.Random;

import java.util.Scanner;

public class Computer extends Player {
	Scanner input=new Scanner(System.in);
	
	@Override
	public String inputName() {
		int choose;
		do{
			System.out.println("ÇëÑ¡ÔñµçÄÔµÄÃû×Ö£º");
			System.out.println("1.ÇØÊ¼»Ê\t2.ººÎäµÛ\t3.»ÊÌ«¼«");
			
			choose=input.nextInt();
			switch (choose) {
				case 1:
					this.setPlayerName("ÇØÊ¼»Ê");
				break;
			
				case 2:
					this.setPlayerName("ººÎäµÛ");
				break;
			
				case 3:
					this.setPlayerName("»ÊÌ«¼«");
				break;
			
				default:
					System.out.println("ÊäÈë´íÎó£¡ÇëÑ¡Ôñ1~3");
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
