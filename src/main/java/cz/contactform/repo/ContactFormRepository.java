package cz.contactform.repo;

import org.springframework.data.repository.CrudRepository;

import cz.contactform.entity.ContactForm;

public interface ContactFormRepository extends CrudRepository<ContactForm, Long> {

}
