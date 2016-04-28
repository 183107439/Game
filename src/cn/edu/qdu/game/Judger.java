package cn.edu.qdu.game;

import java.util.Scanner;

public class Judger {
	private int total=0;  //��¼��ȭ����
	private Person person=new Person();
	private Computer computer=new Computer();
	Scanner input=new Scanner(System.in);
	
	//˵������
	public void startGame(){
		System.out.println("\t********************");
		System.out.println("\t******��ȭ��Ϸ******");
		System.out.println("\t********************");
//		System.out.println(">>��Ϸ��ʼ");
		System.out.println("�������£�");
		System.out.println("1.ʯͷ\t2.����\t3.��\t");
	}
	
	//ѯ������ǳ�
//	public void askName(){
//		System.out.println("������������֣�");
//		String personName=person.inputName();
//		String computerName=computer.inputName();
//		System.out.println("\t"+personName+" VS "+computerName);
//		System.out.println("Game "+total);
//	}
	
	//��ȭ��Ϸ����
	public void playGame(){
		//ѯ������ǳ�
		System.out.println(">>��Ϸ��ʼ");	//��Ϸ��ʼ
		System.out.println("������������֣�");
		String personName=person.inputName();
		String computerName=computer.inputName();
		
		String key="y";
		do{
			++this.total;   //��ȭ����+1
			
			//��ʾ��ȭ��Ϣ
			int personFist;
			do{
				System.out.println("\t"+personName+" VS "+computerName);
				System.out.println("\t  Game "+this.total);
				System.out.println("�����ȭ��");
				
				personFist=person.myFist();
				switch (personFist) {
					case 1:
						System.out.println(personName+"(��)��ȭ��ʯͷ");
					break;
				
					case 2:
						System.out.println(personName+"(��)��ȭ������");
					break;
				 
					case 3:
						System.out.println(personName+"(��)��ȭ����");
					break;
				
					default:
						System.out.println("�������������1~3");
					break;
				}
			}while(personFist <= 0 || personFist > 3);
			
			int computerFist=computer.myFist();
			switch (computerFist) {
			case 1:
				System.out.println(computer.getPlayerName()+"��ȭ��ʯͷ");
				break;
				
			case 2:
				System.out.println(computer.getPlayerName()+"��ȭ������");
				break;
				
			case 3:
				System.out.println(computer.getPlayerName()+"��ȭ����");
				break;

			}
			
			//���ֲ�ȭ���
			System.out.println("���ֽ����");
			if(personFist==1 && computerFist==2
				|| personFist==2 && computerFist==3
				|| personFist==3 && computerFist==1){
				System.out.println("�ߣ�������Ϸ��Ӯ�ˣ�");
				person.setWinningTimes(person.getWinningTimes()+1);
			}else if(personFist==1 && computerFist==3
					 || personFist==2 && computerFist==1
					 || personFist==3 && computerFist==2){
				computer.setWinningTimes(computer.getWinningTimes()+1);
				System.out.println("������������Ϸ�����ˣ�");
			}else{
				System.out.println("����ƽ�֣�");
			}
			System.out.println("");
			System.out.println("�Ƿ�ʼ��һ�֣�y/n����");
			key=input.next();			
		}while(key.equalsIgnoreCase("y"));
	}
	
	//��ȭ��Ϸ������������
	public void finalResult(){
		System.out.println(">>��Ϸ�����");
		System.out.println("\t"+person.getPlayerName()+" VS "+computer.getPlayerName());
		System.out.println("��ս������  "+this.total);
		System.out.println("�ǳ�\t\t�÷�");
		System.out.println(person.getPlayerName()+"\t\t"+person.getWinningTimes());
		System.out.println(computer.getPlayerName()+"\t\t"+computer.getWinningTimes());
		if(person.getWinningTimes()>=computer.getWinningTimes()){
			System.out.println("�����Ӵ������Ӵ��");
		}
		else{
			System.out.println("�����haha!С���ӣ��´�ҪŬ������");
		}
	}
	
}
