/***********************************************************************************************************************
 *
 * Ability to create a Contacts in AddressBook
 * Add first and last names, address, city, state, zip, phone number and email
 * Ability to Add new contacts , Edit existing contacts , Delete contacts
 *
 * @author : Immanuvel Jeeva
 * @Sice   : 20-07-2021
 *
 **********************************************************************************************************************/
package com.company.Addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookMainFunction {

    public static ArrayList<Uc1> contatctsArrayList1 = new ArrayList<>();

    static void mainMenu() {
        Scanner sc = new Scanner(System.in);

        System.out.println("================================== ADDRESS BOOK =========================================");
        System.out.println("1 . Add a New Contact");
        System.out.println("2 . Edit a exist Contact");
        System.out.println("3 . Delete a Contact");
        System.out.println("4 . View Contact list");
        System.out.println("5 . Exit");
        int choice = sc.nextInt();
        switch (choice) {
            case 1 -> {
                Uc2.addContacts();
                mainMenu();
            }
            case 2 -> {
                Uc3.editContacts();
                mainMenu();
            }
            case 3 -> {
                Uc4.removeContacts();
                mainMenu();
            }
            case 4 -> {
                for (Uc1 i : contatctsArrayList1) {
                    System.out.println(i);
                }
                if(contatctsArrayList1.isEmpty()) {
                    System.out.println("ContactsList is empty.");
                }
                mainMenu();
            }
            case 5 -> System.out.println("Thanking You");
            default -> System.out.println("Some thing Wrong");
        }
    }

    public static void main(String[] args) {

        mainMenu();
    }
}
