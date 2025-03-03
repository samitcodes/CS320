// Samit Datta

package org.example;

import java.util.ArrayList;
import java.util.List;

public class ContactService {

    //instance variables
    List<Contact> Contacts;
    String contactID;
    String firstName;
    String lastName;
    String phone;
    String address;

    public static void main(String[] args) {

        Contact contact = new Contact("1", "James", "Beckham", "3425619121", "204 Dream Ave");

    }

    //constructor
    public ContactService() {

        Contacts = new ArrayList<Contact>();

    }


    //methods

    public String addContact(String contactID, String firstName, String lastName, String phone, String address) {


        for (Contact contact : Contacts) {

            if (contact.getContactID().equals(contactID)) {

                throw new IllegalArgumentException("Can't add something thats already there!");

            }

        }

        Contacts.add(new Contact(contactID, firstName, lastName, phone, address));

        return contactID;

    }


    public boolean removeContact(String contactID) {


        for (Contact contact : Contacts) {

            if (contact.getContactID().equals(contactID)) {

                Contacts.remove(contact);
                return true;

            }

        }

        throw new IllegalArgumentException("Can't remove something that isn't there!");

    }

    public boolean updateContact(String contactID, String firstName, String lastName, String phone, String address) {

        for (Contact contact : Contacts) {

            if (contact.getContactID().equals(contactID)) {

                if (firstName.length() > 10 || firstName == null) {
                    throw new IllegalArgumentException("Invalid First Name! First Name must not be null or longer than 10 characters");
                }
                contact.setFirstName(firstName);

                if (lastName.length() > 10 || lastName == null) {
                    throw new IllegalArgumentException("Invalid Last Name! Last Name must not be null or longer than 10 characters");
                }

                contact.setLastName(lastName);


                if (phone.length() != 10 || phone == null) {
                    throw new IllegalArgumentException("Invalid Phone! Phone must not be null and must be exactly 10 characters");
                }

                contact.setPhone(phone);

                if (address.length() > 30 || phone == null) {
                    throw new IllegalArgumentException("Invalid Address! Address must not be null or longer than 30 characters");
                }

                contact.setAddress(address);
              return true;
            }

        }

        throw new IllegalArgumentException("Can't update something that isn't there!");
    }
}
