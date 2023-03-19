package cz.cvut.fel.pjv;

import java.util.Arrays;

public class BruteForceAttacker extends Thief {
    public void iterate(int sizeOfPassword, char[] password, int counter, char[] letters) {
//        System.out.println("LENGHT ->" + counter);
//        System.out.println("STRING ->" + Arrays.toString(password));
        if (counter == sizeOfPassword) {
            System.out.println("УСЛОВИЕ ВЫПОЛНЕНО");
            System.out.println("STRING ->" + Arrays.toString(password));
            tryOpen(password);
            if (isOpened()) {
                System.out.println("1 point -> " + Arrays.toString(password));
                return;
            }
            return;
        }

        for (char ch : letters) {
            password[counter] = ch;
            iterate(sizeOfPassword, password, counter + 1, letters);
        }
    }

    @Override
    public void breakPassword(int sizeOfPassword) {
        char[] password = new char[sizeOfPassword];
        char[] letters = this.getCharacters();
        System.out.println(letters);
        iterate(sizeOfPassword, password, 0, letters, false);
    }
}
