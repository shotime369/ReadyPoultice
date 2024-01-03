public class art {

    public static void main(String[] args) {
        String name = "Bob";
        String species = "Otter";
        String travel = "Slow & Steady";
        int speed = 3;
        int carry = 5;
        boolean canSoar = false;
        String Soar = null;
        if (canSoar){ Soar = "☑";}
        else Soar = "☒";


        System.out.format("""
                ╭──────────────༻༻*❀⸙┈Apawthecaria┈⸙❀*༺༺──────────────╮
                │                                                       │
                │    Name/Animal : %s %s
                │    Travel Style: %s                                    \s
                │                                       ╭───────────────│\s
                │  °     ⎧⎫     ☆                       |  Speed: %d     │
                │  * ._──││──_.°                        ╰───────────────│
                │ °  │╰------╯│  ☆                      ╭───────────────│\s
                │    ⎩        ⎭ *                       |  Carry: %d     │
                │     "──────"    ☼                     ╰───────────────│
                │                                        Soar?: %s       │
                │    Familiar:
                │    Relationship:
                │    Benefits
                │                                                       │
                ╰───────────────────────────────────────────────────────╯
               
                """,name,species,travel,speed,carry,Soar);


System.out.println("""
       
        """);
        System.out.println("""
                   _____  _  _____
                  (___  \\( )/  ___)
                    (___ | | ___)
                       /"| ("\\
                      ( (| |) )
                       `.!' .'
                        / .'\\
                        \\|/ /
                         /.<
                        (| |)
                         | '
                         `-'\
                """);
    }
}
