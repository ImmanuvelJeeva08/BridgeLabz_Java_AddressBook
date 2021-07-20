/***********************************************************************************************************************
 *
 * Ability to delete a person using person's name
 * Use Console to delete a person
 *
 * @author : Immanuvel Jeeva
 * @Since   : 20-07-2021
 *
 **********************************************************************************************************************/
package com.company.Addressbook;

import java.util.Scanner;

public class Uc4 {

    // Remove contacts Based on User wish
    public static void removeContacts() {
        boolean b = false;

        try {
            Scanner sc4 = new Scanner(System.in);

            System.out.println("Enter name of which person contact you delete");
            String delete = sc4.next();

            for (Uc1 i : AddressBookMainFunction.contatctsArrayList1) {
                b = i.getFirstName().contains(delete);
                if (i.getFirstName().equals(delete)) {
                    AddressBookMainFunction.contatctsArrayList1.remove(i);
                }
            }
        }
        catch (Exception e){
            System.out.println();
        }
        if(b) {
            System.out.println("Contact Successfully Deleted");
        }
        else
            System.out.println("Contact Not Found");
    }

}
