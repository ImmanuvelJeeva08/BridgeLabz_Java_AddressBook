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
import java.util.HashMap;
import java.util.Scanner;

public class AddressBookMainFunction {

    public static ArrayList<Uc1> contatctsArrayList1 = new ArrayList<>();
    public static ArrayList<Uc1> contatctsArrayList2 = new ArrayList<>();
    public static ArrayList<Uc1> contatctsArrayList3 = new ArrayList<>();
    public static ArrayList<Uc1> contatctsArrayList4 = new ArrayList<>();
    public static ArrayList<Uc1> contatctsArrayList5 = new ArrayList<>();

    public static HashMap<String,ArrayList<Uc1>> TotalAddressBook = new HashMap<>();

    static void mainMenu() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n================================== ADDRESS BOOK =========================================");
        System.out.println("1 . Add a New Contact");
        System.out.println("2 . Edit a exist Contact");
        System.out.println("3 . Delete a Contact");
        System.out.println("4 . View Contact list");
        System.out.println("5 . View All Address Book Names");
        System.out.println("6 . Exit");
        int choice = sc.nextInt();
        switch (choice) {
            case 1 -> {
                Uc5.addContacts();
                mainMenu();
            }
            case 2 -> {
                Uc3.editPart();
                mainMenu();
            }
            case 3 -> {
                Uc4.removePart();
                mainMenu();
            }
            case 4 -> {
                System.out.println("Enter Which State AddressBook You Want To See :");
                System.out.println("1.Delhi\n2TamilNadu\n3.Mumbai\n4.Kerala\n5.Punjab");
                int id = sc.nextInt();
                switch (id) {
                    case 1 -> View(AddressBookMainFunction.contatctsArrayList1);
                    case 2 -> View(AddressBookMainFunction.contatctsArrayList2);
                    case 3 -> View(AddressBookMainFunction.contatctsArrayList3);
                    case 4 -> View(AddressBookMainFunction.contatctsArrayList4);
                    case 5 -> View(AddressBookMainFunction.contatctsArrayList5);
                    default -> System.out.println("SomeThing Went Wrong");
                }
                mainMenu();
            }
            case 5 ->{
                for (String i : TotalAddressBook.keySet()) {
                    System.out.println(i);
                }
                if(TotalAddressBook.isEmpty()){
                    System.out.println("\nAddressBook List is Empty");
                }
                mainMenu();
            }
            case 6 -> System.out.println("Thanking You");
            default -> System.out.println("Some thing Wrong");
        }
    }

    // View The Contact List
    private static void View(ArrayList<Uc1> contatctsArrayList) {
        for (Uc1 i : contatctsArrayList) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {

        mainMenu();
    }
}
