package agenda.service;

import agenda.model.base.Contact;
import agenda.model.repository.classes.RepositoryContactFile;
import agenda.model.repository.interfaces.RepositoryContact;

public class ContactService {
    private RepositoryContact repositoryContact;

    public ContactService() throws Exception {
        repositoryContact = new RepositoryContactFile();
    }

    public void add(Contact contact) {
        repositoryContact.addContact(contact);
    }
}
