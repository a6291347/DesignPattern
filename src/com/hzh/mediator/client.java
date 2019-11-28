package com.hzh.mediator;

public class client {
public static void main(String[] args) {
	 //创建中介者
	 Mediator concreteMediator = new ConcreteMediator();
	 
	 //创建一个同事对象
	 Alarm alarm = new Alarm(concreteMediator, "small");
	               new TV(concreteMediator, "tv");
	               new CoffeeMachine(concreteMediator, "CoffeeMachine");
	               alarm.SendMessage(0);
}
}
