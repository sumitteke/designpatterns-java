package net.designpatterns.proxyclass;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyObjects {
	
	public class UpdateMessageHistory{
		/**
		 * For testing such kind of method proxy objects can be used
		 * @param message
		 */
		public void update(ProtocolMessage message){
			//implementation
		}
	}
	
	public static void main(String[] args){
		ProtocolMessage message = (ProtocolMessage) Proxy.newProxyInstance(ProtocolMessage.class.getClassLoader(), 
				new Class[] {ProtocolMessage.class}, new ProtocolMessageMethodInvocationHandler());
		message.getFieldValue("FieldId");
		message.setFieldValue("FieldId", "FieldValue");
	}

	public static class ProtocolMessageMethodInvocationHandler implements InvocationHandler{
		
		@Override
		public Object invoke(Object proxy, Method method, Object[] args)
				throws Throwable {
			String methodName = method.getName();
			if("getFieldValue".equals(methodName)){
				System.out.println("Inside getFieldValue()");
				return null;
			}else if("setFieldValue".equals(methodName)) { 
				System.out.println("Inside setFieldValue()");
				return null;
			} else {
				throw new UnsupportedOperationException();
			}
		}
		
	}
	
	public interface ProtocolMessage{
		public void setFieldValue(String fieldId, Object value);
		public Object getFieldValue(String fieldId);
	}
}
