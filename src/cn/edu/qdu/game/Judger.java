package cn.edu.qdu.game;

import java.util.Scanner;

public class Judger {
	private int total=0;  //记录猜拳次数
	private Person person=new Person();
	private Computer computer=new Computer();
	Scanner input=new Scanner(System.in);
	
	//说明规则
	public void startGame(){
		System.out.println("\t********************");
		System.out.println("\t******猜拳游戏******");
		System.out.println("\t********************");
//		System.out.println(">>游戏开始");
		System.out.println("规则如下：");
		System.out.println("1.石头\t2.剪刀\t3.布\t");
	}
	
	//询问玩家昵称
//	public void askName(){
//		System.out.println("请输入你的名字：");
//		String personName=person.inputName();
//		String computerName=computer.inputName();
//		System.out.println("\t"+personName+" VS "+computerName);
//		System.out.println("Game "+total);
//	}
	
	//猜拳游戏过程
	public void playGame(){
		//询问玩家昵称
		System.out.println(">>游戏开始");	//游戏开始
		System.out.println("请输入你的名字：");
		String personName=person.inputName();
		String computerName=computer.inputName();
		
		String key="y";
		do{
			++this.total;   //猜拳次数+1
			
			//显示出拳信息
			int personFist;
			do{
				System.out.println("\t"+personName+" VS "+computerName);
				System.out.println("\t  Game "+this.total);
				System.out.println("请你出拳：");
				
				personFist=person.myFist();
				switch (personFist) {
					case 1:
						System.out.println(personName+"(你)出拳：石头");
					break;
				
					case 2:
						System.out.println(personName+"(你)出拳：剪刀");
					break;
				 
					case 3:
						System.out.println(personName+"(你)出拳：布");
					break;
				
					default:
						System.out.println("输入错误！请输入1~3");
					break;
				}
			}while(personFist <= 0 || personFist > 3);
			
			int computerFist=computer.myFist();
			switch (computerFist) {
			case 1:
				System.out.println(computer.getPlayerName()+"出拳：石头");
				break;
				
			case 2:
				System.out.println(computer.getPlayerName()+"出拳：剪刀");
				break;
				
			case 3:
				System.out.println(computer.getPlayerName()+"出拳：布");
				break;

			}
			
			//单轮猜拳结果
			System.out.println("本轮结果：");
			if(personFist==1 && computerFist==2
				|| personFist==2 && computerFist==3
				|| personFist==3 && computerFist==1){
				System.out.println("哼！本轮游戏你赢了！");
				person.setWinningTimes(person.getWinningTimes()+1);
			}else if(personFist==1 && computerFist==3
					 || personFist==2 && computerFist==1
					 || personFist==3 && computerFist==2){
				computer.setWinningTimes(computer.getWinningTimes()+1);
				System.out.println("哈哈！本轮游戏你输了！");
			}else{
				System.out.println("本轮平局！");
			}
			System.out.println("");
			System.out.println("是否开始下一轮（y/n）：");
			key=input.next();			
		}while(key.equalsIgnoreCase("y"));
	}
	
	//猜拳游戏结束输出最后结果
	public void finalResult(){
		System.out.println(">>游戏结果：");
		System.out.println("\t"+person.getPlayerName()+" VS "+computer.getPlayerName());
		System.out.println("对战次数：  "+this.total);
		System.out.println("昵称\t\t得分");
		System.out.println(person.getPlayerName()+"\t\t"+person.getWinningTimes());
		System.out.println(computer.getPlayerName()+"\t\t"+computer.getWinningTimes());
		if(person.getWinningTimes()>=computer.getWinningTimes()){
			System.out.println("结果：哟！不错哟！");
		}
		else{
			System.out.println("结果：haha!小伙子！下次要努力啊！");
		}
	}
	
}
