package com.hzh.singleton;


public class method1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

/**
 * @author ������
 * ����ʽ
 * �ŵ�:����װ��ʱ���ʵ���� ,�������߳�ͬ����ȫ����
 * ȱ��:������װ�صķ����ܶ� ���ܻᵼ���ڴ��˷�
 */
class Single{
	private Single(){
		
	}
   //������ʽһ
	/*private static Single single=new Single();
    
	public static Single getInterface() {
		return single;
	}*/
	
	//������ʽ��
	private static  Single single;
	static{
		single=new Single();
	}
	public static Single getInterface() {
		return single;
	}
}
