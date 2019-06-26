package cn.zhou.actions;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

public class MyMethodFilterInterceptor extends MethodFilterInterceptor {

	/*
	 * 
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.opensymphony.xwork2.interceptor.MethodFilterInterceptor#doIntercept(com.
	 * opensymphony.xwork2.ActionInvocation)
	 * 
	 * struts2 自定义拦截器
	 *
	 * 继承 MethodFilterInterceptor类
	 * 
	 * 另外 还需要在  Struts.xml中进行配置
	 * <package>
	 * 
	 * 1.  声明拦截器 <interceptors  > 
	 * 			<interceptor name="name" class=""自定义拦截器的类路径></interceptor> 
	 *  </interceptors>
	 *  
	 *  <action>
	 *  
	 *  2. 使用拦截器
	 *  <interceptor-ref  name="name">
	 *    <param name="excludeMethods"> 需要忽略拦截的 方法名称 </param>
	 *   </interceptor>
	 *  
	 *  </action>
	 *  
	 *  </package>
	 *  
	 */

	@Override
	protected String doIntercept(ActionInvocation arg0) throws Exception {
		int x=6;
		if (x == 1) {
			return arg0.invoke();  //这一步类似于 filter的doChain()方法，（放行的效果）

		} else {

			return null;
		}

	}

}
