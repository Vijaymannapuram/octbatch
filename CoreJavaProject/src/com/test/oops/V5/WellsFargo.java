package com.test.oops.V5;

public class WellsFargo implements FundsTransfer,NationalBank{

	@Override
	public void doTransfer(String srcAccount, String destAccount, int amount) {
		System.out.println("wells Fargo "+srcAccount + " ," + destAccount +" , "+amount );
		
	}

}
