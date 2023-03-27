package org.example;


import java.util.Collection;

public class ContactList {
    private Collection<Contact> list;

    public ContactList() {
    }

    public void addContact(Contact c) {
        list.add(c);
    }
 }
