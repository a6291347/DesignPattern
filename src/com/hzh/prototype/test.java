package com.hzh.prototype;

public class test {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
           sheep s1 = new sheep("¶àÀû","white",new cat("ÖìÀöÅ¸","orange"));
           sheep s2 =(sheep) s1.sheelClone();
           sheep s3 =(sheep) s1.sheelClone();
           System.out.println("s1->"+s1.toString()+"---hascode->"+s1.getCc().hashCode());
           System.out.println("s2->"+s2.toString()+"---hascode->"+s2.getCc().hashCode());
           System.out.println("s3->"+s3.toString()+"---hascode->"+s3.getCc().hashCode());
	}

}
