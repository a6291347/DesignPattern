package com.hzh.mediator;

public class client {
public static void main(String[] args) {
	 //�����н���
	 Mediator concreteMediator = new ConcreteMediator();
	 
	 //����һ��ͬ�¶���
	 Alarm alarm = new Alarm(concreteMediator, "small");
	               new TV(concreteMediator, "tv");
	               new CoffeeMachine(concreteMediator, "CoffeeMachine");
	               alarm.SendMessage(0);
}
}
