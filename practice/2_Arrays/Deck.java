import java.security.SecureRandom;

public class Deck {
    private Card[] deck = new Card[52];
    private final SecureRandom randomizer = new SecureRandom();
    public final int NUMBER_OF_CARDS = 52;
    private int currentCard = 0;

    public Deck() {
        String[] faces = { "three", "four", "five", "six", "seven", "eight", "nine", "ten", "ace", "duce", "jack",
                "queen", "king" };
        String[] suits = { "hearts", "spades", "diamonds", "clubs" };
        // using clever forumula
        // for(int counter=0;counter<deck.length;counter++){
        // deck[counter]=new Card(faces[counter%13], suits[counter/13]);
        // }

        // using counters
        // int deckCount = 0;
        // for (int suitCount = 0; suitCount < suits.length; suitCount++) {
        // for (int faceCount = 0; faceCount < faces.length; faceCount++) {
        // deck[deckCount] = new Card(faces[faceCount], suits[suitCount]);
        // deckCount++;

        // }
        // }

        // using for enhanced loop

        int deckCount = 0;
        for (String s : suits) {
            for (String f : faces) {
                deck[deckCount] = new Card(f, s);
                deckCount++;
            }
        }

    }

    public void shuffle() {
        currentCard = 0;
        for (int i = 0; i < deck.length; i++) {
            int randIndex = randomizer.nextInt(deck.length);
            Card temp = deck[i];
            deck[randIndex] = deck[i];
            deck[randIndex] = temp;

        }

    }

    public Card dealCard() {
        if (currentCard < deck.length) {

            return deck[currentCard++];
        } else {
            return null;
        }

    }

}
