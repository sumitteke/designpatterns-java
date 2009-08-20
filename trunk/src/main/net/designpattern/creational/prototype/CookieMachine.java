package net.designpattern.creational.prototype;

public class CookieMachine {
	
	private Cookie cookie;
	
	public CookieMachine(Cookie cookie){
		this.cookie = cookie;
	}
	
	public Cookie makeCookie() {
		return (Cookie)cookie.clone();
	}

}
