// Samit Datta

package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContactServiceTest {

    @Test
    void testAddContact() {

        ContactService service = new ContactService();

        //Add a contact
        String id = service.addContact("12323", "John", "Doe", "1234567890", "321 Address");

        assertNotNull(id);

        //Test duplicate contact ID
        boolean exceptionThrown = false;
        try {

            service.addContact("12323", "John", "Doe", "1234567890", "321 Address");
        } catch (IllegalArgumentException e) {

            exceptionThrown = true;
        }

        assertTrue(exceptionThrown);

    }

    @Test
    void testRemoveContact(){

        ContactService service = new ContactService();

        boolean exceptionThrown = false;
        try {

            boolean id = service.removeContact("12323");
            assertNotNull(id);

        } catch (IllegalArgumentException e) {

            exceptionThrown = true;
        }

        assertTrue(exceptionThrown);

    }

    @Test
    void testUpdateContact(){

        ContactService service = new ContactService();


        boolean exceptionThrown = false;
        try {

            boolean id = service.updateContact("12323", "John", "Doe", "1234567890", "321 Address");
            assertNotNull(id);

        } catch (IllegalArgumentException e) {

            exceptionThrown = true;
        }

        assertTrue(exceptionThrown);

    }
}

