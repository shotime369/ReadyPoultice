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
    static boolean canSoar;
    static String familiarName;
    static String familiarSpecies;
    static String descriptor2;
    static String benefit;
    static String familiarRelationship;

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
    public static void setFamiliarRelationship(){
    switch (cardValue){
        case 1 -> familiarRelationship = """
                Chanced Upon. Until recently, you had no idea who
                    they were. Now, you get on like a house on fire.
                        Journal about the spark that started your
                        relationship’s blaze.""";
        case 2 -> familiarRelationship = """
    Companion. Your shared love runs deep. You oft
    think about each other and feel stronger together.
    Journal about when you realised you loved them.""";
        case 3 -> familiarRelationship = """
                Collaborators. You were united by a passion for
                        seeing a project or cause through to the end.
                        Journal about what you both hope to achieve.""";
        case 4 -> familiarRelationship = """
                Mentor. It can be annoying to have your reins pulled
                        in, but this wiser beast’s experience is invaluable.
                        Journal about the most important lesson they have
                        imparted to you.""";
        case 5 -> familiarRelationship = """
                Supportive. Something in common hounds you
                        both. You’ve found security in each other’s paws.
                        Journal about what you are running from.""";
        case 6 -> familiarRelationship = """
                Wildcard. Something about them absolutely
                        fascinates you—they find this entertaining.
                        Journal about why they are so cool!""";
        case 7 -> familiarRelationship = """
                Oldest Friend. You grew up together and know
                        everything about each other. Who else could you trust?
                        Journal about something embarrassing they did as
                        a cub, pup, fledgling or hatchling""";
        case 8 -> familiarRelationship = """
                Blood-bound. You agreed never to speak of it again.
                        This secret will be kept from here to Elsewhere.
                        Think about what happened. Never admit to it.""";
        case 9 -> familiarRelationship = """
                Sibling. It doesn't matter if you actually share
                        blood; you treat this rapscallion as your own family.
                        It's just a shame they can be so frustrating at
                        times! Will they ever grow up?\s
                        Journal about a lesson they keep failing to learn.""";
        case 10 -> familiarRelationship = """
                Rekindled. You once shared a very different
                        relationship. What matters presently is that you
                        need each other.\s
                        Journal about the breakup, and
                        crossing paths again.""";
        case 11 -> familiarRelationship = """
                Elsewhere. They’re gone, you’ll never see them
                        again. Still, they’re in your mind and memories, and
                        sometimes you talk.
                        Journal about something or somewhere you wish
                        you could have shown them.""";
        case 12, 13 -> familiarRelationship = """
                Parental. They nursed you from a tiny thing to a
                        fully-fledged adult. Even though you’ve flown the
                        nest, they still protectively circle you.
                        Journal about the stifling safety they provide.""";


    }

}
    public static void familiarOptions(){

        switch (cardValue){
            case 1 -> {
                descriptor2 = "Brushwise. They grew up amongst brambles and \n" +
                        "dandelions, and know many Bristley Woods plants.";
                benefit = ("-2 Rarity for all Plant Reagents.");
                System.out.println(descriptor2);
                System.out.println(benefit);
            }
            case 2 -> {
                descriptor2 = """
                        Helpful. They are full of a plethora of remedy
                        making tips. Their incredible bedside manner\s
                        soothes even the surliest beasts.""";
                benefit = ("Start all Ailment Timers with +2.");
                System.out.println(descriptor2);
                System.out.println(benefit);
            }
            case 3 -> {
                descriptor2 = """
                        Brave. Despite their comparatively small size,\s
                        they fiercely face larger threats and have a host of\s
                        daring stories.""";
                benefit = ("""
                        When you draw a ♥ or ♦ for a Travel Encounter with\s
                        a Behemoth tag h, gain a local Reagent (rarity ≤6)\s
                        and end the event positively.""");
                System.out.println(descriptor2);
                System.out.println(benefit);
            }
            case 4 ->{
                descriptor2 = """
                        Chatty. They could talk the ears off of a long
                        eared brown bat! They are an interesting travel\s
                        companion with a knack for gathering gossip""";
                benefit = ("When Bartering, -2 Base Rarity for the desired \n" +
                        "Reagent Part");
                System.out.println(descriptor2);
                System.out.println(benefit);
            }
            case 5 ->{
                descriptor2 = "Shrewd. They know the value and use of many \n" +
                        "things, and enjoy haggling for bargains.";
                benefit = ("Earn +1 Trinket when trading Remedies for Trinkets.");
                System.out.println(descriptor2);
                System.out.println(benefit);
            }
            case 6 ->{
                descriptor2 = """
                        Vigorous. Through the use of leveraging\s
                        contraptions or perhaps brute strength, your\s
                        Familiar helps you move many things.""";
                benefit = ("Gain +2 Carry (or +4 with a Wagon).");
                System.out.println(descriptor2);
                System.out.println(benefit);
            }
            case 7 ->{
                descriptor2 = """
                        Resourceful. Through friendly connection or\s
                        mysterious means, they have a knack for sourcing\s
                        a special reagent.""";
                benefit = ("""
                         Choose a Reagent (Base Rarity ≤7). Your Familiar\s
                        allows you to Forage for it in any Region. \s
                        This Reagent can be changed at the start of every\s
                        new Journey.""");
                System.out.println(descriptor2);
                System.out.println(benefit);
            }
            case 8 ->{
                descriptor2 = """
                        Seasoned. They toured the Bristley Woods more\s
                        times than they care to remember and knows\s
                        many routes.""";
                benefit = ("When drawing a Travel encounter, you may draw \n" +
                        "twice and choose the card you prefer.");
                System.out.println(descriptor2);
                System.out.println(benefit);
            }
            case 9 ->{
                descriptor2 = """
                        Perceptive. They keep a keen eye on changing\s
                        seasons and know many great spots to forage in\s
                        for the freshest Reagents.\s""";
                benefit = ("Start each Ailment with +2 Foraging Points.");
                System.out.println(descriptor2);
                System.out.println(benefit);
            }
            case 10 ->{
                descriptor2 = """
                        Independent. Whether a free spirit, easily\s
                        overwhelmed in crowds or seeking new\s
                        experiences, they often wander off on their own.\s
                        However, they always share what they find.""";
                benefit = ("""
                         Once per Ailment, your Familiar can Forage at an\s
                        Adjacent Location. Draw a card to see what they\s
                        find. They do not trigger events or reduce Timers.\s""");
                System.out.println(descriptor2);
                System.out.println(benefit);
            }
            case 11 ->{
                descriptor2 = """
                        Titanwise. Your Familiar likes delving into\s
                        Behemoth barrows and climbing the towering\s
                        Titan ruins that dot the Bristley Woods—niche but\s
                        invaluable experiences.""";
                benefit = ("""
                        -2 TITAN Reagent Rarity. While Foraging Titan and\s
                        Barrow Locations, you may draw twice and choose\s
                        the card you prefer.""");
                System.out.println(descriptor2);
                System.out.println(benefit);
            }
            case 12, 13 ->{
                descriptor2 = """
                        Ingenuitive. Your Familiar has cultivated a rather\s
                        unconventional set of incredibly useful—but\s
                        impossible to teach—skills.""";
                benefit = ("Your Familiar provides the benefits of a Tool ");
                System.out.println(descriptor2);
                System.out.println(benefit);
            }


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
            System.out.println("Error occurred writing to file: " + e);
        } finally {
            if (save != null) {
                try {
                    save.close();
                } catch (IOException ce) {
                    System.out.println("Failed to close the file: " + ce);
                }
            }
        }
    }
    public static void happy() {
        Scanner sc = new Scanner(System.in);
        //System.out.println("");
        System.out.println("\nAre you happy with your character, or would you like to start over?");
        System.out.println("""
                                    Save Character (1)\s
                                    Start New Character (2)\s
                                    Main Menu (3)\s
                """);
        System.out.print("Select your option: ");
        int option1 =  sc.nextInt();
        switch (option1) {
            case 1 -> save(characterID);
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
        System.out.format("\nEnter your species from the list above or choose your own %s animal: ", descriptor);
        characterSpecies = scanner.nextLine();
        // add error handling do not allow blank name or species *****************
        System.out.format("\nPlease choose a name for your %s : ", characterSpecies);
        characterName = scanner.nextLine();
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
        System.out.format("%s Travel style is %s- Speed %d, Carry %d",suitSymbol, travelStyle, speed, carry);
        System.out.println("\nAlternatively you may pick Swift and Soaring - Speed 5, Carry 2 (can Soar)");
        System.out.println(travelStyle + " (1)\n"
        + "Swift and Soaring (2)");
        System.out.print("Select your option: ");
        Scanner sc = new Scanner(System.in);
        int option1 =  sc.nextInt();
        switch (option1) {
            case 1 -> {
            }
            case 2 -> {
                System.out.println("You choose Swift and Soaring");
speed  = 5;
carry = 2;
canSoar = true;
            }
        }
        System.out.println("\nHow do you start out?");
        System.out.println("A dangerous world makes most beasts practical. Our origins don't often start with idle dreams but calls to action. \nWho (or what) first helped you onto your path as a Poulticepounder?");
        System.out.print("Press enter to draw a card: ");
        scanner.nextLine();
        printCard();
        String origin = getOrigin();
        System.out.format(suitSymbol + origin);
        System.out.println("Who is your familiar?");
        System.out.println("Press enter to draw a card: ");
        scanner.nextLine();
        printCard();
        speciesOptions();
        System.out.format("\nEnter your species from the list above or another %s animal: ", descriptor);
        familiarSpecies = scanner.nextLine();
        // add error handling do not allow blank name or species *****************
        System.out.format("\nPlease choose a name for the %s : ", familiarSpecies);
        familiarName = scanner.nextLine();
        System.out.format("What benefit does %s %s give you?",familiarName,familiarSpecies);
        System.out.println("Press enter to draw a card: ");
        scanner.nextLine();
        printCard();
        familiarOptions();
        System.out.format("What is your relationship with %s %s?",familiarName,familiarSpecies);
        System.out.println("Press enter to draw a card: ");
        scanner.nextLine();
        printCard();
        setFamiliarRelationship();
        System.out.println(familiarRelationship);
    }

    private static String getOrigin() {
        String origin = ("");
        switch (cardSuit) {
            case 0 -> origin = (" Inspired by a passing Poulticier, and the impression they left.");
            case 1 -> origin = (" Recruited to help elderly Poulticiers find reagents.");
            case 2 -> origin = (" Received treatment after a violent encounter.");
            case 3 -> origin = (" Needed a Poulticier's services after an accident.");
        }
        return origin;
    }

    public static void main(String[] args) {

        makeCharacter();

        characterID = (characterName+characterSpecies);
        happy();


    }
}
