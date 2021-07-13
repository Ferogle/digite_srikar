package testing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;

public class TestAccount {
	
	private Account acnt;
	
	public TestAccount() {
		// TODO Auto-generated constructor stub
	}
	
	@BeforeEach
	public void init() {
		acnt=new Account(1000);
	}
	
	@Test
	public void testWithdraw() throws BalanceException{
		assertEquals(500,acnt.withdraw(500));
	}

}
