package com.tyss.atmmachine;

public class Machine {

	void slot (ATM a) {
		a.validateCard();
		a.getInfo();
	}
}