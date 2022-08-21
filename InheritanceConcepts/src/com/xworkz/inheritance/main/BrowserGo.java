package com.xworkz.inheritance.main;

import com.xworkz.inheritance.child.Chrome;
import com.xworkz.inheritance.parent.Browser;

public class BrowserGo {

	public static void main(String[] args) {

		Browser chrome = new Browser();
		chrome.torisu();
		Browser browser = new Browser("Shivu", "www.shivu.com");

		browser.browser("Adobe", 1.8d, 2000);
		browser.torisu();
		Chrome chrome1 = new Chrome();
		

	}

}
