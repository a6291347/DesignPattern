package com.hzh.adapdter.objectAdpater;


/**
 * @author ������
 *�ı���java���̳д�����Ӱ��
 *�������
 */
public class VoltageAdapter  implements IVoltage5V {

	private Voltage220V voltage220V;
	
	public VoltageAdapter(Voltage220V voltage220v) {
		this.voltage220V = voltage220v;
	}

	@Override
	public int output5V() {
		int srcV = voltage220V.output220V();
		int dstV = srcV / 44 ; //ת�� 5v
		return dstV;
	}

}
