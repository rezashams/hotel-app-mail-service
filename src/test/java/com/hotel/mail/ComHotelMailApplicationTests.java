package com.hotel.mail;

import com.hotel.mail.service.MailJitService;
import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.errors.MailjetSocketTimeoutException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ComHotelMailApplicationTests {

	@Autowired
	private    MailJitService mailJitService;




	@Test
	public void contextLoads()  {

	}

	@Test
	public void sendEmailTest() throws MailjetSocketTimeoutException, MailjetException {
		System.out.println("start test");
		mailJitService.sendEmail("","","","");
		System.out.println("end test");

	}

}
