import java.util.Random;
public class CardswithJoker {
    static String suitSymbol;
    static int cardNumber;
    public static void printCard(int cardNumber){
        if (cardNumber >= 0 && cardNumber <= 9){
            System.out.format("\uD83C\uDF44\uD83C\uDF3F\uD83C\uDF44\uD83C\uDF3F\uD83C\uDF44\uD83C\uDF3F\uD83C\uDF44\n" +
                    "\uD83C\uDF3F╔═════════╗\uD83C\uDF3F\n" +
                    "\uD83C\uDF44║ %d       ║\uD83C\uDF44\n" +
                    "\uD83C\uDF3F║         ║\uD83C\uDF3F\n" +
                    "\uD83C\uDF44║    %s    ║\uD83C\uDF44\n" +
                    "\uD83C\uDF3F║         ║\uD83C\uDF3F\n" +
                    "\uD83C\uDF44║       %d ║\uD83C\uDF44\n" +
                    "\uD83C\uDF3F╚═════════╝\uD83C\uDF3F\n" +
                    "\uD83C\uDF44\uD83C\uDF3F\uD83C\uDF44\uD83C\uDF3F\uD83C\uDF44\uD83C\uDF3F\uD83C\uDF44", CardswithJoker.cardNumber, suitSymbol, CardswithJoker.cardNumber);
        }
        else if (cardNumber == 10){
            System.out.format("\uD83C\uDF44\uD83C\uDF3F\uD83C\uDF44\uD83C\uDF3F\uD83C\uDF44\uD83C\uDF3F\uD83C\uDF44\n" +
                    "\uD83C\uDF3F╔═════════╗\uD83C\uDF3F\n" +
                    "\uD83C\uDF44║ %d      ║\uD83C\uDF44\n" +
                    "\uD83C\uDF3F║         ║\uD83C\uDF3F\n" +
                    "\uD83C\uDF44║    %s    ║\uD83C\uDF44\n" +
                    "\uD83C\uDF3F║         ║\uD83C\uDF3F\n" +
                    "\uD83C\uDF44║      %d ║\uD83C\uDF44\n" +
                    "\uD83C\uDF3F╚═════════╝\uD83C\uDF3F\n" +
                    "\uD83C\uDF44\uD83C\uDF3F\uD83C\uDF44\uD83C\uDF3F\uD83C\uDF44\uD83C\uDF3F\uD83C\uDF44", CardswithJoker.cardNumber, suitSymbol, CardswithJoker.cardNumber);
        }
        else if (cardNumber == 11){
            System.out.format("\uD83C\uDF44\uD83C\uDF3F\uD83C\uDF44\uD83C\uDF3F\uD83C\uDF44\uD83C\uDF3F\uD83C\uDF44\n" +
                    "\uD83C\uDF3F╔═════════╗\uD83C\uDF3F\n" +
                    "\uD83C\uDF44║ J       ║\uD83C\uDF44\n" +
                    "\uD83C\uDF3F║         ║\uD83C\uDF3F\n" +
                    "\uD83C\uDF44║    %s    ║\uD83C\uDF44\n" +
                    "\uD83C\uDF3F║         ║\uD83C\uDF3F\n" +
                    "\uD83C\uDF44║       J ║\uD83C\uDF44\n" +
                    "\uD83C\uDF3F╚═════════╝\uD83C\uDF3F\n" +
                    "\uD83C\uDF44\uD83C\uDF3F\uD83C\uDF44\uD83C\uDF3F\uD83C\uDF44\uD83C\uDF3F\uD83C\uDF44", suitSymbol);
        }
        else if (cardNumber == 12){
            System.out.format("\uD83C\uDF44\uD83C\uDF3F\uD83C\uDF44\uD83C\uDF3F\uD83C\uDF44\uD83C\uDF3F\uD83C\uDF44\n" +
                    "\uD83C\uDF3F╔═════════╗\uD83C\uDF3F\n" +
                    "\uD83C\uDF44║ Q       ║\uD83C\uDF44\n" +
                    "\uD83C\uDF3F║         ║\uD83C\uDF3F\n" +
                    "\uD83C\uDF44║    %s    ║\uD83C\uDF44\n" +
                    "\uD83C\uDF3F║         ║\uD83C\uDF3F\n" +
                    "\uD83C\uDF44║       Q ║\uD83C\uDF44\n" +
                    "\uD83C\uDF3F╚═════════╝\uD83C\uDF3F\n" +
                    "\uD83C\uDF44\uD83C\uDF3F\uD83C\uDF44\uD83C\uDF3F\uD83C\uDF44\uD83C\uDF3F\uD83C\uDF44", suitSymbol);
        }
        else if (cardNumber == 13){
            System.out.format("\uD83C\uDF44\uD83C\uDF3F\uD83C\uDF44\uD83C\uDF3F\uD83C\uDF44\uD83C\uDF3F\uD83C\uDF44\n" +
                    "\uD83C\uDF3F╔═════════╗\uD83C\uDF3F\n" +
                    "\uD83C\uDF44║ K       ║\uD83C\uDF44\n" +
                    "\uD83C\uDF3F║         ║\uD83C\uDF3F\n" +
                    "\uD83C\uDF44║    %s    ║\uD83C\uDF44\n" +
                    "\uD83C\uDF3F║         ║\uD83C\uDF3F\n" +
                    "\uD83C\uDF44║       K ║\uD83C\uDF44\n" +
                    "\uD83C\uDF3F╚═════════╝\uD83C\uDF3F\n" +
                    "\uD83C\uDF44\uD83C\uDF3F\uD83C\uDF44\uD83C\uDF3F\uD83C\uDF44\uD83C\uDF3F\uD83C\uDF44", suitSymbol);
        }
    }
    static String[] cardDeck = {"Joker", "Ace of Clubs", "Two of Clubs", "Three of Clubs", "Four of Clubs", "Five of Clubs", "Six of Clubs", "Seven of Clubs", "Eight of Clubs", "Nine of Clubs", "Ten of Clubs", "Jack of Clubs", "Queen of Clubs", "King of Clubs", "Ace of Diamonds", "Two of Diamonds", "Three of Diamonds", "Four of Diamonds", "Five of Diamonds", "Six of Diamonds", "Seven of Diamonds", "Eight of Diamonds", "Nine of Diamonds", "Ten of Diamonds", "Jack of Diamonds", "Queen of Diamonds", "King of Diamonds", "Ace of Hearts", "Two of Hearts", "Three of Hearts", "Four of Hearts", "Five of Hearts", "Six of Hearts", "Seven of Hearts", "Eight of Hearts", "Nine of Hearts", "Ten of Hearts", "Jack of Hearts", "Queen of Hearts", "King of Hearts", "Ace of Spades", "Two of Spades", "Three of Spades", "Four of Spades", "Five of Spades", "Six of Spades", "Seven of Spades", "Eight of Spades", "Nine of Spades", "Ten of Spades", "Jack of Spades", "Queen of Spades", "King of Spades", "Joker"};
    static int[] cardValue = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13,0};
    public static String getCardSuit(int cardpull){
        if (cardpull == 0){
            suitSymbol = ("J");
        }
        else if (cardpull >0 && cardpull <14){
            suitSymbol = ("♠");
        }
        else if (cardpull >=14 && cardpull <27){
            suitSymbol = ("♦");
        }
        else if (cardpull >=27 && cardpull <40){
            suitSymbol = ("♥");
        }
        else if (cardpull >=40 && cardpull <53){
            suitSymbol = ("♣");
        }
        else if (cardpull == 53){
            suitSymbol = ("J");
        }
        return suitSymbol;
    }
    public static void main(String[] args) {
        System.out.println("Pull a Card: ");
        Random random = new Random();
        int cardpull = random.nextInt(0, 53);
        System.out.println(cardDeck[cardpull]);
        cardNumber = cardValue[cardpull];
        suitSymbol = getCardSuit(cardpull);
        printCard(cardNumber);


    }
}
