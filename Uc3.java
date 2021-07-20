/***********************************************************************************************************************
 *
 * Ability to edit existing contact person using their name
 * Using Console to Edit person details
 *
 * @author : Immanuvel Jeeva
 * @Since   : 20-07-2021
 *
 **********************************************************************************************************************/
package com.company.Addressbook;

import java.util.Scanner;

public class Uc3 {

    // Edit contacts Based on User wish
    public static void editContacts() {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter Name of the contact for editing");
        String editPerson = sc1.next();
        for (Uc1 i : AddressBookMainFunction.contatctsArrayList1){
            if(editPerson.equals(i.getFirstName())){
                System.out.println("Enter which part to you want to edit");
                System.out.println("1.firstname     2.lastname       3.address      4.city      5.state" +
                            "       6.zip      7.phone     8 .email");  // edit inside data of contacts
                int edit = sc1.nextInt();
                switch (edit) {
                    case 1 -> {
                        System.out.println("Enter New first name");
                        String firstName = sc1.next();
                        i.setFirstName(firstName);
                    }
                    case 2 -> {
                        System.out.println("Enter New Last name");
                        String lastName = sc1.next();
                        i.setLastName(lastName);
                    }
                    case 3 -> {
                        System.out.println("Enter New Address");
                        String address = sc1.next();
                        i.setAddress(address);
                    }
                    case 4 -> {
                        System.out.println("Enter New city Name");
                        String city = sc1.next();
                        i.setCity(city);
                    }
                    case 5 -> {
                        System.out.println("Enter new State name");
                        String state = sc1.next();
                        i.setState(state);
                    }
                    case 6 ->{
                        System.out.println("Enter new Zip number");
                        int zip = sc1.nextInt();
                        i.setZip(zip);
                    }
                    case 7 -> {
                        System.out.println("Enter new Phone Number");
                        long phoneNumber = sc1.nextLong();
                        i.setPhoneNumber(phoneNumber);
                    }
                    case 8 -> {
                        System.out.println("Enter new Email");
                        String email = sc1.next();
                        i.setEmail(email);
                    }
                    default -> System.out.println("Something went wrong");
                }
            }
        }
    }
}
