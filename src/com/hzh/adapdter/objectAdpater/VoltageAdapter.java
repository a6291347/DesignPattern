package com.hzh.adapdter.objectAdpater;


/**
 * @author 局外人
 *改变了java单继承带来的影响
 *更加灵活
 */
public class VoltageAdapter  implements IVoltage5V {

	private Voltage220V voltage220V;
	
	public VoltageAdapter(Voltage220V voltage220v) {
		this.voltage220V = voltage220v;
	}

	@Override
	public int output5V() {
		int srcV = voltage220V.output220V();
		int dstV = srcV / 44 ; //转成 5v
		return dstV;
	}

}
