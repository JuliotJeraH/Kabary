public class Main {
    public static void main(String[] args){
 
        Mpikabary Mpikabary1 = new Mpikabary("Rakoto", 5,"\"Ny maty omby hono tay mahay mandrasa, ny farara feno rano tsy maneno ary ny zohim pahoriana tay mahaloa peo\" kon dia nataon ireto fianakaviana hanana anjara tsy fidiny ny tenako hitondra ny teniny eto aminareo. " +
                "\"Tompokolahy sy tompokovavy, manao azafady raha hiteny indraim-bava aminareo fa dia nomen ireto zana-drazana anjara fitenenana eto ny tena, toy ny tolo-kena avy amin andriana izao tompoko ka fady izay hozinara.");

        Mpikabary Mpikabary2 = new Mpikabary("Solofo", 2,"\"Tompokolahy sy tompokovavy, manao azafady raha hiteny indraim-bava aminareo fa dia nomen ireto zana-drazana anjara fitenenana eto ny tena, toy ny tolo-kena avy amin andriana izao tompoko ka fady izay hozinara.\" "+
                "\"Ny maty omby hono tay mahay mandrasa, ny farara feno rano tsy maneno ary ny zohim pahoriana tay mahaloa peo\" kon dia nataon ireto fianakaviana hanana anjara tsy fidiny ny tenako hitondra ny teniny ... ... . eto aminareo.");


        Mpikabary Mpikabary3 = new Mpikabary("Haja", 7,"Mankasitraka indrindra tompoko amin' izany teninareo izany. Isika mps tondra teay tokoa ity no manontra noho ny bevohoka tsy mahalala andro ka mitsauga-mitoetra" +
                "ny fianakaviana, ka ny tenako no nentiny hisolo tena sy hiteny aminareo. Ny teniny dia tsotra: 'Tiany'. Tiany ny zanakareo, tiany toy ny tenany. Ary raha olona tia tena izy, dia hanaja sy hikarakara izay tiany. Izany indrindra no fototra nijoroany sy ny fifandraisan'izy ireo...");


        // Affichage alavan-kabary
        System.out.println("Alavan-kabary 1 (en secondes): " + Mpikabary1.alavankabary(Mpikabary1.isaPoint(), Mpikabary1.isaTeny(), Mpikabary1.vitesse) + " secondes");
        System.out.println("Alavan-kabary 2 (en secondes): " + Mpikabary2.alavankabary(Mpikabary2.isaPoint(), Mpikabary2.isaTeny(), Mpikabary2.vitesse) + " secondes");
        System.out.println("Alavan-kabary 3 (en secondes): " + Mpikabary3.alavankabary(Mpikabary3.isaPoint(), Mpikabary3.isaTeny(), Mpikabary3.vitesse) + " secondes");
       


    }
}
