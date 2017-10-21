package com.lx._reflect_text;

public class HelloMyServlet implements MyServlet {

	public void init() {
		// TODO Auto-generated method stub
		System.out.println("初始化");
	}

	public void service() {
		// TODO Auto-generated method stub
		System.out.println("执行");

	}

	public void destory() {
		// TODO Auto-generated method stub
		System.out.println("销毁");
	}

}
