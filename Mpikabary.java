public class Mpikabary {

    String nom;
    int vitesse;
    String kabary;





    public Mpikabary(String nom, int vitesse, String kabary){
        this.nom = nom;
        this.vitesse = vitesse;
        this.kabary = kabary;
    }


    public int isaPoint() {
        int point = 0;
        for (int i = 0; i < this.kabary.length(); i++) {
            if (this.kabary.charAt(i) == '.') {
                // Check if it's a single '.' and not part of "..."
                if (i + 2 < this.kabary.length() && this.kabary.charAt(i + 1) == '.' && this.kabary.charAt(i + 2) == '.') {
                    point++;
                    i+=3; // Skip the next two '.' characters
                } else {
                    point++;
                }
            }
        }
        return point;
    }
        
    


    public int isaTeny() {
        int mot = 0;
        boolean inWord = false;
        for (int i = 0; i < kabary.length(); i++) {
            char c = kabary.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                inWord = true;
            } else if ((c == ' ' || c == ',' || c == ';') && inWord) {
                mot++;
                inWord = false;
            }
        }
        if (inWord) {
            mot++; // Count the last word if it wasn't followed by a delimiter
        }
        return mot;
    }

    public int alavankabary(int Point, int mot, int vitesse) {
        int alavankabary = mot * vitesse;
        return (alavankabary + Point) * 60;
        
    }

}