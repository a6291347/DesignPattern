package com.hzh.memo;

public class client {
	public static void main(String[] args) {
		Originator originator = new Originator();
		originator.setState("״̬#1 ������ 100");
		
		Caretaker caretaker = new Caretaker();
		
		caretaker.add(originator.saveStateMemento());
		
        originator.setState(" ״̬#2 ������ 80 ");
		
		caretaker.add(originator.saveStateMemento());
		
		originator.setState(" ״̬#3 ������ 50 ");
		caretaker.add(originator.saveStateMemento());
		System.out.println("��ǰ��״̬�� =" + originator.getState());
		originator.getStateFromMemento(caretaker.get(0));
		System.out.println("��ǰ��״̬�� =" + originator.getState());
	}

}
