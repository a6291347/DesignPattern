package com.hzh.command;

public class client {
  
	
	public static void main(String[] args) {
		   //��ʼ��
	       LightReceiver lightReceiver = new LightReceiver();
	       Command lightReceiveroff = new LightReceiveroff(lightReceiver);
	       Command lightReceiveron = new LightReceiveron(lightReceiver);
	       
	       //����ң����
	       RemoteController remoteController = new RemoteController();
	       
	       remoteController.setCommand(0, lightReceiveron, lightReceiveroff);
	       
	       System.out.println("---�򿪵��---");
	       remoteController.onButtonWasPushed(0);
	       System.out.println("---�رտ����---");
	       remoteController.offButtonWasPushed(0);
	       System.out.println("---����---");
	       remoteController.undoButtonWasPushed();

	
	}
}
