package cz.contactform.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cz.contactform.dto.ContactFormDto;
import cz.contactform.entity.ContactForm;
import cz.contactform.repo.ContactFormRepository;

@Service
public class ContactFormService {

	@Autowired
	private ContactFormRepository repo;
	
	public ContactFormDto create(ContactFormDto contactForm) {
		ContactForm domain = transform(contactForm);
		return transform(repo.save(domain));
	}
	
	
	public ContactFormDto transform(ContactForm from) {
		ContactFormDto to = new ContactFormDto();
		to.setKindOfRequest(from.getKindOfRequest());
		to.setPolicyNumber(from.getPolicyNumber());
		to.setName(from.getName());
		to.setSurname(from.getSurname());
		to.setRequest(from.getRequest());
		return to;
	}
	
	public ContactForm transform(ContactFormDto from) {
		ContactForm to = new ContactForm();
		to.setKindOfRequest(from.getKindOfRequest());
		to.setPolicyNumber(from.getPolicyNumber());
		to.setName(from.getName());
		to.setSurname(from.getSurname());
		to.setRequest(from.getRequest());
		return to;
	}
}
