package com.hzh.memo;

public class client {
	public static void main(String[] args) {
		Originator originator = new Originator();
		originator.setState("状态#1 攻击力 100");
		
		Caretaker caretaker = new Caretaker();
		
		caretaker.add(originator.saveStateMemento());
		
        originator.setState(" 状态#2 攻击力 80 ");
		
		caretaker.add(originator.saveStateMemento());
		
		originator.setState(" 状态#3 攻击力 50 ");
		caretaker.add(originator.saveStateMemento());
		System.out.println("当前的状态是 =" + originator.getState());
		originator.getStateFromMemento(caretaker.get(0));
		System.out.println("当前的状态是 =" + originator.getState());
	}

}
