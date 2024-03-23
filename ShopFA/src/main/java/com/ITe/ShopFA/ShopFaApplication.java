package com.ITe.ShopFA;

import com.ITe.ShopFA.UI.SignInView;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ShopFaApplication {
//	@Autowired
//	private EmailSenderService emailSenderService;

	public static void main(String[] args) {
		new SignInView();
		SpringApplication.run(ShopFaApplication.class, args);
	}
//	@EventListener(ApplicationReadyEvent.class)
//	public void sendMail(){
//		emailSenderService.sendEmail("phatlth.23ITe@vku.udn.vn","hello", "434");
//	}

}
