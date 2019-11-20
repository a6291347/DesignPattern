package com.hzh.adapdter.interfaceAdapter;

import java.util.ArrayList;
import java.util.List;



/**
 * @author 局外人
 *  springMVC 
 *  由request调用对应的controller,传入doDispatch 由doDispatch()调用handadpater中的
 *  比较方法 从而获取相对应的handadpater具体实列
 *  再通过 handadpater调用controller方法
 *  达到解耦的目的
 *  满足ocp原则
 */
public class DispatchServlet {

	public static List<HandlerAdapter> handlerAdapters = new ArrayList<HandlerAdapter>();

	public DispatchServlet() {
		handlerAdapters.add(new AnnotationHandlerAdapter());
		handlerAdapters.add(new HttpHandlerAdapter());
		handlerAdapters.add(new SimpleHandlerAdapter());
	}

	public void doDispatch() {
		    // 此处模拟SpringMVC从request取handler的对象，
			// 适配器可以获取到希望的Controller
		 //HttpController controller = new HttpController();
		// AnnotationController controller = new AnnotationController();
		SimpleController controller = new SimpleController();
		HandlerAdapter adapter = getHandler(controller);
		// 通过适配器执行对应的controller对应方法
		adapter.handle(controller);

	}
	//遍历：根据得到的controller(handler), 返回对应适配器
	public HandlerAdapter getHandler(Controller controller) {
		for (HandlerAdapter adapter : this.handlerAdapters) {
			if (adapter.supports(controller)) {
				return adapter;
			}
		}
		return null;
	}

	public static void main(String[] args) {
		new DispatchServlet().doDispatch(); // http...
	}

}
