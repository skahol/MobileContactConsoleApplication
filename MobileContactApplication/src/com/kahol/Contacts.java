package com.kahol;

import java.util.ArrayList;

class Contacts {
    private static ArrayList<String> contactName = new ArrayList<>();
    private static ArrayList<String> contactNum = new ArrayList<>();

    void  printAllContact(){
        if(contactName.isEmpty())
            System.out.println("No contact exist.");
        else {
            for (int i = 0; i < contactName.size(); i++) {
                System.out.print("Name :" + contactName.get(i));
                System.out.println("  Phone no. :" + contactNum.get(i));
            }
        }
    }

    void addContact(String name,String num){

        if(contactName.size()>1) {
            boolean exist = contactName.contains(name);
            if (exist) {
                System.out.println("Contact already saved with same name.");
            }

            int index = contactNum.indexOf(num);
            if (index >= 0) {
                System.out.println("Contact already saved with same number by name :" + contactName.get(index));
            }
        }
        else {
            contactName.add(name);
            contactNum.add(num);
            System.out.println("Contact has been successfully added.");
        }
    }
    void  updateContact(String nameOfContactToModify, String byNum){
        int index=contactName.indexOf(nameOfContactToModify);
        if(index>=0) {
            contactNum.set(index, byNum);
            System.out.println("Contact has been successfully updated.");
        }
        else{
            System.out.println("Incorrect contact name");
        }
    }
    void  removeContact(String name){
        int index=contactName.indexOf(name);
        contactName.remove(index);
        contactNum.remove(index);
    }
    void  findContact(String str){
        int index=contactName.indexOf(str);      // if not present return -1;
        if(index>=0) {
            System.out.println("Contact name :"+contactName.get(index));
            System.out.println("Phone Number :"+contactNum.get(index));
        }
        else{
            System.out.println("Contact doesn't exist.");
        }
    }
}
