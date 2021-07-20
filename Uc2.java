/***********************************************************************************************************************
 *
 * Ability to add a new Contact to Address Book
 * Use Console to add person details and Store it.
 *
 * @author : Immanuvel Jeeva
 * @Since   : 20-07-2021
 *
 **********************************************************************************************************************/
package com.company.Addressbook;

import java.util.Scanner;

public class Uc2 {

    // Use addContacts method and get input from user
    public static void addContacts() {

        Scanner sc = new Scanner(System.in);
        Uc1 contacts = new Uc1();

        System.out.println("Enter first name");
        String firstName = sc.next();
        contacts.setFirstName(firstName);

        System.out.println("Enter last name");
        String lastName = sc.next();
        contacts.setLastName(lastName);

        System.out.println("Enter Address");
        String address = sc.next();
        contacts.setAddress(address);

        System.out.println("Enter city");
        String city = sc.next();
        contacts.setCity(city);

        System.out.println("Enter state");
        String state = sc.next();
        contacts.setState(state);

        System.out.println("Enter zip number");
        int zip = sc.nextInt();
        contacts.setZip(zip);

        System.out.println("Enter Phone Number");
        long phoneNumber = sc.nextLong();
        contacts.setPhoneNumber(phoneNumber);

        System.out.println("Enter Email");
        String email = sc.next();
        contacts.setEmail(email);

        AddressBookMainFunction.contatctsArrayList1.add(contacts); // adding contacts to the AddressBook
    }
}
