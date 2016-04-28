package cn.edu.qdu.game;

public class Judger {
	private int total=0;  //记录猜拳次数
	private Person person=new Person();
	private Computer computer=new Computer();
	
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
	public void askName(){
		System.out.println(">>游戏开始");	//游戏开始
		System.out.println("请选择电脑的名字：");
		System.out.println("1.秦始皇\t2.汉武帝\t3.皇太极");
		computer.inputName();
		System.out.println("请输入你的名字：");
		person.inputName();
	}
	
	//猜拳游戏过程
	public void playGame(){		
		//出拳
		//玩家（你）出拳
		String key=null;
		do{
			++this.total;   //猜拳次数+1
			
			//显示出拳信息
			int personFist;
			do{
				System.out.println("\t"+person.getPlayerName()+" VS "+computer.getPlayerName());
				System.out.println("\t  Game "+this.total);
				System.out.println("请你出拳：");
				
				personFist=person.myFist();
				switch (personFist) {
					case 1:
						System.out.println(person.getPlayerName()+"出拳：石头");
					break;
				
					case 2:
						System.out.println(person.getPlayerName()+"出拳：剪刀");
					break;
				 
					case 3:
						System.out.println(person.getPlayerName()+"出拳：布");
					break;
				
					default:
						System.out.println("输入错误！请输入1~3");
					break;
				}
			}while(personFist <= 0 || personFist > 3);
			
			//玩家（电脑）出拳
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
			if(personFist == computerFist){
				computer.setDogfallTimes(computer.getDogfallTimes()+1);  //电脑平局+1
				person.setDogfallTimes(person.getDogfallTimes()+1);  //玩家（人）平局+1
				System.out.println("本轮平局！");		
			}else if(personFist==1 && computerFist==2
					|| (personFist==2 && computerFist==3)
					|| (personFist==3 && computerFist==1)){
				person.setWinningTimes(person.getWinningTimes()+1); //玩家（人）胜局+1
				computer.setLoseTimes(computer.getLoseTimes()+1);   //电脑负局+1
				System.out.println("哼！本轮游戏你赢了！");	
			}else{
				computer.setWinningTimes(computer.getWinningTimes()+1); //电脑胜局+1
				person.setLoseTimes(person.getLoseTimes()+1);//玩家（人）负局+1 可用电脑胜局表示
				System.out.println("哈哈！本轮游戏你输了！");
				
			}
			System.out.println("");
			System.out.println("是否开始下一轮（y/n）：");
			key=person.isContinue();
		}while(key.equalsIgnoreCase("y"));
	}
	
	//猜拳游戏结束输出最后结果
	public void finalResult(){
		System.out.println(">>游戏结果：");
		System.out.println("\t"+person.getPlayerName()+" VS "+computer.getPlayerName());
		System.out.println("对战次数：  "+this.total);
		System.out.println("昵称\t胜\t负\t平");
		//玩家对局结果
		System.out.print(person.getPlayerName()+"\t");
		System.out.print(person.getWinningTimes()+"\t");
		System.out.print(person.getLoseTimes()+"\t");
		System.out.println(person.getDogfallTimes()+"\t");
		//电脑对局结果
		System.out.print(computer.getPlayerName()+"\t");
		System.out.print(computer.getWinningTimes()+"\t");
		System.out.print(computer.getLoseTimes()+"\t");
		System.out.println(computer.getDogfallTimes()+"\t");
		if(person.getWinningTimes()>=computer.getWinningTimes()){
			System.out.println("结果：哟！不错哟！");
		}
		else{
			System.out.println("结果：haha!小伙子！下次要努力啊！");
		}
	}
	
}
