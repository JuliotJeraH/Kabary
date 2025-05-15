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
                // 
                if (i + 2 < this.kabary.length() && this.kabary.charAt(i + 1) == '.' && this.kabary.charAt(i + 2) == '.') {
                    point++;
                    i+=3; // 
                } else {
                    point++;
                }
            }
        }
        return point;
    }
        
    


    public int isaTeny() {
        int mot = 0;
        for (int i = 0; i < kabary.length(); i++) {
            char c = kabary.charAt(i);

            if((c == ' ' || c == ',' || c == ';')) {
                mot++;
            }
        }
        if (kabary.charAt(kabary.length() - 1) == ' ') {
            mot--;
        }
        
        return mot + 1;
    }

    public int alavankabary(int Point, int mot, int vitesse) {
        int alavankabary = mot / vitesse;
        return (alavankabary + Point) * 60;
     
    }

}