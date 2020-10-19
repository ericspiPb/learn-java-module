package me.synology.eric88.learn.java.module.hello.client;

import me.synology.eric88.learn.java.module.hello.HelloWorld;

public class HelloWorldClient {
	public static void main (String arg[]) {
	    HelloWorld hello = new HelloWorld();
	    System.out.println(hello.sayHelloWorld());
	}
}
