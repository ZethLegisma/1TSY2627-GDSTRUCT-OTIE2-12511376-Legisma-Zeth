import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();

        CardStack deck = new CardStack();
        CardStack hand = new CardStack();
        CardStack discard = new CardStack();

        String[] cardNames = {"Strike", "Defend", "Heal", "Firebawl", "StinkBreath", "Shield", "Boosto", "BarrelRoll"};

        // populate deck
        for (int i = 1; i <= 30; i++) {
            deck.push(new Card(cardNames[r.nextInt(cardNames.length)] + " " + i));
        }

        System.out.println("game started. Good luck dear adventurer\n");

        while (!deck.isEmpty()) {
            int action = r.nextInt(3);

            if (action == 0) {
                int x = r.nextInt(5) + 1;
                System.out.println("--> drawing " + x + " cards");
                int c = 0;
                while (c < x && !deck.isEmpty()) {
                    hand.push(deck.pop());
                    c++;
                }
            } else if (action == 1) {
                if (hand.isEmpty()) {
                    System.out.println("--> hand empty, skipping discard");
                } else {
                    int x = r.nextInt(Math.min(5, hand.size())) + 1;
                    System.out.println("--> discarding " + x);
                    for (int i = 0; i < x; i++) {
                        if (!hand.isEmpty()) discard.push(hand.pop());
                    }
                }
            } else {
                if (discard.isEmpty()) {
                    System.out.println("--> discard pile empty");
                } else {
                    int x = r.nextInt(Math.min(5, discard.size())) + 1;
                    System.out.println("--> grabbing " + x + " from discard");
                    for (int i = 0; i < x; i++) {
                        if (!discard.isEmpty()) hand.push(discard.pop());
                    }
                }
            }

            // print stats
            System.out.println("\n===== ROUND INFO =====");
            System.out.println("Hand: [ " + hand.getItemsAsString() + " ]");
            System.out.println("Deck remaining: " + deck.size());
            System.out.println("Discard pile: " + discard.size());
            System.out.println("======================" +
                    "");

            if (!deck.isEmpty()) {
                System.out.print("Press enter to continue");
                s.nextLine();
                System.out.println();
            }
        }

        System.out.println("\ndeck is empty, game over!");
        s.close();
    }
}