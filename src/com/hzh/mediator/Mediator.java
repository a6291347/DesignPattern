package com.hzh.mediator;

public abstract class Mediator {
	//����ͬ�¶��󣬼��뵽�н��߼���������
	public abstract void Register(String colleagueName, Colleague colleague);

	//������Ϣ, �����ͬ�¶��󷢳�
	public abstract void GetMessage(int stateChange, String colleagueName);

	public abstract void SendMessage();
}
