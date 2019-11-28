package com.hzh.mediator;

public abstract class Mediator {
	//将给同事对象，加入到中介者集合属性中
	public abstract void Register(String colleagueName, Colleague colleague);

	//接收消息, 具体的同事对象发出
	public abstract void GetMessage(int stateChange, String colleagueName);

	public abstract void SendMessage();
}
