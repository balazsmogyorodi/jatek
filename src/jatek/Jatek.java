package jatek;

import java.util.ArrayList;

public class Jatek {

    public Jatek() {
        ArrayList<Targy> felszereles;
    }

    public void run() {
        //   System.out.println("hello");

        Karakter k1 = new Karakter("Horvát Dani", "Varázsló");
        k1.felvesz(new Targy("tigris kard", "kard"));
        k1.felvesz(new Targy("sima nyil", "nyil", "Lövésre használatos fegyver"), 8);
       // k1.inventory();
    /*    k1.hasznal("nyil", 3);
        k1.hasznal("tigris kard");
        k1.inventory();
*/
    }

}
