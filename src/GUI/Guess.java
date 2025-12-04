package GUI;

import PrinciplesOfOOP.Main;

public class Guess extends Main {
    static int index;

Guess guess = new Guess();

    static void checkAnswer() {
        int i;

        for (i = 0; i <= 13; i++) {
            if (SelectionArray.select[i] == true) {
                index = i;
                break;
            }
        }

    }
    public static int getIndex(){
        return index;
    }




}