package com.test.oops.V5;

public class FundsTransferApp {
	
    public static void main(String args[]) throws Exception{
    	
	if(args.length == 1){
		Class classObj = Class.forName(args[0]);//Load your Class into memory
		Object obj = classObj.newInstance();
		FundsTransfer fundsTransferRef =new Citi();//new Chase();//new WellsFargo();
		//B.L
		fundsTransferRef.doTransfer("34545","45656",12345);
	}{
		System.out.println("Invalid params please pass which payment gateway you would like to use...");
	}
	
	
	
}
}
