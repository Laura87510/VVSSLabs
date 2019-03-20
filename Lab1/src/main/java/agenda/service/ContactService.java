package agenda.service;

import agenda.exceptions.InvalidFormatException;
import agenda.model.base.Contact;
import agenda.model.repository.classes.RepositoryContactFile;
import agenda.model.repository.interfaces.RepositoryContact;

public class ContactService {
    private RepositoryContact repositoryContact;

    public ContactService() throws Exception {
        repositoryContact = new RepositoryContactFile();
    }

    public void add(String name, String address, String telefon) {
        try{
            Contact c = new Contact(name, address, telefon);
            repositoryContact.addContact(c);
        } catch (InvalidFormatException e) {
            if (e.getCause() != null)
                System.out.printf("Eroare: %s - %s\n" + e.getMessage(), e
                        .getCause().getMessage());
            else
                System.out.printf("Eroare: %s\n" + e.getMessage());
        }
    }
}
