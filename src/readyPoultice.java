
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import java.io.File;
import java.io.FilenameFilter;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.InputMismatchException;


public class readyPoultice {
    static String suitSymbol;
    static String cardNumber;
    static int cardValue;
    static int cardSuit;
    static String characterSpecies;
    static String descriptor;
    static String characterName;
    static String characterID;
    static String travelStyle;
    static int carry;
    static int speed;
    static boolean canSoar;
    static String origin;
    static String familiarName;
    static String familiarSpecies;
    static String descriptor2;
    static String descriptor3;
    static String benefit;
    static String familiarRelationship;
    public static void randomNPC(){

        String[] species = {"Beaver", "Dipper", "Newt", "Frog", "Finch", "Tit", "Swallow", "Jay", "Badger", "Hare",
                "Hedgehog", "Mole", "Crow", "Skylark", "Swift", "Otter", "Squirrel", "Shrew", "Dormouse",
                "Slow Worm", "Adder", "Forest Cat", "Kestrel", "Weasel", "Stoat", "Lizard", "Seagull",
                "Dove", "Bat", "Fox", "Rat", "Nightjar", "Corncrake", "Toad", "Newt", "Dunnock",
                "Little Owl", "Vole", "Capercaillie", "Pine Marten"};
        String[] personality = {
                "Witty", "Passionate", "Snide",
                "Soft", "Stoic", "Cruel",
                "Furious", "Oblivious", "Scared",
                "Joyous", "Depressed", "Evasive",
                "Immaterial", "Dreamy", "Distracted",
                "Suspicious", "Curious", "Secretive",
                "Loud", "Disgusting", "Brash",
                "Radiant", "Generous", "Energetic",
                "Cool", "Calm", "Collected",
                "Whelmed", "Draining", "Killjoy",
                "Anxious", "Skittish", "Jubilant",
                "Distant", "Righteous", "Rebellious"};
        Random random1 = new Random();
        String randSpecies = species[random1.nextInt(0,40)];
        String randPer = personality[random1.nextInt(0,36)];
        System.out.println("\n");
        System.out.println(randPer + " " + randSpecies);
        System.out.println("\n");

    }
    public static void mainMenu() {

        int option1;
        do {
            System.out.println("Main menu:");
            System.out.println("""
                                        Start New Character (1)\s
                                        Load Character (2)\s
                                        Random NPC (3)\s
                                        Journey Tracker (4)\s
                                        Exit (5)\s
                    """);
            System.out.print("Select your option: ");

                Scanner input = null;
                try {
                    input = new Scanner(System.in);
                    option1 = input.nextInt();
                    switch (option1) {
                        case 1 -> {
                            makeCharacter();
                            printSheet();
                            happy();
                        }
                        case 2 -> loadCharacter();
                        case 3 -> randomNPC();
                        case 4 -> journeyTracker();
                        case 5 -> {
                            System.out.println("Exiting Program...");
                            System.exit(0);
                        }
                        default -> System.out.println("Not an option, select 1-5");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a valid number.");
                    assert input != null;
                    input.nextLine();
                }
        }
        while (true) ;
    }
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
    public static void journeyTracker() {

        int days;
        while (true) {
            Scanner scannerDays = new Scanner(System.in);
            try {
                System.out.print("\uD83E\uDDED Please enter your Journey Length in number of days: ");
                days = scannerDays.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scannerDays.nextLine();
            }
        }
        int dayup = 1;
        System.out.println("Days remaining: " + days);
        while (true) {
            Scanner scannerEnt = new Scanner(System.in);
            System.out.print("\uD83C\uDF19 End of Day " + dayup + ", Press Enter:");
            scannerEnt.nextLine();
            dayup++;
            days--;
            if (days > 0) {
                System.out.println("\nDays remaining: " + days);
            } else {
                System.out.println("\uD83C\uDFF5️Journey complete\uD83C\uDFF5️");
                break;
            }
        }
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
            save.write(characterName +  "\n" +
                    characterSpecies + "\n" +
                    travelStyle + "\n" +
                    origin+ "\n" +
                    canSoar + "\n" +
                    speed + "\n" +
                    carry + "\n" +
                    familiarName + "\n" +
                    familiarSpecies + "\n" +
                    familiarRelationship + "\n" +
                    benefit);
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
    public static void loadCharacter(){

        try {
        //this file path will need to be changed for each user ***
                File directoryPath = new File("C:\\Users\\nescol\\IdeaProjects\\ReadyPoultice\\");
                FilenameFilter textFilefilter = (dir, name) -> {
                    String lowercaseName = name.toLowerCase();
                    return lowercaseName.endsWith(".txt");
                };
                String[] filesList = directoryPath.list(textFilefilter);
        assert filesList != null;
        for (int i = 0; i < filesList.length; i++) {
            System.out.println((i + 1) + ". " + filesList[i]);
        }
        System.out.println("Choose your file:");
        Scanner input = new Scanner(System.in);
        int fileNum = input.nextInt();
        //use user number to select the file
        System.out.println(filesList[fileNum-1]);
        String filePath = filesList[fileNum-1];
        //load the file lines to an array list
        ArrayList<String> fileLines = new ArrayList<>();

        try (Scanner scanner = new Scanner(new File(filePath))) {
            // Read each line from the file and add to the ArrayList
            while (scanner.hasNextLine()) {
                fileLines.add(scanner.nextLine());
            }
        } catch (FileNotFoundException ignored) {
        }

        characterName = fileLines.get(0);
        characterSpecies = fileLines.get(1);
        travelStyle = fileLines.get(2);
        origin= fileLines.get(3);
        canSoar= Boolean.parseBoolean(fileLines.get(4));
        speed= Integer.parseInt(fileLines.get(5));
        carry= Integer.parseInt(fileLines.get(6));
        familiarName= fileLines.get(7);
        familiarSpecies= fileLines.get(8);
        familiarRelationship= fileLines.get(9);
        benefit= fileLines.get(10);
            printSheet();
        } catch (Exception e) {
            System.out.println("File not found, you may need to change the file path to match your own directory");
            System.out.println(e.toString());
        }
}
    public static void happy() {
        Scanner sc = new Scanner(System.in);
        int option2;
        do {
            System.out.println("\nAre you happy with your character, or would you like to start again?");
            System.out.println("""
                                        Save Character (1)\s
                                        Start New Character (2)\s
                                        Main Menu (3)\s
                    """);
            System.out.print("Select your option: ");
            option2 = sc.nextInt();
            switch (option2) {
                case 1 -> {
                    save(characterID);
                    mainMenu();
                }
                case 2 -> {
                    makeCharacter();
                    printSheet();
                    happy();
                }
                case 3 -> mainMenu();
                default -> System.out.println("Not an option, select 1-3");
            }
        }
        while (option2 != 3);
    }
    public static void printSheet(){
        String Soar;
        if (canSoar){ Soar = "☑";}
        else Soar = "☒";


        System.out.format("""
                ╭───────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────╮
                │    ℙ𝕠𝕦𝕝𝕥𝕚𝕔𝕖 ℙ𝕠𝕦𝕟𝕕𝕖𝕣                                                                                                                    │
                │                                                                                                                                       │
                │    Name/Animal : %s %s
                │    Travel Style: %s
                │    Origin: %s
                │    Soar?: %s
                │───────────────╮                                                                                                                       │
                │    Speed: %d   │        °     ⎧⎫     ☆                                                                                                 │
                │───────────────╯        * ._──││──_.°                                                                                                  │
                │───────────────╮       °  │╰------╯│  ☆                                                                                                │
                │    Carry: %d   │          ⎩        ⎭ *                                                                                                 │
                │───────────────╯           "──────"    ☼                                                                                               │
                │                                                                                                                                       │
                │    Familiar: %s %s
                │    Relationship: %s
                │    Benefits: %s
                │                                                                                                                                       │
                ╰───────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────╯
               
                """,characterName,characterSpecies,travelStyle,origin,Soar,speed,carry,familiarName,familiarSpecies,familiarRelationship,benefit);

    }
    public static void makeCharacter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Who are you?");
        System.out.print("Press enter to draw a card: ");
        scanner.nextLine();
        printCard();
        speciesOptions();
        //char name
        boolean errorFlag;
        do {
            System.out.format("Enter your species from the list above or choose your own %s animal: ", descriptor);
            characterSpecies = scanner.nextLine();
            // Check if the input contains only letters
            if (!characterSpecies.matches("[a-zA-Z ]+")){
                errorFlag = true;
                System.out.println("Error: Please enter only text without numbers or special characters.");
            }
            else if (characterSpecies.isEmpty()) {
                errorFlag = true;
                System.out.println("Error: Please enter only text without numbers or special characters.");
            }
            else{
                errorFlag = false;
            }
        } while (errorFlag);

//char species
        boolean errorFlag2;
        do {
        System.out.format("Please choose a name for your %s : ", characterSpecies);
        characterName = scanner.nextLine();
            if (!characterName.matches("[a-zA-Z ]+")){
                errorFlag2 = true;
                System.out.println("Error: Please enter only text without numbers or special characters.");
        }
            else if (characterName.isEmpty()) {
                errorFlag2 = true;
                System.out.println("Error: Please enter only text without numbers or special characters.");
            }
            else{
            errorFlag2 = false;
        }
    } while (errorFlag2);

        //charID
        characterID= characterName+characterSpecies;
        System.out.format("\nYour Poulticier is %s %s\n", characterName, characterSpecies);

        //travel
        System.out.println("\nHow do you travel?");
        System.out.println("Carry determines how many items like tools and reagents you can hold. Speed affects how far you can travel when Moving.");
        System.out.print("Press enter to draw a card: ");
        scanner.nextLine();
        printCard();
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
        // travel options
        Scanner sc = new Scanner(System.in);
        int option3;
        System.out.println(travelStyle + " (1)\n"
                        + "Swift and Soaring (2)");
            System.out.print("Select your option: ");
        option3 = sc.nextInt();
        do {
            switch (option3) {
                case 1 -> {
                }
                case 2 -> {
                    System.out.println("You choose Swift and Soaring");
                    speed = 5;
                    carry = 2;
                    canSoar = true;
                }
                default -> {
                    System.out.println("not an option, please choose 1 or 2");
                    System.out.print("Select your option: ");
                    option3 = sc.nextInt();
                }
            }
        }
        while (option3 != 1 && option3 != 2);

        //starting out
        System.out.println("\nHow do you start out?");
        System.out.println("A dangerous world makes most beasts practical. Our origins don't often start with idle dreams but calls to action. \nWho (or what) first helped you onto your path as a Poulticepounder?");
        System.out.print("Press enter to draw a card: ");
        scanner.nextLine();
        printCard();
        switch (cardSuit) {
            case 0 -> origin = ("Inspired by a passing Poulticier, and the impression they left.");
            case 1 -> origin = ("Recruited to help elderly Poulticiers find reagents.");
            case 2 -> origin = ("Received treatment after a violent encounter.");
            case 3 -> origin = ("Needed a Poulticier's services after an accident.");
        }
        System.out.format(suitSymbol + origin);
        System.out.println("\n");
        System.out.println("Who is your familiar?");
        System.out.print("Press enter to draw a card: ");
        scanner.nextLine();
        printCard();
        speciesOptions();
        boolean errorFlag3;
        do {
            System.out.format("Enter your species from the list above or another %s animal: ", descriptor);
        familiarSpecies = scanner.nextLine();
            if (!familiarSpecies.matches("[a-zA-Z ]+")){
                errorFlag3 = true;
                System.out.println("Error: Please enter only text without numbers or special characters.");
            }
            else if (familiarSpecies.isEmpty()) {
                errorFlag3 = true;
                System.out.println("Error: Please enter only text without numbers or special characters.");
            }
            else{
                errorFlag3 = false;
            }
        } while (errorFlag3);

        boolean errorFlag4;
        do {
        System.out.format("Please choose a name for the %s : ", familiarSpecies);
        familiarName = scanner.nextLine();
            if (!familiarName.matches("[a-zA-Z ]+")){
                errorFlag4 = true;
                System.out.println("Error: Please enter only text without numbers or special characters.");
            }
            else if (familiarName.isEmpty()) {
                errorFlag4 = true;
                System.out.println("Error: Please enter only text without numbers or special characters.");
            }
            else{
                errorFlag4 = false;
            }
        } while (errorFlag4);



        System.out.format("\nWhat benefit does %s %s give you?",familiarName,familiarSpecies);
        System.out.print("\nPress enter to draw a card: ");
        scanner.nextLine();
        printCard();
        switch (cardValue){
            case 1 -> {
                descriptor2 = """
                        Brushwise\s
                        They grew up amongst brambles and dandelions, and know many Bristley Woods plants.""";
                benefit = ("-2 Rarity for all Plant Reagents.");
            }
            case 2 -> {
                descriptor2 = """
                        Helpful\s
                        They are full of a plethora of remedy making tips.\s
                        Their incredible bedside manner soothes even the surliest beasts.""";
                benefit = ("Start all Ailment Timers with +2.");
            }
            case 3 -> {
                descriptor2 = """
                        Brave\s
                        Despite their comparatively small size,\s
                        they fiercely face larger threats and have a host of daring stories.""";
                benefit = (" When you draw a ♥ or ♦ for a Travel Encounter with a Behemoth, gain a local Reagent (rarity ≤6) and end the event positively.");
            }
            case 4 ->{
                descriptor2 = """
                        Chatty\s
                        They could talk the ears off of a long eared brown bat!\s
                        They are an interesting travel companion with a knack for gathering gossip""";
                benefit = ("When Bartering, -2 Base Rarity for the desired Reagent Part");

            }
            case 5 ->{
                descriptor2 = """
                        Shrewd\s
                        They know the value and use of many\s
                        things, and enjoy haggling for bargains.""";
                benefit = ("Earn +1 Trinket when trading Remedies for Trinkets.");
            }
            case 6 ->{
                descriptor2 = """
                        Vigorous\s
                        Through the use of leveraging contraptions or perhaps brute strength,\s
                        your Familiar helps you move many things.""";
                benefit = ("Gain +2 Carry (or +4 with a Wagon)");
            }
            case 7 ->{
                descriptor2 = """
                        Resourceful\s
                        Through friendly connection or mysterious means,\s
                        they have a knack for sourcing a special reagent.""";
                benefit = ("Choose a Reagent (Base Rarity ≤7). Your Familiar allows you to Forage for it in any Region.");
            }
            case 8 ->{
                descriptor2 = """
                        Seasoned\s
                        They toured the Bristley Woods more times than they care to remember and knows many routes.""";
                benefit = ("When drawing a Travel encounter, you may draw twice and choose the card you prefer.");
            }
            case 9 ->{
                descriptor2 = """
                        Perceptive\s
                        They keep a keen eye on changing seasons\s
                        and know many great spots to forage in for the freshest Reagents.\s""";
                benefit = ("Start each Ailment with +2 Foraging Points.");
            }
            case 10 ->{
                descriptor2 = """
                        Independent\s
                        Whether a free spirit, easily overwhelmed in crowds or seeking new experiences,\s
                        they often wander off on their own. However, they always share what they find.""";
                benefit = ("Once per Ailment, your Familiar can Forage at an Adjacent Location. Draw a card to see what they find.");
            }
            case 11 ->{
                descriptor2 = """
                        Titanwise\s
                        Your Familiar likes delving into Behemoth barrows and climbing the towering Titan ruins that dot the Bristley Woods
                        —niche but invaluable experiences.""";
                benefit = ("-2 TITAN Reagent Rarity. While Foraging Titan and Barrow Locations, you may draw twice and choose the card you prefer.");
            }
            case 12, 13 ->{
                descriptor2 = """
                        Ingenuitive\s
                        Your Familiar has cultivated a rather unconventional set of incredibly useful —but impossible to teach— skills.""";
                benefit = ("Your Familiar provides the benefits of a Tool");
            }
        }
        System.out.println(descriptor2);
        System.out.println("🍀" + benefit);
        System.out.format("\nWhat is your relationship with %s %s?",familiarName,familiarSpecies);
        System.out.print("\nPress enter to draw a card: ");
        scanner.nextLine();
        printCard();
        switch (cardValue){
            case 1 -> {
                familiarRelationship = "Chanced Upon";
                descriptor3 = """
                    💐Until recently, you had no idea who they were. Now, you get on like a house on fire.
                    ✏ Journal about the spark that started your relationship’s blaze.""";
            }
            case 2 -> {
                familiarRelationship = "Companion";
                descriptor3 = """
                    💐Your shared love runs deep. You oft think about each other and feel stronger together.
                     ✏ Journal about when you realised you loved them.""";
            }
            case 3 -> {
                familiarRelationship = "Collaborators";
                descriptor3 = """
                    💐You were united by a passion for seeing a project or cause through to the end.
                    ✏ Journal about what you both hope to achieve.""";
            }
            case 4 -> {
                familiarRelationship = "Mentor";
                descriptor3 = """
                    💐It can be annoying to have your reins pulled in, but this wiser beast’s experience is invaluable.
                    ✏ Journal about the most important lesson they have imparted to you.""";
            }
            case 5 -> {
                familiarRelationship = "Supportive";
                descriptor3 = """
                    💐Something in common hounds you both. You’ve found security in each other’s paws.
                    ✏ Journal about what you are running from.""";
            }
            case 6 -> {
                familiarRelationship = "Wildcard";
                descriptor3 = """
                    💐Something about them absolutely fascinates you—they find this entertaining.
                    Journal about why they are so cool!""";
            }
            case 7 -> {
                familiarRelationship = "Oldest Friend";
                descriptor3 = """
                    💐You grew up together and know everything about each other. Who else could you trust?
                    ✏ Journal about something embarrassing they did as a cub, pup, fledgling or hatchling""";
            }
            case 8 -> {
                familiarRelationship = "Blood-bound";
                descriptor3 = """
                    You agreed never to speak of it again.
                    This secret will be kept from here to Elsewhere.
                    Think about what happened. Never admit to it.""";
            }
            case 9 -> {
                familiarRelationship = "Sibling";
                descriptor3 = """
                    💐It doesn't matter if you actually share blood; you treat this rapscallion as your own family.
                    It's just a shame they can be so frustrating at times! Will they ever grow up?\s
                    ✏ Journal about a lesson they keep failing to learn.""";
            }
            case 10 -> {
                familiarRelationship = "Rekindled";
                descriptor3 = """
                    💐You once shared a very different relationship.\s
                    What matters presently is that you need each other.\s
                    ✏ Journal about the breakup, and crossing paths again.""";
            }
            case 11 -> {
                familiarRelationship = "Elsewhere";
                descriptor3 = """
                    💐They’re gone, you’ll never see them again.\s
                    Still, they’re in your mind and memories, and sometimes you talk.
                    ✏ Journal about something or somewhere you wish you could have shown them.""";
            }
            case 12, 13 -> {
                familiarRelationship = "Parental";
                descriptor3 = """
                    💐They nursed you from a tiny thing to a fully-fledged adult. ;
                    Even though you’ve flown the nest, they still protectively circle you.
                    ✏ Journal about the stifling safety they provide.""";
            }
        }
        System.out.println(familiarRelationship);
        System.out.println(descriptor3);
    }
    public static void main(String[] args) {
        mainMenu();
    }
}
