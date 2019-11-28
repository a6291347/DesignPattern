package com.hzh.visit;

public class client {
   public static void main(String[] args) {
	    System.out.println("大伙都jio的很成功");
	    ObjectStructure ojs = new ObjectStructure();
	     Man man = new Man();
	     Woman woman = new Woman();
	     ojs.attach(man);
	     ojs.attach(woman);
	     Action success = new Success();
	     ojs.display(success);
  }
}
