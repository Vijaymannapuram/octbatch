package com.test.oops.V5;

import java.io.Serializable;

public class Chase implements FundsTransfer,NationalBank,Serializable{

	@Override
	public void doTransfer(String srcAccount, String destAccount, int amount) {
		System.out.println("Chase "+srcAccount + " ," + destAccount +" , "+amount );
		
	}

}
