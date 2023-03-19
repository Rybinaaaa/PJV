package cz.cvut.fel.pjv;

import java.util.Arrays;

public class BruteForceAttacker extends Thief {
    public void iterate(int sizeOfPassword, char[] password, int counter, char[] letters) {
        if (isOpened()) return;
        if (counter == sizeOfPassword) {
            tryOpen(password);
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
        iterate(sizeOfPassword, password, 0, letters);
    }
}
