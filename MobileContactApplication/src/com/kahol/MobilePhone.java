package com.kahol;
import java.lang.String;
import java.util.Scanner;

public class MobilePhone {
    private static Scanner scanner=new Scanner(System.in);
    private static Contacts contact=new Contacts();

    public static void main(String[] args){
        int choice;
        boolean quit=false;
        printInstruction();
        while(!quit){
            System.out.print("\nEnter choice :");
            choice=scanner.nextInt();
            scanner.nextLine();     //--> to clear buffer
            switch(choice){
                case 0:
                    printInstruction();
                    break;
                case 1:
                    printContactList();
                    break;
                case 2:
                    addMobileContact();
                    break;
                case 3:
                    updateMobileContact();
                    break;
                case 4:
                    removeMobileContact();
                    break;
                case 5:
                    searchMobileContact();
                    break;
                case 6:
                    quit=true;
                    break;
            }
        }
    }
    private static void printInstruction(){
        System.out.println("\nPress :");
        System.out.println(" 0 - To print choice options");
        System.out.println(" 1 - To print all saved contacts");
        System.out.println(" 2 - To add new contact");
        System.out.println(" 3 - To update an existing contact");
        System.out.println(" 4 - To remove an existing contact");
        System.out.println(" 5 - To search an existing contact");
        System.out.println(" 6 - To quit application");
    }
    private static void printContactList(){
        contact.printAllContact();
    }
    private static void addMobileContact(){
        System.out.print("Enter Full Name :");
        String s=scanner.nextLine();
        System.out.print("Enter Phone no. :");
        String n=scanner.nextLine();
        contact.addContact(s,n);
    }
    private static void updateMobileContact(){
        System.out.print("Enter Contact Name want to update :");
        String s = scanner.nextLine();
        System.out.print("Enter contact modified phone no. :");
        String num=scanner.nextLine();
        contact.updateContact(s,num);
    }
    private static void removeMobileContact(){
        System.out.print("Enter contact name to delete contact :");
        String s= scanner.nextLine();
        contact.removeContact(s);
        System.out.println("Contact has been deleted.");
    }
    private static void searchMobileContact(){
        System.out.print("Enter contact name to search :");
        String str=scanner.nextLine();
        contact.findContact(str);
    }
}
