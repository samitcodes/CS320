// Samit Datta

package org.example;

public class Contact {

    String contactID;
    String firstName;
    String lastName;
    String phone;
    String address;

    public Contact(String contactID, String firstName, String lastName, String phone, String address) {

        this.contactID = contactID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.address = address;


        if (contactID.length() > 10 || contactID == null) {
            throw new IllegalArgumentException("Invalid Contact ID! Contact ID must not be null or longer than 10 characters");
        }


        if (firstName.length() > 10 || firstName == null) {
            throw new IllegalArgumentException("Invalid First Name! First Name must not be null or longer than 10 characters");
        }


        if (lastName.length() > 10 || lastName == null) {
            throw new IllegalArgumentException("Invalid Last Name! Last Name must not be null or longer than 10 characters");
        }

        if (phone.length() != 10 || phone == null) {
            throw new IllegalArgumentException("Invalid Phone! Phone must not be null and must be exactly 10 characters");
        }

        if (address.length() > 30 || address == null) {
            throw new IllegalArgumentException("Invalid Address! Address must not be null or longer than 30 characters");
        }
    }

    // getter for contactID
    public String getContactID(){

        return contactID;

    }

    // getter for firstName
    public String getFirstName(){

        return firstName;

    }

    // setter for firstName
    public String setFirstName(String firstName){

        this.firstName = firstName;
        return firstName;
    }

    // getter for  lastName
    public String getLastName(){

        return lastName;

    }

    // setter for lastName
    public String setLastName(String lastName){

        this.lastName = lastName;
        return lastName;
    }

    // getter for phone
    public String getPhone(){

        return phone;

    }

    // setter for phone
    public String setPhone(String phone){

        this.phone = phone;
        return phone;
    }

    // getter for address
    public String getAddress(){

        return address;

    }

    // setter for address
    public String setAddress(String address){

        this.address = address;
        return address;

    }

}