package com.xworkz.inheritancetypecast4;

public class KeyBoardGo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TouchPad touchpad = new TouchPad("dell", true, "window10");
		touchpad.torisu();

		Keyboard keyboard = new TouchPad("hp", false, "window10");
		TouchPad converted = (TouchPad) keyboard;
		converted.price = 2547;
		converted.color = "gray";
		converted.noOfKeys = 104;
		converted.torisu();
	}

}
