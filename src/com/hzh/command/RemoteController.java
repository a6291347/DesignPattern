package com.hzh.command;

public class RemoteController {
	//开数组
	Command[] ons;
	//关数组
	Command[] offs;
	
	//记录状态
	Command item;
	//初始化构造
	public RemoteController() {
		// TODO Auto-generated constructor stub
		ons=new Command[5];
		offs=new Command[5];
		for(int i=0;i<5;i++){
			ons[i]=new NoCommand();
			offs[i]=new NoCommand();
		}
	}
	// 给我们的按钮设置你需要的命令
	public void setCommand(int id,Command commandon, Command commandoff){
		ons[id]=commandon;
		offs[id]=commandoff;
	}
	//按下打开
	public void onButtonWasPushed(int no){
		ons[no].execute();
		item=ons[no];
	}
	//按下关闭
	public void offButtonWasPushed(int no){
		offs[no].execute();
		item=offs[no];
	}
	//按下撤销按钮
	public void undoButtonWasPushed(){
		item.rollback();
	}
	
	
}
