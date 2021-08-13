/**********************************************************************************************************************************************************************
 *
 * Ability to create a Contacts in AddressBook
 * Add first and last names, address, city, state, zip, phone number and email
 * Ability to Add new contacts , Edit existing contacts , Delete contacts
 *
 * @author : Immanuvel Jeeva
 * @Sice   : 20-07-2021
 *
 ********************************************************************************************************************************************************************/
package com.company.Addressbook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class AddressBookMainFunction {

    public static ArrayList<Contacts> contatctsArrayList1 = new ArrayList<>();
    public static ArrayList<Contacts> contatctsArrayList2 = new ArrayList<>();
    public static ArrayList<Contacts> contatctsArrayList3 = new ArrayList<>();
    public static ArrayList<Contacts> contatctsArrayList4 = new ArrayList<>();
    public static ArrayList<Contacts> contatctsArrayList5 = new ArrayList<>();

    public static HashMap<String,ArrayList<Contacts>> TotalAddressBook = new HashMap<>();

    static void mainMenu() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n================================== ADDRESS BOOK =========================================");
        System.out.println("1 . Add a New Contact");
        System.out.println("2 . Edit a exist Contact");
        System.out.println("3 . Delete a Contact");
        System.out.println("4 . View Contact list");
        System.out.println("5 . View All Address Book Names");
        System.out.println("6 . Search a Person");
        System.out.println("7 . View exact person Details");
        System.out.println("8 . Get Total Number of contact Present in Specific AddressBook");
        System.out.println("9 . Exit");
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
            case 6 ->{
                Uc8.SearchContact();
                mainMenu();
            }
            case 7 ->{
                Uc9.viewContact();
                mainMenu();
            }
            case 8 ->{
                Uc10.GetTotalcount();
                mainMenu();
            }
            case 9 -> System.out.println("Thanking You");
            default -> System.out.println("Some thing Wrong");
        }
    }

    // View The Contact List
    private static void View(ArrayList<Contacts> contatctsArrayList) {
        for (Contacts i : contatctsArrayList) {
            System.out.println(i);
        }
        if(contatctsArrayList.isEmpty())
            System.out.println("Contacts List is Empty");
    }

    public static void main(String[] args) {

        mainMenu();
    }
}
