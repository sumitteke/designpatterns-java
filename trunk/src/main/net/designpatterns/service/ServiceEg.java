package net.designpatterns.service;

/**
 * Refer for more details on how to use this.
 * http://java.sun.com/j2se/1.4.2/docs/guide/jar/jar.html#Service%20Provider
 */
import java.util.Iterator;

import sun.misc.Service;

public class ServiceEg {
	
	private String serviceId;
	
	public String getServiceId() {
		return serviceId;
	}

	public ServiceEg(String serviceId){
		this.serviceId = serviceId; 
	}
	
	@SuppressWarnings("unchecked")
	public static ServiceEg getService(String serviceId){
		Iterator<ServiceEg> ps = Service.providers(ServiceEg.class);
		while (ps.hasNext()) { 
			 ServiceEg service = ps.next();
			 if(service.getServiceId().equals(serviceId)){
				 return service;
			 }
		}
		return null;
	}

	public static void main(String[] args){
		ServiceEg service = ServiceEg.getService("Service 1");
		System.out.println("Service: " + service);
	}
}
