package cn.edu.qdu.game;

public class Judger {
	private int total=0;  //��¼��ȭ����
	private Person person=new Person();
	private Computer computer=new Computer();
	
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
	public void askName(){
		System.out.println(">>��Ϸ��ʼ");	//��Ϸ��ʼ
		System.out.println("��ѡ����Ե����֣�");
		System.out.println("1.��ʼ��\t2.�����\t3.��̫��");
		computer.inputName();
		System.out.println("������������֣�");
		person.inputName();
	}
	
	//��ȭ��Ϸ����
	public void playGame(){		
		//��ȭ
		//��ң��㣩��ȭ
		String key=null;
		do{
			++this.total;   //��ȭ����+1
			
			//��ʾ��ȭ��Ϣ
			int personFist;
			do{
				System.out.println("\t"+person.getPlayerName()+" VS "+computer.getPlayerName());
				System.out.println("\t  Game "+this.total);
				System.out.println("�����ȭ��");
				
				personFist=person.myFist();
				switch (personFist) {
					case 1:
						System.out.println(person.getPlayerName()+"��ȭ��ʯͷ");
					break;
				
					case 2:
						System.out.println(person.getPlayerName()+"��ȭ������");
					break;
				 
					case 3:
						System.out.println(person.getPlayerName()+"��ȭ����");
					break;
				
					default:
						System.out.println("�������������1~3");
					break;
				}
			}while(personFist <= 0 || personFist > 3);
			
			//��ң����ԣ���ȭ
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
			if(personFist == computerFist){
				computer.setDogfallTimes(computer.getDogfallTimes()+1);  //����ƽ��+1
				person.setDogfallTimes(person.getDogfallTimes()+1);  //��ң��ˣ�ƽ��+1
				System.out.println("����ƽ�֣�");		
			}else if(personFist==1 && computerFist==2
					|| (personFist==2 && computerFist==3)
					|| (personFist==3 && computerFist==1)){
				person.setWinningTimes(person.getWinningTimes()+1); //��ң��ˣ�ʤ��+1
				computer.setLoseTimes(computer.getLoseTimes()+1);   //���Ը���+1
				System.out.println("�ߣ�������Ϸ��Ӯ�ˣ�");	
			}else{
				computer.setWinningTimes(computer.getWinningTimes()+1); //����ʤ��+1
				person.setLoseTimes(person.getLoseTimes()+1);//��ң��ˣ�����+1 ���õ���ʤ�ֱ�ʾ
				System.out.println("������������Ϸ�����ˣ�");
				
			}
			System.out.println("");
			System.out.println("�Ƿ�ʼ��һ�֣�y/n����");
			key=person.isContinue();
		}while(key.equalsIgnoreCase("y"));
	}
	
	//��ȭ��Ϸ������������
	public void finalResult(){
		System.out.println(">>��Ϸ�����");
		System.out.println("\t"+person.getPlayerName()+" VS "+computer.getPlayerName());
		System.out.println("��ս������  "+this.total);
		System.out.println("�ǳ�\tʤ\t��\tƽ");
		//��ҶԾֽ��
		System.out.print(person.getPlayerName()+"\t");
		System.out.print(person.getWinningTimes()+"\t");
		System.out.print(person.getLoseTimes()+"\t");
		System.out.println(person.getDogfallTimes()+"\t");
		//���ԶԾֽ��
		System.out.print(computer.getPlayerName()+"\t");
		System.out.print(computer.getWinningTimes()+"\t");
		System.out.print(computer.getLoseTimes()+"\t");
		System.out.println(computer.getDogfallTimes()+"\t");
		if(person.getWinningTimes()>=computer.getWinningTimes()){
			System.out.println("�����Ӵ������Ӵ��");
		}
		else{
			System.out.println("�����haha!С���ӣ��´�ҪŬ������");
		}
	}
	
}
