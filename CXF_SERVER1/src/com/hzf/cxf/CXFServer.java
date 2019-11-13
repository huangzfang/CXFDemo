package com.hzf.cxf;

import org.apache.cxf.endpoint.Server;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

public class CXFServer {


	public static void main(String[] args) {
		JaxWsServerFactoryBean jaxWsServerFactoryBean = new JaxWsServerFactoryBean();
		jaxWsServerFactoryBean.setAddress("http://localhost:9999/CXF_SERVER1");
		jaxWsServerFactoryBean.setServiceClass(HelloWorldImpl.class);
		
		Server server = jaxWsServerFactoryBean.create();
		server.start();
	}

}
