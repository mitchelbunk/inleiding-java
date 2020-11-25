package CreativeMe;

import java.applet.Applet;
import java.util.ArrayList;

public class CardShuffle extends Applet {
    public static final int DECK_SIZE = 52;

    public static void main(String args[]) {
        ArrayList<Integer> deck = new ArrayList<Integer>();

        for (int i = 0; i < DECK_SIZE; i++) {
            deck.add(i);
        }
        ArrayList<Integer> shuffledDeck = new ArrayList<>();

        while (deck.size() > 0) {
            int index = (int) (Math.random() * deck.size());
            shuffledDeck.add(deck.remove(index));

        }
        System.out.println(shuffledDeck.toString());
    }
}
