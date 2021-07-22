/***********************************************************************************************************************
 *
 * Refactor all the code and ability to create multiple addressBook
 * Add contacts to the addressBook
 *
 * @author : Immanuvel Jeeva
 * @Since  : 21-07-2021
 *
 **********************************************************************************************************************/
package com.company.Addressbook;

public class Uc6 {

    public static void addNewContacts(int stateid, Uc1 contacts) {

        switch (stateid) {
            case 1 -> {
                AddressBookMainFunction.contatctsArrayList1.add(contacts);
                AddressBookMainFunction.TotalAddressBook.put(" DELHI PEOPLE ADDRESS BOOK", AddressBookMainFunction
                        .contatctsArrayList1);
            }
            case 2 -> {
                AddressBookMainFunction.contatctsArrayList2.add(contacts);
                AddressBookMainFunction.TotalAddressBook.put(" TAMILNADU PEOPLE ADDRESS BOOK", AddressBookMainFunction
                        .contatctsArrayList2);
            }
            case 3 -> {
                AddressBookMainFunction.contatctsArrayList3.add(contacts);
                AddressBookMainFunction.TotalAddressBook.put(" MUMBAI PEOPLE ADDRESS BOOK", AddressBookMainFunction
                        .contatctsArrayList3);
            }
            case 4 -> {
                AddressBookMainFunction.contatctsArrayList3.add(contacts);
                AddressBookMainFunction.TotalAddressBook.put(" KERALA PEOPLE ADDRESS BOOK", AddressBookMainFunction
                        .contatctsArrayList4);
            }
            case 5 -> {
                AddressBookMainFunction.contatctsArrayList3.add(contacts);
                AddressBookMainFunction.TotalAddressBook.put(" PUNJAB PEOPLE ADDRESS BOOK", AddressBookMainFunction
                        .contatctsArrayList5);
            }
            default -> System.out.println("Some thing went Wrong");
        }
    }
}
