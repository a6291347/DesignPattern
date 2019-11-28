package com.hzh.iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class client {
      public static void main(String[] args) {
    	  List<College> collegeList =new ArrayList<College>();
    	  InfoCollege infoCollege = new InfoCollege();
    	  collegeList.add(infoCollege);
    	  OutPutImpl outPutImpl = new OutPutImpl(collegeList);
    	  outPutImpl.printCollege();
    	 // Observable
	}
}
