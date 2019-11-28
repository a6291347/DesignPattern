package com.hzh.command;

public class client {
  
	
	public static void main(String[] args) {
		   //初始化
	       LightReceiver lightReceiver = new LightReceiver();
	       Command lightReceiveroff = new LightReceiveroff(lightReceiver);
	       Command lightReceiveron = new LightReceiveron(lightReceiver);
	       
	       //调用遥控器
	       RemoteController remoteController = new RemoteController();
	       
	       remoteController.setCommand(0, lightReceiveron, lightReceiveroff);
	       
	       System.out.println("---打开电灯---");
	       remoteController.onButtonWasPushed(0);
	       System.out.println("---关闭开电灯---");
	       remoteController.offButtonWasPushed(0);
	       System.out.println("---回退---");
	       remoteController.undoButtonWasPushed();

	
	}
}
