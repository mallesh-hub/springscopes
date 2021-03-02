package com.infotech.cofig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.infotech.model.Account;

@Configuration
@Scope("singleton")
//@Scope("prototype")

public class AccountConfig {
	
	@Bean
	public Account account() {
		Account account = new Account();
		account.setA_id(242422);
		account.setA_name("SBI");
		return account;
	}

	@Bean
	public Account account1() {
		Account account1 = new Account();
		account1.setA_id(2424);
		account1.setA_name("ICICI");
		return account1;
	}
}
