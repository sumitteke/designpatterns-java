package net.designpattern.creational.prototype;

public class Eg {

	public static void main(String[] args) {
		Cookie cookie = null;
		Cookie prototype = new CoconutCookie();
		CookieMachine machine = new CookieMachine(prototype);
		for (int i = 0; i <= 10; i++){
			cookie = machine.makeCookie();
		}

	}

}
