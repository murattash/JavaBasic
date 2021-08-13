package com.neotech.lesson23;

public class WebDriver {
	
	public void Open() {
		System.out.println("Open Browser");
	}

}

class ChromeDriver extends WebDriver {
	public void Open() {
		System.out.println("Open Chrome Browser");
	}
}


class FirefoxDriver extends WebDriver {
	public void Open() {
		System.out.println("Open FireFox Browser");
	}
	
}

class InternetExplorer extends WebDriver {
	public void Open() {
		System.out.println("Open Internet Explorer Browser (at your own risk)");
	}	
}