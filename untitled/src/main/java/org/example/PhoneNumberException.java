package org.example;

public class PhoneNumberException extends Exception {
    public String invalidData;
    public String message;

    public PhoneNumberException() {
    }

    public PhoneNumberException(String message) {
        super(message);
    }

    public PhoneNumberException(String invalidData, String message) {
        super(message);
        this.invalidData = invalidData;
    }
}
