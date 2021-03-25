package com.tyss.oopsProgram.interfac;

public class TestInf implements Inf {

	public static void main(String[] args) {
		Inf i = new TestInf();
		i.doWork();
		

	}

	@Override
	public void doWork() {
		System.out.println("doing work " +i);
		
	}

}
