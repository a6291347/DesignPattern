package com.hzh.visit;

public class client {
   public static void main(String[] args) {
	    System.out.println("��ﶼjio�ĺܳɹ�");
	    ObjectStructure ojs = new ObjectStructure();
	     Man man = new Man();
	     Woman woman = new Woman();
	     ojs.attach(man);
	     ojs.attach(woman);
	     Action success = new Success();
	     ojs.display(success);
  }
}
