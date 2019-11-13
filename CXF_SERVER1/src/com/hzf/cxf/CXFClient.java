package com.hzf.cxf;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

public class CXFClient {
	
	public static void main(String[] args){
		JaxWsProxyFactoryBean jaProxyFactoryBean = new JaxWsProxyFactoryBean();
		jaProxyFactoryBean.setAddress("http://localhost:9999/CXF_SERVER1");
		jaProxyFactoryBean.setServiceClass(HelloWorld.class);
		HelloWorld helloWorld = (HelloWorld) jaProxyFactoryBean.create();
		helloWorld.sayHello("ะกร๗", 12);
		
		
	}

}
