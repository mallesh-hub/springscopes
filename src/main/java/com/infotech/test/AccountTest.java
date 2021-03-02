package com.infotech.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.infotech.cofig.AccountConfig;
import com.infotech.model.Account;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		ApplicationContext context=new AnnotationConfigApplicationContext(AccountConfig.class);
		Account account = context.getBean("account", Account.class);
		Account account1 = context.getBean("account1", Account.class);
		
		System.out.println(account);
		System.out.println(account1);
		System.out.println(account.hashCode()+"=="+account1.hashCode());
		
	}

}
