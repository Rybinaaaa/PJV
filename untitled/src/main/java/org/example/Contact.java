package org.example;

public class Contact {
    private String name;
    private String surname;
    private String number;
    private String address;

    public String validateNumber(String number) throws PhoneNumberException {
        if (number == "") {
//            default exception
//            Exception e = new Exception();
//            PhoneNumberException e = new PhoneNumberException(number, "number not exist");

//            custom exceptions ->>
            throw new PhoneNumberException();
        }
        return number;
    }

    public Contact(String name, String surname, String number, String address) throws PhoneNumberException {
        this.name = name;
        this.surname = surname;
        setNumber(number);
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) throws PhoneNumberException {
        this.number = validateNumber(number);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return String.format("Name: %s;\n Surname: %s; \n; Number: %s; Adres: %s", name, surname, number, address);
    }
}
