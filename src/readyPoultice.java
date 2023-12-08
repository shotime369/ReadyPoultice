import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class readyPoultice {
    static String suitSymbol;
    static String cardNumber;
    static String characterSpecies;
    static int cardValue;
    static int cardSuit;
    static String descriptor;
    static String characterName;
    static String characterID;
    static int carry;
    static int speed;

    public static String getCardNumber(int cardValue){
        if (cardValue == 1){
            cardNumber = ("A");
        }
        else if (cardValue >= 2 && cardValue<= 10 ){
            cardNumber = String.valueOf(cardValue);
        }
        else if (cardValue == 11){
            cardNumber = ("J");
        }
        else if (cardValue == 12){
            cardNumber = ("M");
        }
        else if (cardValue == 13){
            cardNumber = ("M");
        }
        return cardNumber;
    }
    public static String getCardSuit(int cardSuit){

        switch (cardSuit) {
            case 0 -> suitSymbol = ("♠");
            case 1 -> suitSymbol = ("♦");
            case 2 -> suitSymbol = ("♥");
            case 3 -> suitSymbol = ("♣");
        }
        return suitSymbol;
    }
    public static void printCard() {
        Random random = new Random();
        cardValue = random.nextInt(1, 14);
        cardSuit = random.nextInt(0, 4);
        suitSymbol = getCardSuit(cardSuit);
        cardNumber = getCardNumber(cardValue);
        if (cardValue == 10) {
            System.out.format("""
                    \uD83C\uDF44\uD83C\uDF3F\uD83C\uDF44\uD83C\uDF3F\uD83C\uDF44\uD83C\uDF3F\uD83C\uDF44
                     \uD83C\uDF3F╔═════════╗\uD83C\uDF3F
                     \uD83C\uDF44║ %s      ║\uD83C\uDF44
                     \uD83C\uDF3F║         ║\uD83C\uDF3F
                     \uD83C\uDF44║    %s    ║\uD83C\uDF44
                     \uD83C\uDF3F║         ║\uD83C\uDF3F
                     \uD83C\uDF44║      %s ║\uD83C\uDF44
                     \uD83C\uDF3F╚═════════╝\uD83C\uDF3F
                     \uD83C\uDF44\uD83C\uDF3F\uD83C\uDF44\uD83C\uDF3F\uD83C\uDF44\uD83C\uDF3F\uD83C\uDF44
                    """, readyPoultice.cardNumber, suitSymbol, readyPoultice.cardNumber);
        } else {
            System.out.format("""
                    \uD83C\uDF44\uD83C\uDF3F\uD83C\uDF44\uD83C\uDF3F\uD83C\uDF44\uD83C\uDF3F\uD83C\uDF44
                    \uD83C\uDF3F╔═════════╗\uD83C\uDF3F
                    \uD83C\uDF44║ %s       ║\uD83C\uDF44
                    \uD83C\uDF3F║         ║\uD83C\uDF3F
                    \uD83C\uDF44║    %s    ║\uD83C\uDF44
                    \uD83C\uDF3F║         ║\uD83C\uDF3F
                    \uD83C\uDF44║       %s ║\uD83C\uDF44
                    \uD83C\uDF3F╚═════════╝\uD83C\uDF3F
                    \uD83C\uDF44\uD83C\uDF3F\uD83C\uDF44\uD83C\uDF3F\uD83C\uDF44\uD83C\uDF3F\uD83C\uDF44
                    """, readyPoultice.cardNumber, suitSymbol, readyPoultice.cardNumber);
        }
    }

    public static void speciesOptions(){
      switch (cardValue){
          case 1 -> {
              descriptor = "Aquatic";
              System.out.println("Ace = " + descriptor);
              System.out.println("Choose: Beaver, Dipper, Newt, Frog");
          }
          case 2 -> {
              descriptor = "Melodic";
              System.out.println("Two = " + descriptor);
              System.out.println("Choose: Finch, Tit, Swallow, Jay");
          }
          case 3 -> {
              descriptor = "Burrowing";
              System.out.println("Three = " + descriptor);
              System.out.println("Choose: Badger, Hare, Hedgehog, Mole");
          }
          case 4 ->{
              descriptor = "Playful";
              System.out.println("Four = " + descriptor);
              System.out.println("Choose: Crow, Skylark, Swift, Otter");
          }
          case 5 ->{
              descriptor = "Befurred";
              System.out.println("Five = " + descriptor);
              System.out.println("Choose: Squirrel, Shrew, Dormouse");
          }
          case 6 ->{
              descriptor = "Bescaled";
              System.out.println("Six = " + descriptor);
              System.out.println("Choose: Slow worm, Adder");
          }
          case 7 ->{
              descriptor = "Clawed";
              System.out.println("Seven = " + descriptor);
              System.out.println("Choose: Forest cat, Kestrel, Weasel");
          }
          case 8 ->{
              descriptor = "Sun-loving";
              System.out.println("Eight = " + descriptor);
              System.out.println("Choose: Stoat, Lizard, Seagull, Dove");
          }
          case 9 ->{
              descriptor = "Star-dancing";
              System.out.println("Nine = " + descriptor);
              System.out.println("Choose: Bat, Fox, Rat, Nightjar");
          }
          case 10 ->{
              descriptor = "Mud-dwelling";
              System.out.println("Ten = " + descriptor);
              System.out.println("Choose: Corncrake, Toad, Newt");
          }
          case 11 ->{
              descriptor = "Unnoticed";
              System.out.println("Jack = " + descriptor);
              System.out.println("Choose: Corncrake, Toad, Newt");
          }
          case 12, 13 ->{descriptor = "Majestic";
              System.out.println("Monarch = " + descriptor);
              System.out.println("Choose: Capercaillie, Pine Marten");
          }


      }

    }
    public static void save(String characterID) {
        FileWriter save = null;
        try {
            save = new FileWriter(characterID+".txt");
        } catch (IOException e) {
            System.out.println("Error occurred writing to file: " + e.toString());
        } finally {
            if (save != null) {
                try {
                    save.close();
                } catch (IOException ce) {
                    System.out.println("Failed to close the file: " + ce.toString());
                }
            }
        }
    }
    public static void happy() {
        Scanner sc = new Scanner(System.in);

        System.out.println("""
                                    Continue (1)\s
                                    Start New Character (2)\s
                                    Main Menu (3)\s
                """);
        System.out.print("Select your option: ");
        int option1 =  sc.nextInt();
        switch (option1) {
            case 1 -> {
            }
            case 2 -> {
                makeCharacter();
                happy();
            }
            case 3 -> System.out.println("***Main Menu***");
        }
    }
    public static void makeCharacter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Who are you?");
        System.out.println("Press enter to draw a card: ");
        scanner.nextLine();
        printCard();
        speciesOptions();
        Scanner input = new Scanner(System.in);
        System.out.format("\nEnter your species from the list above or choose your own %s animal: ", descriptor);
        characterSpecies = input.nextLine();
        // add error handling do not allow blank name or species *****************
        System.out.format("\nPlease choose a name for your %s : ", characterSpecies);
        characterName = input.nextLine();
        System.out.format("\nYour Poulticier is %s %s\n", characterName, characterSpecies);
        System.out.println("\nHow do you travel?");
        System.out.println("Carry determines how many items like tools and reagents you can hold. Speed affects how far you can travel when Moving.");
        System.out.print("Press enter to draw a card: ");
        scanner.nextLine();
        printCard();
        String travelStyle = ("");
        switch (cardSuit) {
            case 0 -> {
                travelStyle = ("Slow and Steady");
                speed = 2;
                carry = 5;
            }
            case 1, 2 -> {
                travelStyle = ("Rambling and Ready");
                speed = 3;
                carry = 4;
            }
            case 3 -> {
                travelStyle = ("Fast and Heady");
                speed = 4;
                carry = 3;
            }
        }
        System.out.format("\n%s Travel style is %s- Speed %d, Carry %d",suitSymbol, travelStyle, speed, carry);
        System.out.println("\nAlternatively you may pick Swift and Soaring - Speed 5, Carry 2");
        //add choice here*************
        System.out.println("\nHow do you start out?");
        System.out.println("A dangerous world makes most beasts practical. Our origins don't often start with idle dreams but calls to action. Who (or what) first helped you onto your path as a Poulticepounder?");
        System.out.print("Press enter to draw a card: ");
        scanner.nextLine();
        printCard();
        String origin = ("");
        switch (cardSuit) {
            case 0 -> {
                origin = (" Inspired by a passing Poulticier, and the impression they left.");
            }
            case 1 -> {
                origin = (" Recruited to help elderly Poulticiers find reagents.");
            }
            case 2 -> {
                origin = (" Recieved treatment after a violent encounter.");
            }
            case 3 -> {
                origin = (" Needed a Poulticier's services after an accident.");
            }
        }
        System.out.format(suitSymbol + origin);


    }

    public static void main(String[] args) throws IOException {

        makeCharacter();
        happy();



        //characterID = (characterName+characterSpecies);
       //save(characterID);

    }
}
