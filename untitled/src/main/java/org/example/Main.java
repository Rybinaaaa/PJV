package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ContactList list = new ContactList();
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Name: ");
            String name = sc.nextLine();

            System.out.println("Surname: ");
            String surname = sc.nextLine();

            System.out.println("Number: ");
            String number = sc.nextLine();

            System.out.println("Address: ");
            String address = sc.nextLine();

            Contact contact = new Contact(name, surname, number, address);
        } catch (PhoneNumberException e) {
            System.out.println("Incorrect number!");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }
}