package wellfernandes.com.github.email.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import wellfernandes.com.github.email.models.EmailModel;
import wellfernandes.com.github.email.repositories.EmailRepository;

@Service
public class EmailService {

	@Autowired
	EmailRepository emailRepository;

	public void sendEmail(EmailModel emailModel) {

	}
}
