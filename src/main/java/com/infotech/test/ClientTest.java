package com.infotech.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.infotech.model.Message;

public class ClientTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
		Message message1=ctx.getBean(Message.class);
		//Message message1=ctx.getBean("msg", Message.class);
		message1.setMessageId(101);
		message1.setMessage("hello spring");
		System.out.println(message1.getMessageId()+""+message1.getMessage());
		
		Message message2=ctx.getBean(Message.class);
		
	System.out.println(	message2.hashCode()+"::"+message1.hashCode());
         //Message message2=ctx.getBean("msg", Message.class);
        message2.setMessageId(102);
        message2.setMessage("hello world");
         System.out.println(message2.getMessageId()+""+message2.getMessage());
         
         ((AbstractApplicationContext) ctx).close();
         
	}

}
