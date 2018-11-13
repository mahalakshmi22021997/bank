package com.capg.bankapp.test;

import static org.junit.Assert.assertFalse;

import org.junit.BeforeClass;

import com.capg.bankapp.bean.Bean;
import com.capg.bankapp.service.BankServiceImp;
import com.capg.bankapp.service.IBankService;

public class Test {

	
	
	private static IBankService service=null;
	@BeforeClass
	public void test(){
		service=new BankServiceImp();
	}
	
	@org.junit.Test
	public void testTransfer(){
		
		Bean bean=new Bean();
		bean.setPhNo("9999999999");
		bean.setAmount(5000);
		bean.setPhno2("8888888888");
		boolean b=service.fundTransfer(bean.getPhNo(), bean.getAmount(), bean.getPhno2());
		
		assertFalse(b);
				
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
