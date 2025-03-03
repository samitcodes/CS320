// Samit Datta

package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContactTest {

    // checks valid Contact created
    @Test
    void testValidContactCreation() {
        Contact contact = new Contact("123", "John", "Doe", "1234567890", "123 Elm Street");
        assertEquals("123", contact.getContactID());
        assertEquals("John", contact.getFirstName());
        assertEquals("Doe", contact.getLastName());
        assertEquals("1234567890", contact.getPhone());
        assertEquals("123 Elm Street", contact.getAddress());
    }

    // test if contactID input fails the requirement
    @Test
    void testInvalidContactID() {
        Contact contact = new Contact("12345697101", "Benny Juan Hector James", "Hernadez Perez-Lopez Jr", "12345678910", "98 Taumatawhakatangihangakoauau Rd");
        assertEquals("12345697101", contact.getContactID());
        assertEquals("Benny Juan Hector James", contact.getFirstName());
        assertEquals("Hernadez Perez-Lopez Jr", contact.getLastName());
        assertEquals("12345678910", contact.getPhone());
        assertEquals("98 Taumatawhakatangihangakoauau Rd", contact.getAddress());
    }

    // test if firstName input fails the requirement
    @Test
    void testInvalidFirstName() {
        Contact contact = new Contact("1234569710", "Benny Juan Hector James", "Hernadez Perez-Lopez Jr", "12345678910", "98 Taumatawhakatangihangakoauau Rd");
        assertEquals("1234569710", contact.getContactID());
        assertEquals("Benny Juan Hector James", contact.getFirstName());
        assertEquals("Hernadez Perez-Lopez Jr", contact.getLastName());
        assertEquals("12345678910", contact.getPhone());
        assertEquals("98 Taumatawhakatangihangakoauau Rd", contact.getAddress());
    }

    // test if lastName input fails the requirement
    @Test
    void testInvalidLastName() {
        Contact contact = new Contact("1234569710", "Benny", "Hernadez Perez-Lopez Jr", "12345678910", "98 Taumatawhakatangihangakoauau Rd");
        assertEquals("1234569710", contact.getContactID());
        assertEquals("Benny", contact.getFirstName());
        assertEquals("Hernadez Perez-Lopez Jr", contact.getLastName());
        assertEquals("12345678910", contact.getPhone());
        assertEquals("98 Taumatawhakatangihangakoauau Rd", contact.getAddress());
    }

    // test if Phone input fails the requirement
    @Test
    void testInvalidPhone(){
        Contact contact = new Contact("1234569710", "Benny", "Hernadez", "123456789", "98 Taumatawhakatangihangakoauau Rd");
        assertEquals("1234569710", contact.getContactID());
        assertEquals("Benny", contact.getFirstName());
        assertEquals("Hernadez", contact.getLastName());
        assertEquals("123456789", contact.getPhone());
        assertEquals("98 Taumatawhakatangihangakoauau Rd", contact.getAddress());
    }

    // test if Address input fails the requirement
    @Test
    void testInvalidAddress() {
        Contact contact = new Contact("1234569710", "Benny", "Hernadez", "1234567891", "98 Taumatawhakatangihangakoauau Rd");
        assertEquals("1234569710", contact.getContactID());
        assertEquals("Benny", contact.getFirstName());
        assertEquals("Hernadez", contact.getLastName());
        assertEquals("1234567891", contact.getPhone());
        assertEquals("98 Taumatawhakatangihangakoauau Rd", contact.getAddress());
    }
}

