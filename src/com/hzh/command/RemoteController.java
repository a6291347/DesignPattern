package com.hzh.command;

public class RemoteController {
	//������
	Command[] ons;
	//������
	Command[] offs;
	
	//��¼״̬
	Command item;
	//��ʼ������
	public RemoteController() {
		// TODO Auto-generated constructor stub
		ons=new Command[5];
		offs=new Command[5];
		for(int i=0;i<5;i++){
			ons[i]=new NoCommand();
			offs[i]=new NoCommand();
		}
	}
	// �����ǵİ�ť��������Ҫ������
	public void setCommand(int id,Command commandon, Command commandoff){
		ons[id]=commandon;
		offs[id]=commandoff;
	}
	//���´�
	public void onButtonWasPushed(int no){
		ons[no].execute();
		item=ons[no];
	}
	//���¹ر�
	public void offButtonWasPushed(int no){
		offs[no].execute();
		item=offs[no];
	}
	//���³�����ť
	public void undoButtonWasPushed(){
		item.rollback();
	}
	
	
}
