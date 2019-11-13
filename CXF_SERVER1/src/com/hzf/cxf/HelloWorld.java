package com.hzf.cxf;

import javax.jws.WebService;

@WebService
public interface HelloWorld {

	public void sayHello(String name,int age);
}
